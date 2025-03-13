package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AgendaTest {
    private Agenda a;

    @BeforeEach
    void setUp(){
        a = new Agenda();
    }

    @Test
    void constroi(){
        assertEquals(0, a.getEventos().size());
    }

    @Test
    void adicionaValido(){
        Evento evento = mock(Evento.class);
        a.adiciona(evento);
        assertEquals(1, a.getEventos().size());
    }

    @Test
    void adicionaInvalido(){
        Evento evento = mock(Evento.class);
        when(evento.valido()).thenReturn(false);

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            a.adiciona(evento);
        });
        assertEquals("Evento inválido!", e.getMessage());


    }
}
