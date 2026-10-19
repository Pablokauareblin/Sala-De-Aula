/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pablosaladeaula;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Usuario")
public class Usuario {
    
    @Id
    @Column(name = "usu_id")
    private Integer id;
    @Column (name = "usu_login")
    private String login;
    @Column (name = "usu_senha")
    private String senha;
    @OneToOne
    private Bombeiro bombeiro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Bombeiro getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }
    
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Usuario) {
            Usuario aux = (Usuario) obj;
            if (aux.getSenha() != null && aux.getId() != null) {
            if ((aux.getId().equals(this.id)) && (aux.getSenha().equals(this.senha))) {
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
