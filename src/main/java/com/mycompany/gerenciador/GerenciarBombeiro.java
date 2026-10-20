/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciador;

import com.mycompany.pablosaladeaula.Bombeiro;
import com.mycompany.util.HibernateUtil;
import java.time.LocalDate;
import java.time.Month;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiro {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        System.out.println("Conexao estabelecida");
        
        Bombeiro bombeiro01 = new Bombeiro();
        bombeiro01.setCpf("12345678900");
        bombeiro01.setNomecompleto("Fulano Silva");
        bombeiro01.setGuerra("Silva");
        bombeiro01.setDatanacimento(LocalDate.of(2000, Month.MARCH, 14));   
        
        Transaction transacao = null;
        
        try{
            transacao = session.beginTransaction();
            
            session.persist(bombeiro01);
            transacao.commit();
            
            session.close();
        }catch(Exception erro){
            if (transacao != null){
                transacao.rollback();
            }
        }
        
        HibernateUtil.shutdown();
    }
}
