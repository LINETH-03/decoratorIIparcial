package org.formacion.decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos {
	
	public Logger logger;
	public BaseDatos basedatos;
	
	



	public LoggerDecorator(BaseDatos basedatos, Logger logger) {
		this.basedatos=basedatos;
		this.logger=logger;
	}

	
	@Override
	public void inserta(String registro) {
		logger.add("inserta"+registro);
		basedatos.inserta(registro);
	}

	@Override
	public List<String> registros() {
		logger.add("lectura");
		return basedatos.registros();
	}

	

}
