package com.mycompany.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ronda {
    private String persona;
    private int numRonda;

    public Ronda(int parseInt) {
        this.numRonda=parseInt;
    }


    public static void mostrarPuntosXRonda(int puntos, List pron) {
        System.out.println("PARTICIPANTE "+pron.get(0));
        System.out.println("PUNTOS : "+ puntos);}}
