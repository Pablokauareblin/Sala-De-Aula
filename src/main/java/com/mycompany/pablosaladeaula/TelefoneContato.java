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
@Table(name = "Telefone_Contato")
public class TelefoneContato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tec_id")
    private Integer id;
    @Column(name = "tec_numero")
    private String numero;
    @Column(name = "tec_tipo")
    private String tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     @Override
    public boolean equals(Object obj) {

        if (obj instanceof TelefoneContato) {
            TelefoneContato aux = (TelefoneContato) obj;
            if (aux.getId() != null && aux.getNumero() != null) {
            if ((aux.getId().equals(this.id)) && (aux.getNumero().equals(this.numero))) {
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
