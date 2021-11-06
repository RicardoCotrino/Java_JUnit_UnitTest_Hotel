package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    //teste novo quarto
    void testNewRoom(){
        //massa de dados - massa
        int numeroDoQuarto = 200;
        String nomeDoQuarto = "Suíte luxo";
        double valorDiaria = 500;

        //Execução do teste
        Room quartoLuxo = new Room(numeroDoQuarto,nomeDoQuarto,valorDiaria);

        // R Resultdo
        assertEquals(numeroDoQuarto, quartoLuxo.getId());
        assertEquals(nomeDoQuarto, quartoLuxo.getName());
        assertEquals(valorDiaria, quartoLuxo.getPricePerDay());
        //assertEquals(550, quartoLuxo.getPricePerDay());
    }
    
}
