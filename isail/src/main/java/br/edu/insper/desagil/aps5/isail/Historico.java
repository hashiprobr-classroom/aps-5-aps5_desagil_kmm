package br.edu.insper.desagil.aps5.isail;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<LocalDateTime> momentos;
    private List<Comprador> compradores;
    private List<Double> ofertas;
    public Historico(){
        this.momentos = new ArrayList<>();
        this.compradores = new ArrayList<>();
        this.ofertas= new ArrayList<>();
    }
    public void adicionaLance(Comprador comprador, double oferta){
        momentos.add(LocalDateTime.now());
        compradores.add(comprador);
        ofertas.add(oferta);
    }
    public int indiceMelhorLance(){
        if(ofertas.isEmpty()){
            return -1;
        }
        int maior = 0;
        for (int i = 1; i<ofertas.size();i++){
            if(ofertas.get(maior)< ofertas.get(i)){
                maior = i;
            }
        }
        return maior;
    }
    public Comprador getComprador(int indice){
        return compradores.get(indice);
    }
    public double getOfertas(int indice){
        return ofertas.get(indice);
    }

    public List<LocalDateTime> getMomentos() {
        return momentos;
    }
    public boolean isEmpty(){
        return ofertas.isEmpty();
    }
}
