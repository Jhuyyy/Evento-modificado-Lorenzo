package com.evento.enums;

import java.util.Arrays;

public enum Perfil {
    ADMINISTRADOR("Administrador", 1),
    FUNCIONARIO("Funcionário", 2),
    GERENTE("Gerente", 3);

    private final String descricao;
    private final int nivelAcesso;

    Perfil(String descricao, int nivelAcesso) {
        this.descricao = descricao;
        this.nivelAcesso = nivelAcesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public static Perfil fromDescricao(String descricao) {
        return Arrays.stream(Perfil.values())
                .filter(p -> p.descricao.equalsIgnoreCase(descricao))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Perfil não encontrado: " + descricao));
    }
}