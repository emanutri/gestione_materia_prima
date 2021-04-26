package it.prova.dao;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

public interface MateriaPrimaDao {

	public MateriaPrima get(Long id);

	public void cambiaStato(MateriaPrima materiaParam, StatoMateria statoParam);

}
