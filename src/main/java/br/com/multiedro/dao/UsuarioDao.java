package br.com.multiedro.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.multiedro.modelo.Usuario;

public class UsuarioDao {
	private EntityManager manager;
	
	public UsuarioDao() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("multiedro-bd");
		
		manager = factory.createEntityManager();
//		factory.close();
	}
	
	public void salva(Usuario usuario) {
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		
		manager.close();
	}
	
	public void atualiza(Usuario usuario) {
		manager.getTransaction().begin();
		manager.merge(usuario);
		manager.getTransaction().commit();
		
		manager.close();
	}
}
