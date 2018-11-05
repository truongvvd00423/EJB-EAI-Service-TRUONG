/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.session;

import com.fpt.entity.Userss;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ueda
 */
@Stateless
public class UserssFacade extends AbstractFacade<Userss> implements UserssFacadeLocal {

    @PersistenceContext(unitName = "EJB-EAI-Service-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserssFacade() {
        super(Userss.class);
    }

    @Override
    public boolean checkLogin(String username, String password) {
        Query query = em.createNamedQuery("Userss.checkLogin");
        query.setParameter("username", username);
        query.setParameter("password", password);
        try {
            query.getSingleResult();
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    
}
