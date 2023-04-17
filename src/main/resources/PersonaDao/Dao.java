package PersonaDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidad.Persona;


public class Dao  {
	
	
	EntityManager em;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
	

	
	public EntityManager entitymanager() {
		
	if(em==null) {
		
		em=emf.createEntityManager();
	}
	
	return em;	
	}
	
	
	
	public void crear(Persona persona) {
		
		
	em.getTransaction().begin();
	em.persist(persona);
	em.getTransaction().commit();	
		
		
	}
	
	public List Listarpersonas() {
		
		Query query = em.createQuery("SELECT p FROM Persona p");
		List<Persona> personas = query.getResultList();
		
		return personas;
				
		
		}
	
  public void bucar(int id) {
	  
	  em.getTransaction().begin();
	  em.find(Persona.class, 1);
	  em.getTransaction().commit();
	 
  }
  
  
  public void eliminar(int id) {
	  
	  em.getTransaction().begin();
	  em.remove(em.find(Persona.class, id));
	  em.getTransaction().commit();
  }
	
	
   	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	


