/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Persona;
import java.util.Iterator;
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
        Session sesion= con.openSession();
        Transaction trans= null;
        trans= sesion.beginTransaction();
        try{
        sesion.save(p);
        
        trans.commit();
        return 1;
        }catch(Exception ex){
            trans.rollback();
            return -1;
        }
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
    
    public Iterator getgente(SessionFactory con){
        Session ses = con.openSession();
        Transaction tx = ses.beginTransaction();
        try{
            
            Iterator q= ses.createQuery("FROM Persona").list().iterator();
            
            return q;
        }catch(Exception e){
            tx.rollback();
            return null;
        }
    }
}
        
    
