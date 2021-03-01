package Pessoa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PessoaController {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public PessoaController() {
		
		emf = Persistence.createEntityManagerFactory("pessoa");
		em = emf.createEntityManager();
		
	}
	
	public void salvar(Pessoa pessoa) {
		
		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Pessoa pessoa) {
		System.out.println(pessoa.getId()+" - ID");
		
		em.getTransaction().begin();
		Query q = em.createNamedQuery("delete from Pessoa where idPessoa ="+pessoa.getId());
		q.executeUpdate();
		em.getTransaction().commit();
		emf.close();
		
	}
	
	public int achaID(Pessoa pessoa) {
		
		em.getTransaction().begin();
		Query querry = em.createQuery("SELECT idPessoa FROM Pessoa where NomePessoa='"+pessoa.getNome()+"' and SobrenomePessoa = '"+pessoa.getSobrenome()+"'");
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
