/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author YonePC
 */
@Remote
@Stateless
public class RetornaString implements RetornaStringRemoto {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public String devuelve(String palabra) {
        return palabra;
    }
}
