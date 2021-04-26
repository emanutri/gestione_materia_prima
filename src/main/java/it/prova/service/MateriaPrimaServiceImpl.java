package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.dao.MateriaPrimaDao;
import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

@Service
public class MateriaPrimaServiceImpl implements MateriaPrimaService {
	@Autowired
	private MateriaPrimaDao materiaPrimaDao;

	@Override
	public MateriaPrima caricaMateria(Long id) {
		return materiaPrimaDao.get(id);
	}

	@Override
	public void aggiorna(MateriaPrima materiaInstance, StatoMateria statoInstance) {
		materiaPrimaDao.cambiaStato(materiaInstance, statoInstance);
	}
}
