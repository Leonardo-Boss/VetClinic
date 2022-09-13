/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.systemvetclinic.model;

/**
 *
 * @author Leonardo Boss 
 */
public class ClientDAO {
    public int create (String name, long cpf) {
        // Database creation part
        
        // Object initialization part
        Client client;
        client.setname(name);
        client.setcpf(cpf);
        
        return client;
    }
    
    public int update(Client client) {
        // Database update part

        return 0;
    }
    
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