package com.mycompany.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pronostico {

    private List<String> pronostico;



    public static List leerPronosticoYasignar() throws IOException {

        //   Scanner scanner = new Scanner(System.in);

        // String rutaArchivo = scanner.nextLine();
        String rutaArchivo = "C:\\Users\\Cintia\\Desktop\\TP-Argentina-Programa\\TrabajoPracticoSegundaEntrega\\src\\main\\java\\org\\ComparadorPyR\\pronostico.csv";
        List<String> lineas = Files.lines(Paths.get(rutaArchivo))
                .skip(1)  // saltar la primera línea
                .collect(Collectors.toList());

        List<String> pronostico = new ArrayList<>();

        for (int i = 0; i < lineas.size(); i++) {
            String[] datosPronostico = lineas.get(i).split(";");
            if(i==0||i%5==0){
                pronostico.add(datosPronostico[0]);
            }

            if (datosPronostico[2].equals("x")) {
                // pronostico.add(datosPronostico[0]);
                pronostico.add(datosPronostico[1]);
            } else if (datosPronostico[3].equals("x")) {
                //  pronostico.add(datosPronostico[0]);
                pronostico.add("empate");
            } else {
                //  pronostico.add(datosPronostico[0]);
                pronostico.add(datosPronostico[5]);
            }


        }


        //  System.out.println("PRONOSTICO");
        //System.out.println(pronostico);
        return pronostico;
    }}



