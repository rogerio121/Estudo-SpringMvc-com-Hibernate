package br.com.multiedro.teste;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaConexao {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("multiedro-bd");
		System.out.println("Acessou");
		factory.close();
	}
}
