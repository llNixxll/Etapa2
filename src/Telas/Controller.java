package Telas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Sala.Sala;

public class Controller {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public Controller() {
		
		emf = Persistence.createEntityManagerFactory("pessoa");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Query querry = em.createQuery("SELECT idSala FROM Sala");
		List<Sala> lista = querry.getResultList();
		em.getTransaction().commit();
		emf.close();

		System.out.println("tem = "+lista.size()+" salas");
		
		salas = lista.size();
		
	}
	
	private static int salas = 0;
	private static boolean inscricoes = false;
	
	public static boolean isInscricoes() {
		return inscricoes;
	}

	public static void setInscricoes(boolean inscricoes) {
		Controller.inscricoes = inscricoes;
	}

	public static int getSalas() {
		return salas;
	}

	public static void addSala() {
		Controller.salas++;
	}
	
}
