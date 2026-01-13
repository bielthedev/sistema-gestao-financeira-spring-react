
package com.app.model;

public class Despesa {
    private Long id;
    private String descricao;
    private Double valor;

    public Despesa(Long id, String descricao, Double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
