package br.com.getservicos.fishControl.service.api;

import br.com.getservicos.fishControl.core.service.api.BaseCrudService;
import br.com.getservicos.fishControl.model.TabelaCultivo;
import br.com.getservicos.fishControl.model.Tanque;

public interface TabelaCultivoService extends BaseCrudService<TabelaCultivo, Integer> {
    TabelaCultivo getByTanque(Tanque tanque);
}
