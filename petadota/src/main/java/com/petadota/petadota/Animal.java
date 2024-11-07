package com.petadota.petadota;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "O nome não pode ser vazio")
    @Size(max = 100, message = "O nome não pode exceder 100 caracteres")
    private String nome;
    
    @NotBlank(message = "O tipo não pode ser vazio")
    private String tipo;
    
    @Min(value = 0, message = "A idade deve ser maior ou igual a 0")
    private Integer idade;
    
    @NotBlank(message = "A raça não pode ser vazia")
    private String raca;
    
    @NotBlank(message = "O status de adoção não pode ser vazio")
    private String statusAdocao;
    
    @Size(max = 500, message = "A descrição não pode exceder 500 caracteres")
    private String descricao;
    
    private String imagem;

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(String statusAdocao) {
        this.statusAdocao = statusAdocao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
