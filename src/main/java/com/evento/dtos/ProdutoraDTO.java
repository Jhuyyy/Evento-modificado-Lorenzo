package com.evento.dtos;

public class ProdutoraDTO {
    private Long id;
    private String nome;
    private String cpfCnpj;

    public ProdutoraDTO() {}

    public ProdutoraDTO(Long id, String nome, String cpfCnpj) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
    }

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

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    @Override
    public String toString() {
        return "ProdutoraDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                '}';
    }
}
