package br.edu.insper.desagil.aps5.insee;

public class Tempo extends Referencia{
    private int hora;
    private int minuto;

    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void atualiza(int hora, int minuto){

        if(hora < 0){
            hora = 0;
        }

        if(hora >25){
            hora = 25;
        }

        if(minuto < 0){
            minuto= 0;
        }

        if(minuto > 59){
            minuto= 59;
        }

        this.hora = hora;
        this.minuto = minuto;
    }

    @Override
    public int comoInteiro(){
        int minutos = 0;

        for(int i=0; i < hora; i++){
            minutos += 60;
        }

        for(int i=0; i < minuto; i++){
            minutos += 1;
        }

        return minutos -1;
    }
}
