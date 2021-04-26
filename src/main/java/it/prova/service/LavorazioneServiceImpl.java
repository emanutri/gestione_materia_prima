package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

@Service
public class LavorazioneServiceImpl implements LavorazioneService {

	@Autowired
	private MateriaPrimaService materiaPrimaService;
	@Autowired
	private AssemblaggioService assemblaggioService;
	@Autowired
	private VerniciaturaService verniciaturaService;
	@Autowired
	private MessaInOperaService messaInOperaService;

	@Override
	public void inViaInLavorazione(MateriaPrima input) {

		System.out.println("inizio lavorazione...");
		System.out.println("----------------------------");

		System.out.println("inizio assemblaggio....");
		assemblaggioService.inViaAssemblaggio(input);
		System.out.println(input);
		System.out.println("fine assemblaggio...");
		System.out.println("----------------------------");

		System.out.println("inizio verniciatura....");
		verniciaturaService.inViaVerniciatura(input);
		System.out.println(input);
		System.out.println("fine verniciatura....");
		System.out.println("----------------------------");

		System.out.println("inizio messa in opera....");
		messaInOperaService.inViaMessaInOpera(input);
		System.out.println(input);
		System.out.println("fine messa in opera....");
		System.out.println("----------------------------");

		materiaPrimaService.aggiorna(input, StatoMateria.PRONTA);
		System.out.println(input);

	}
}
