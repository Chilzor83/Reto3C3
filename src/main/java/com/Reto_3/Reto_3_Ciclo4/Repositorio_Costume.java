/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Reto_3.Reto_3_Ciclo4;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public class Repositorio_Costume {
    @Autowired
    private Interface_Costume crud;

    public List<Costume> getAll(){
        return (List<Costume>) crud.findAll();
    }

    public Optional<Costume> getCostume(int id){
        return crud.findById(id);
    }

    public Costume save(Costume costume){
        return crud.save(costume);
    }
    public void delete(Costume costume){
        crud.delete(costume);
    }
    
}

