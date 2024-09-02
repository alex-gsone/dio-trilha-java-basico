package com.simulacao.iphone;

public class Iphone {

	public static void main(String[] args) {
		Internet web = new Internet();
		PlayerMusica reprodutorMusical = new PlayerMusica();
		Telefone telefone = new Telefone();
		
		reprodutorMusical.app();
		telefone.app();
		web.app();
		
	}
}
