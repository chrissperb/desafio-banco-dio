package com.desafiobancodio;

import com.desafiobancodio.enums.TipoTransacao;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;


@Getter
@ToString
public class Transacao {
    private final LocalDateTime data;
    private final double valor;
    private final TipoTransacao tipo;

    public Transacao(double valor, TipoTransacao tipo) {
        this.data = LocalDateTime.now();
        this.valor = valor;
        this.tipo = tipo;
    }
}
