package it.prova.service;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

public interface MateriaPrimaService {

	public MateriaPrima caricaMateria(Long id);

	public void aggiorna(MateriaPrima materiaInstance, StatoMateria statoInstance);

}
