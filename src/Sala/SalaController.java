package Sala;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Telas.Controller;

public class SalaController {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public SalaController() {
		
		emf = Persistence.createEntityManagerFactory("pessoa");
		em = emf.createEntityManager();
		
	}
	
	public void salvar(Sala sala) {
		
		em.getTransaction().begin();
		em.merge(sala);
		em.getTransaction().commit();
		emf.close();
		
		Telas.Controller c = new Telas.Controller();
		c.addSala();
		
	}
	
	public void remover(Sala sala) {
		System.out.println(sala.getIdSala()+" - ID");
		
		em.getTransaction().begin();
		Query q = em.createNamedQuery("delete from Sala where idSala ="+sala.getIdSala());
		q.executeUpdate();
		em.getTransaction().commit();
		emf.close();
		
	}
	
	public int achaID(Sala sala) {
		
		em.getTransaction().begin();
		Query querry = em.createQuery("SELECT idSala FROM Sala where NomeSala='"+sala.getNomeSala()+"'");
		List lista = querry.getResultList();
		em.getTransaction().commit();
		emf.close();
		
		if(lista.size()==1) {
			int result = (int) lista.get(0);
			return result;
		}else {
			System.out.println("Mais de um resultado(acha)");
		}
		return 0;
	}
	
}
