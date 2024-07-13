/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/RestController.java to edit this template
 */
package com.futbol.Futbol.Controllers;


import com.futbol.Futbol.Repository.IFutbolista;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author anonimo
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/futbolista")
public class Futbolista {
    
    @Autowired
    IFutbolista futbolistaR;
    
    @GetMapping()
    public List<com.futbol.Futbol.Entities.Futbolista> Futbolistas() {
        return futbolistaR.findAll();
    }
    
    
    @GetMapping("/{id}")
    public Optional<com.futbol.Futbol.Entities.Futbolista> get(@PathVariable long id) {
        return futbolistaR.findById(id);
    }
    
}
