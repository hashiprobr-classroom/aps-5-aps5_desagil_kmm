package br.edu.insper.desagil.aps5.insee;

import java.util.HashMap;
import java.util.Map;

public class Data extends Referencia{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer,Integer> limites;

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        this.limites = new HashMap<>();

        //dicionario
        limites.put(1, 31);
        limites.put(2, 28);
        limites.put(3, 31);
        limites.put(4, 30);
        limites.put(5, 31);
        limites.put(6, 30);
        limites.put(7, 31);
        limites.put(8, 31);
        limites.put(9, 30);
        limites.put(10, 31);
        limites.put(11, 30);
        limites.put(12, 31);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }


    public void atualiza(int ano, int mes, int dia){

        if (ano < 1970){
            ano = 1970;
        }

        if (mes < 1){
            mes = 1;
        }

        else if (mes > 12){
            mes = 12;
        }

        if (dia < 1){
            dia = 1;
        }

        else if (dia > limites.get(mes)){
            dia = limites.get(mes);
        }

        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    @Override
    public int comoInteiro(){
        int dias = 0;

        for(int i = 1970; i < this.ano; i++){
            dias += 365;
        }

        for(int i = 1; i < this.mes; i++){
            dias += limites.get(i);
        }

        for(int i = 1; i < this.dia; i++){
            dias += 1;
        }

        return dias;
    }
}
