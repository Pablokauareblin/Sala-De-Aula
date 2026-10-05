/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pablosaladeaula;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Patente")
public class Patente {

    private Integer id;
    private String sigla;
    private String descricao;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Patente) {
            Patente aux = (Patente) obj;
            if (aux.getSigla() != null && aux.getId() != null) {
                if ((aux.getId().equals(this.id)) && (aux.getSigla().equals(this.sigla))) {
                    return true;
                } else {
                    return false;
                }
            } else {
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
