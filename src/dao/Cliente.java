/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Cliente {
    private int id;
    private String nome;
    private String CPF;
    private String cidade;
    private ArrayList<Telefone> telefones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String endereco) {
        this.CPF = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setTelefones(ArrayList telefones){
        this.telefones = telefones;
    }
    public ArrayList<Telefone> getTelefones(){
        return this.telefones;
    }
    
}
