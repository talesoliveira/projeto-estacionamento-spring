package com.estacionamento.beca.config;

import java.text.SimpleDateFormat;




public class DataConfig {
	
	public static String dataAtual() {
	Long data =System.currentTimeMillis();
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	String dataString = simpleDateFormat.format(data);
	return dataString;
	}
 

}
