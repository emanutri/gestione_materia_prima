package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

@Service
public class AssemblaggioServiceImpl implements AssemblaggioService {

	@Autowired
	private MateriaPrimaService materiaPrimaService;

	@Override
	public void inViaAssemblaggio(MateriaPrima input) {
		System.out.println(input.getDescrizione() + " in assemblaggio...");
		materiaPrimaService.aggiorna(input, StatoMateria.IN_ASSEMBLAGGIO);
	}
}
