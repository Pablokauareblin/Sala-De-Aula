/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pablosaladeaula;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table (name = "Auto_Escada")
public class AutoEscada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aue_id")
    private Integer id;
    @Column(name = "aue_alt_max")
    private Integer altMax;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAltMax() {
        return altMax;
    }

    public void setAltMax(Integer altMax) {
        this.altMax = altMax;
    }
     @Override
    public boolean equals(Object obj) {

        if (obj instanceof AutoEscada) {
            AutoEscada aux = (AutoEscada) obj;
            if (aux.getAltMax() != null && aux.getId() != null) {
            if ((aux.getId().equals(this.id)) && (aux.getAltMax().equals(this.altMax))) {
                return true;
            } else {
                return false;
            }}else{
                return false;
            }
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
