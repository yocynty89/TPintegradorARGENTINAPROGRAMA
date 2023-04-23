package com.mycompany.app;

import java.io.IOException;
import java.util.List;




public class Main {

    public static void main(String[] args) throws IOException {
        //   Scanner scanner = new Scanner(System.in);
      //  System.out.printf("Ingrese la ruta del archivo con los pronósticos de los partidos: ");
        // String rutaArchivoPartidos = scanner.nextLine();
        List pron = Pronostico.leerPronosticoYasignar();

        //   Scanner scanner = new Scanner(System.in);
      //  System.out.printf("Ingrese la ruta del archivo con los pronósticos de los partidos: ");
        // String rutaArchivoPronostico = scanner.nextLine();
        List part = Partido.leerPartidosYasignar();


        List puntos = ResultadosEnum.comprarPronosticoYPartido(pron, part);

        ResultadosEnum.mostrarResultados(puntos);



            //  Ronda.mostrarPuntosXRonda(puntos,pron);
        }
    }

//              C:\Users\Claudio\Desktop\TrabajoPracticoIntegrador\src\main\java\org\ComparadorPyR\resultados.csv

//              C:\Users\Claudio\Desktop\TrabajoPracticoIntegrador\src\main\java\org\ComparadorPyR\pronostico.csv
