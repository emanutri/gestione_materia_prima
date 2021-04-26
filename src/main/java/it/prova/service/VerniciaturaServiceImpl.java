package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

@Service
public class VerniciaturaServiceImpl implements VerniciaturaService {

	@Autowired
	private MateriaPrimaService materiaPrimaService;

	@Override
	public void inViaVerniciatura(MateriaPrima input) {
		System.out.println(input.getDescrizione() + " in verniciatura...");
		materiaPrimaService.aggiorna(input, StatoMateria.IN_VERNICIATURA);
	}
}
