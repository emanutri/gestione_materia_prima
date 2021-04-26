package it.prova.spring;

import it.prova.service.LavorazioneService;
import it.prova.service.MateriaPrimaService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyServiceFactory {

	private static ApplicationContext ctx;

	static {
		try {
			ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static LavorazioneService getLavorazioneService() {
		return ctx.getBean(LavorazioneService.class);
	}

	public static MateriaPrimaService getMateriaPrimaService() {
		return ctx.getBean(MateriaPrimaService.class);
	}
}
