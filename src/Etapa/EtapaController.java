package Etapa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EtapaController {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public EtapaController() {
		
		emf = Persistence.createEntityManagerFactory("pessoa");
		em = emf.createEntityManager();
		
	}
	
	public void salvar(Etapa etapa) {
		
		em.getTransaction().begin();
		em.merge(etapa);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Etapa etapa) {
		
		em.getTransaction().begin();
		Query q = em.createNamedQuery("delete from Etapa where idEtapa ="+etapa.getIdEtapa());
		q.executeUpdate();
		em.getTransaction().commit();
		emf.close();
		
	}
	
}
