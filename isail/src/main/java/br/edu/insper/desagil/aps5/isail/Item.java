package br.edu.insper.desagil.aps5.isail;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nome;
    private double minimo;
    private Historico historico;

    public Item(String nome, double minimo) {
        this.nome = nome;
        this.minimo = minimo;
        this.historico = new Historico();
    }

    public String getNome() {
        return nome;
    }

    public void fazLance(Comprador comprador, double oferta) {
        if (oferta < minimo) {
            return;
        }

        if (!historico.isEmpty()) {
            int maior = historico.indiceMelhorLance();
            if (oferta <= historico.getOfertas(maior)) {
                return;
            }
        }

        historico.adicionaLance(comprador,oferta);
        comprador.incrementa();
    }

    public void imprimeMelhorLance() {
        if (historico.isEmpty()) {
            System.out.println("Nenhum lance foi feito ainda!");
        } else {
            int maior = historico.indiceMelhorLance();
            System.out.println(historico.getComprador(maior) + " ofereceu " + historico.getOfertas(maior) + " (" + historico.getMomentos().toString() + ")");
        }
    }
}
