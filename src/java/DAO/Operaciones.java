/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Persona;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Angel
 */
public class Operaciones {
    
    
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
    
    public int Baja(Persona p,SessionFactory con){
        
        return 0;
    }
    
}
