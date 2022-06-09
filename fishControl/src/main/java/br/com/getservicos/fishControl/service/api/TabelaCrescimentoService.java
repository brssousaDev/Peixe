package br.com.getservicos.fishControl.service.api;

import br.com.getservicos.fishControl.core.service.api.BaseCrudService;
import br.com.getservicos.fishControl.model.TabelaCrescimento;

import java.math.BigDecimal;
import java.util.List;

public interface TabelaCrescimentoService extends BaseCrudService<TabelaCrescimento, Integer> {
    void salvarLista(List<TabelaCrescimento> list);
    TabelaCrescimento getByPeso(BigDecimal peso);
}
