/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pablosaladeaula;

import com.google.protobuf.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Bombeiro")
public class Bombeiro {
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bom_id")
    private Integer id;
    @Column(name = "bom_nome_completo", length = 11, unique = true)
    private String nomecompleto;
    @Column(name = "bom_cpf", length = 11, unique = true)
    private String Cpf;
    @Column(name = "bom_data_nacimento", nullable = false, length = 45)
    private LocalDate datanacimento;
    @Column(name = "bom_nome_guerra", length = 45, nullable = false, unique = true)
    private String guerra;
    @OneToOne(mappedBy = "bombeiro")
    private Usuario usuario;
    @OneToMany (mappedBy = "bombeiro")
    private Set<TelefoneContato> telefone = new HashSet<TelefoneContato>();
    @ManyToMany
    @JoinTable (name = "Bombeiro_has_Patente", joinColumns = @JoinColumn(name = "bom_id"))
    
    private Set<Patente> patente = new HashSet<Patente>();
    
    public Bombeiro() {

    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        this.Cpf = cpf;
    }

    public LocalDate getDatanacimento() {
        return datanacimento;
    }

    public void setDatanacimento(LocalDate datanacimento) {
        this.datanacimento = datanacimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public String getGuerra() {
        return guerra;
    }

    public void setGuerra(String guerra) {
        this.guerra = guerra;
    }
    
/*
    public Set<Patente> getPatente() {
        return patente;
    }
    
    public void setPatente(Set<Patente> patente) {
        this.patente = patente;
    }
*/

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;
            if (aux.getCpf() != null && aux.getId() != null) {
            if ((aux.getId().equals(this.id)) && (aux.getCpf().equals(this.Cpf))) {
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
