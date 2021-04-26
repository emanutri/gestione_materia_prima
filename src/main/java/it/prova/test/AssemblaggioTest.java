package it.prova.test;

import it.prova.model.MateriaPrima;
import it.prova.service.LavorazioneService;
import it.prova.spring.MyServiceFactory;

public class AssemblaggioTest {

	public static void main(String[] args) {

		LavorazioneService lavorazioneService = MyServiceFactory.getLavorazioneService();

		MateriaPrima materiale = MyServiceFactory.getMateriaPrimaService().caricaMateria(12L);

		lavorazioneService.inViaInLavorazione(materiale);

	}

}
