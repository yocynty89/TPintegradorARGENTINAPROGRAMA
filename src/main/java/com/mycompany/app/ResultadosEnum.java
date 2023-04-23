package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResultadosEnum {
    static List resultados;
    public static List comprarPronosticoYPartido(List pronostico, List partidos) {
        resultados=new ArrayList();
        int x=0;
        int contadorAcerto=0;
        resultados.add(pronostico.get(0));

        for (int i = 1; i < pronostico.size() ; i++) {
            if(i%6==0){
                resultados.add(pronostico.get(i));
                i=i+1;}


                if (Objects.equals(pronostico.get(i), partidos.get(x))) {
                   // System.out.println("acerto");
                    contadorAcerto++;
                }  else {//System.out.println(" no acerto");
             ;}
                x++;
                if(x==5){
                    resultados.add(contadorAcerto);
                    x=0;
                contadorAcerto=0;};


                      }

return resultados;
        }

    public static void mostrarResultados(List puntos) {
        System.out.println("---------------------");
        System.out.println("Puntos: ");
        for ( int i = 0;
        i < puntos.size();
        i=i+2){

                System.out.println(puntos.get(i)+" : " + puntos.get(i+1));


    }System.out.println("---------------------");
    // int puntos;


    }}
