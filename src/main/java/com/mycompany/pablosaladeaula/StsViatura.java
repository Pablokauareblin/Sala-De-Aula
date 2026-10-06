/*/
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
@Table(name = "Status_Viatura")
public class StsViatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stv_id")
    private Integer id;
    @Column(name = "stv_descricao")
    private String descricao;
    @Column(name = "stv_sigla")
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

        if (obj instanceof StsViatura) {
            StsViatura aux = (StsViatura) obj;
            if (aux.getSigla() != null && aux.getId() != null) {
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
