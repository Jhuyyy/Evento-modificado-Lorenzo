package com.evento.enums;

import java.util.Arrays;

public enum Classificacao {
    LIVRE("Livre", 0),
    ACIMA_12_ANOS("Acima de 12 anos", 12),
    ACIMA_18_ANOS("Acima de 18 anos", 18);

    private final String descricao;
    private final int idadeMinima;

    Classificacao(String descricao, int idadeMinima) {
        this.descricao = descricao;
        this.idadeMinima = idadeMinima;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getIdadeMinima() {
        return this.idadeMinima;
    }

    public static Classificacao fromDescricao(String descricao) {
        return Arrays.stream(Classificacao.values())
                .filter(c -> c.descricao.equalsIgnoreCase(descricao))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Classificação não encontrada: " + descricao));
    }
}