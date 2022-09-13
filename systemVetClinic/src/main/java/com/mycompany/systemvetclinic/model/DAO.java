/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.systemvetclinic.model;

/**
 *
 * @author Leonardo Boss 
 */
public abstract class DAO {
    public abstract int create ();
    
    public int update();
    
    public int retrieve (long cpf) {
        // Database retrieve part
        
        // Object initalization part
        
        return 0;
    }
    
    public int delete (long cpf) {
        // Database deletion part
        return 0;
    }
}
