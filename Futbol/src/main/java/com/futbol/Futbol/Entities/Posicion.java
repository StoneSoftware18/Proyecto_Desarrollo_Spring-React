/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.futbol.Futbol.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author anonimo
 */
@Entity
public class Posicion {
    
    @Id
    private long id;
    private String posicion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
}
