package br.edu.insper.desagil.aps5.isail;

public class Comprador{
    private String cpf;
    private String nome;
    private int numeroOfertas;

    public Comprador(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.numeroOfertas = 0;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroOfertas() {
        return numeroOfertas;
    }

    public void incrementa() {
        numeroOfertas++;
    }
}
