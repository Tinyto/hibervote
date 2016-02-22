/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Persona;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Operaciones {
    
    /**
     *
     * @author Tiny
     */
    public int Alta(Persona p,SessionFactory con){
        
        return 0;
    }
    /**
     *
     * @author Angel
     */
    public int Baja(Persona p,SessionFactory con){
        
       Session ses = con.openSession();
        Transaction tx = ses.beginTransaction();
        try{
        Query q = ses.createQuery("FROM Persona WHERE dni= :nif");
        q.setParameter("nif", p.getDni());
        Persona e=(Persona)q.uniqueResult();
        ses.delete(e);
        }catch(Exception e){
            
            tx.rollback();
            return -1;
        }
        tx.commit();
        return 1;
    }
    
}
