package it.prova.dao;

import java.util.ArrayList;
import java.util.List;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

public class DbMock {

	public static final List<MateriaPrima> materiePrime = new ArrayList<MateriaPrima>();

	static {
		MateriaPrima materiaPrima1 = new MateriaPrima(12L, "stronzio", StatoMateria.IN_VERNICIATURA);
		MateriaPrima materiaPrima2 = new MateriaPrima(13L, "acciaio", StatoMateria.IN_LAVORAZIONE);
		MateriaPrima materiaPrima3 = new MateriaPrima(14L, "furbio", StatoMateria.IN_INSERIMENTO);

		materiePrime.add(materiaPrima1);
		materiePrime.add(materiaPrima2);
		materiePrime.add(materiaPrima3);
	}

}
