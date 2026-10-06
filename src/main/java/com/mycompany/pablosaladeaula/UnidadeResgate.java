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

@Entity
@Table(name = "Unidade_Resgate")
public class UnidadeResgate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unr_id")
    private Integer id;
    @Column(name = "unr_capacidade")
    private Integer capacidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
     @Override
    public boolean equals(Object obj) {

        if (obj instanceof UnidadeResgate) {
            UnidadeResgate aux = (UnidadeResgate) obj;
            if (aux.getCapacidade() != null && aux.getId() != null) {
            if ((aux.getId().equals(this.id)) && (aux.getCapacidade().equals(this.capacidade))) {
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
