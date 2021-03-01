package Cafe;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CafeController {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public CafeController() {
		
		emf = Persistence.createEntityManagerFactory("pessoa");
		em = emf.createEntityManager();
		
	}
	
	public void salvar(Cafe cafe) {
		
		em.getTransaction().begin();
		em.merge(cafe);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Cafe cafe) {
		System.out.println(cafe.getIdCafe()+" - ID");
		
		em.getTransaction().begin();
		Query q = em.createNamedQuery("delete from Cafe where idCafe ="+cafe.getIdCafe());
		q.executeUpdate();
		em.getTransaction().commit();
		emf.close();
		
	}
	
	public int achaID(Cafe cafe) {
		
		em.getTransaction().begin();
		Query querry = em.createQuery("SELECT idCafe FROM Cafe where NomeCafe='"+cafe.getNomeCafe()+"'");
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
