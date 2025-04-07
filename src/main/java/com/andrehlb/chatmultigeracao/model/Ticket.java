package com.andrehlb.chatmultigeracao.model;

public class Ticket {
    private Long id;
    private String descricao;
    private String status;

    // Construtores
    public Ticket() {}

    public Ticket(Long id, String descricao, String status) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
