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
@Table (name = "Status_Bombeiro")
public class StsBombeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="stb_id")
    private Integer id;
    @Column(name="stb_descricao")
    private String descricao;
    @Column(name="stb_sigla")
    private String sigla;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof StsBombeiro) {
            StsBombeiro aux = (StsBombeiro) obj;
            if (aux.getId() == null && aux.getSigla() == null) {
            if ((aux.getId().equals(this.id)) && (aux.getSigla().equals(this.sigla))) {
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
