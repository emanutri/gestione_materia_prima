package it.prova.dao;

import org.springframework.stereotype.Component;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

@Component
public class MateriaPrimaDaoImpl implements MateriaPrimaDao {

	@Override
	public MateriaPrima get(Long id) {
		for (MateriaPrima materiaPrimaItem : DbMock.materiePrime) {
			if (materiaPrimaItem.getId() == id)
				return materiaPrimaItem;
		}
		return null;
	}

	@Override
	public void cambiaStato(MateriaPrima materiaParam, StatoMateria statoParam) {
		for (MateriaPrima materiaPrimaItem : DbMock.materiePrime) {
			if (materiaPrimaItem.getId() == materiaParam.getId())
				materiaParam.setStato(statoParam);
		}
	}
}
