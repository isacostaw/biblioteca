package br.com.senai.teste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.GenerationType;

@Entity 
@Table (name="aluno")
public class Aluno {
    @Id 
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
   @NotBlank  (message = " O nome do aluno não pode ser vazio ")
    private String nome;
    @NotBlank (message="O email é obrigatório")
    private String email;

    public Aluno() {
    }

    public Aluno( String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public int getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email ){
        this.email = email;
    }
    public String getNome(){
        return nome;
    } 
    public void setNome(String nome){
        this.nome = nome;
    }
}
