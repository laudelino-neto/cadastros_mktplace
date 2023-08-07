package br.com.senai;

import br.com.senai.view.categoria.ViewConsultaCategoria;

public class Principal {

	public static void main(String[] args) {
		
		new ViewConsultaCategoria().setVisible(true);
		
		System.out.println("Aplicação inicializada com sucesso");
		
		System.out.println("A aplicação está executando em segundo plano");

	}

}
