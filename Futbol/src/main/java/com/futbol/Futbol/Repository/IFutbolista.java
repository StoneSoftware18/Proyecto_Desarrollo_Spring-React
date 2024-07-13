/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/Repository.java to edit this template
 */
package com.futbol.Futbol.Repository;

import com.futbol.Futbol.Entities.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author anonimo
 */
public interface IFutbolista extends JpaRepository<Futbolista, Long> {
    
}
