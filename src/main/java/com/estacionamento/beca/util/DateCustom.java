package com.estacionamento.beca.util;

import java.util.Date;

public class DateCustom {

	static Date horaAtual = new Date();

	public static Date getDiaHora() {
		return horaAtual;
	}

	public static void setDiaHora(Date diaHora) {
		DateCustom.horaAtual = diaHora;
	}

}
