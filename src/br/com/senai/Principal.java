package br.com.senai;

import br.com.senai.view.categoria.ViewConsultaCategoria;

public class Principal {

	public static void main(String[] args) {
		new ViewConsultaCategoria().setVisible(true);
		System.out.print("O sistema foi inicializado com sucesso");
	}

}
