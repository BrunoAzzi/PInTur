/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author brunoazzi
 */
public class Conexao {

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("PInTurPU");
    private static final EntityManager em = factory.createEntityManager();

    protected static void getTransaction() {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
    }

    protected static void commit() {
        if (em.getTransaction().isActive()) {
            em.getTransaction().commit();
        }
    }

    protected static void persist(Object aThis) {
        getTransaction();
        em.persist(aThis);
        commit();
    }

    protected static void remove(Object aThis) {
        getTransaction();
        em.remove(aThis);
        commit();
    }
    
    protected static List<Object> namedQuery(String namedQuery){
        Query query = em.createNamedQuery(namedQuery);
        return query.getResultList();
    }

    protected static List<Object> namedQuery(String namedQuery, List<Object> values, String[] parameters) {
        Query query = em.createNamedQuery(namedQuery);

        for (int iterador = 0; iterador < values.size(); iterador++) {
            query.setParameter(parameters[iterador], values.get(iterador));
        }

        return query.getResultList();
    }

    protected static List<Object> namedQuery(String namedQuery, Object value, String parameter){
        Query query = em.createNamedQuery(namedQuery);
        query.setParameter(parameter, value);
        return query.getResultList();
    }
    
    protected static Object singleResultNamedQuery(String namedQuery, List<Object> values, String[] parameters){
        Query query = em.createNamedQuery(namedQuery);

        for (int iterador = 0; iterador < values.size(); iterador++) {
            query.setParameter(parameters[iterador], values.get(iterador));
        }

        return query.getSingleResult();
    }
    
    protected static Object singleResultNamedQuery(String namedQuery, Object value, String parameter) {
        Query query = em.createNamedQuery(namedQuery);
        query.setParameter(parameter, value);
        return query.getSingleResult();
    }
    
    public static void endConnection(){
        if(em.isOpen()) em.close();
        factory.close();
    }
    
    
}
