package br.com.getservicos.fishControl.service;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.EntradaPeixe;
import br.com.getservicos.fishControl.model.TabelaCrescimento;
import br.com.getservicos.fishControl.model.TabelaCultivo;
import br.com.getservicos.fishControl.repository.EntradaPeixeRepository;
import br.com.getservicos.fishControl.service.api.EntradaPeixeService;
import br.com.getservicos.fishControl.service.api.TabelaCrescimentoService;
import br.com.getservicos.fishControl.service.api.TabelaCultivoService;
import br.com.getservicos.fishControl.service.api.TanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class EntradaPeixeServiceImpl  extends AbstractCrudService<EntradaPeixe, Integer> implements EntradaPeixeService {

    @Autowired
    EntradaPeixeRepository entradaPeixeRepository;

    @Autowired
    TabelaCultivoService tabelaCultivoService;

    @Autowired
    TabelaCrescimentoService tabelaCrescimentoService;

    @Autowired
    TanqueService tanqueService;

    @Override
    public JpaRepository getRepository() {
        return entradaPeixeRepository;
    }

    @Override
    public EntradaPeixe save(EntradaPeixe entity) throws Exception {

        TabelaCrescimento tabelaCrescimento = new TabelaCrescimento();
        tabelaCrescimento = tabelaCrescimentoService.getByPeso(entity.getPeso());

        if(tabelaCrescimento==null) {
            throw new Exception("Não existe semana na tabela crescimento para o Peso informado.");
        }

        TabelaCultivo tabelaCultivo = new TabelaCultivo();
        tabelaCultivo = tabelaCultivoService.getByTanque(tanqueService.findById(entity.getTanque().getId()));
        if(tabelaCultivo!=null && tabelaCultivo.getId()!=null){
            if(tabelaCultivo.getSemana().getSemana().equals(tabelaCrescimento.getSemana())){
                tabelaCultivo.setQuantidade(tabelaCultivo.getQuantidade() + entity.getQuantidade());
                tabelaCultivo.setUltimaAtualizacao(new Date());
                tabelaCultivoService.update(tabelaCultivo);
            } else {
                throw new Exception("Não é possivel realizar entradas com semanas de crescimento diferentes.");
            }
        } else {
            tabelaCultivoService.save(new TabelaCultivo(
                    entity.getTanque(),
                    entity.getPeixe(),
                    tabelaCrescimento,
                    entity.getQuantidade(),
                    new Date()));
        }
        return super.save(entity);
    }
}
