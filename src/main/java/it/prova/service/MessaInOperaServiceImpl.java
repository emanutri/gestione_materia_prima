package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

@Service
public class MessaInOperaServiceImpl implements MessaInOperaService {

	@Autowired
	private MateriaPrimaService materiaPrimaService;

	@Override
	public void inViaMessaInOpera(MateriaPrima input) {
		System.out.println(input.getDescrizione() + " in messa in opera...");
		materiaPrimaService.aggiorna(input, StatoMateria.IN_MESSA_IN_OPERA);
	}
}
