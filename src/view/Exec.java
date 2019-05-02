package view;

import model.PessoaFisica;

public class Exec {
	
	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Lucas Garcia Pereira");
		pf.setEndereco("Rua 13");
		
		System.out.println("Nome :" + pf.getNome());
		System.out.println("Endereço :" + pf.getEndereco());
		
	}

}
