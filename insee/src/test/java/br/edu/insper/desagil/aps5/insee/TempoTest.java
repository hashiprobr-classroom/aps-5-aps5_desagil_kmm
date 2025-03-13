package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TempoTest {
    private Tempo t;

    @BeforeEach
    void setUp(){
        t = new Tempo();
    }

    @Test
    void constroi(){
        assertEquals(0, t.getMinuto());
        assertEquals(0, t.getHora());
    }

    @Test
    void naoAtualizaMenor(){
        t.atualiza(-1,-1);
        assertEquals(0, t.getMinuto());
        assertEquals(0, t.getHora());
    }

    @Test
    void atualizaMenor(){
        t.atualiza(24,60);
        assertEquals(59, t.getMinuto());
        assertEquals(23, t.getHora());
    }

    @Test
    void atualiza(){
        t.atualiza(15,30);
        assertEquals(30, t.getMinuto());
        assertEquals(15, t.getHora());
    }

    @Test
    void comoZero(){
        assertEquals(0,t.comoInteiro());
    }

    @Test
    void comoAgora(){
        t.atualiza(15,30);
        assertEquals(930,t.comoInteiro());
    }
}
