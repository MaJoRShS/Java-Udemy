package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		//Aqui estamos inserindo todos os dados direto no banco de dados sem nem ter que criar uma tabela la.
//		Pessoa p1 = new Pessoa(null, "Lucas Rodrigues", "lukas.mr@hotmail.com");
//		Pessoa p2 = new Pessoa(null, "Fernanda Rodrigues", "fernanda.mr@hotmail.com");
//		Pessoa p3 = new Pessoa(null, "Arthur Rodrigues", "arthur.mr@hotmail.com");
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
//		System.out.println("Pronto!");
//		
//		em.close();
//		emf.close();
		
		
		//Buscar dados do banco
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//		EntityManager em = emf.createEntityManager();
//		
//		Pessoa p = em.find(Pessoa.class, 2);
//		
//		System.out.println(p);
//		
//		System.out.println("Pronto!");
//		em.close();
//		emf.close();
		
		
		//Remover dado
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
