/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.session;

import com.fpt.entity.Userss;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ueda
 */
@Local
public interface UserssFacadeLocal {

    void create(Userss userss);

    void edit(Userss userss);

    void remove(Userss userss);

    Userss find(Object id);

    List<Userss> findAll();

    List<Userss> findRange(int[] range);

    int count();
    
    boolean checkLogin(String username, String password);
    
}
