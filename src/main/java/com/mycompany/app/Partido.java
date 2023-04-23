package com.mycompany.app;

import com.mycompany.app.Equipo;
import com.mycompany.app.Ronda;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Partido {
    private Ronda ronda;
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;


    public static List leerPartidosYasignar() throws IOException {
        String rutaArchivo = "C:\\Users\\Cintia\\Desktop\\TrabajoIntegradorArgentina\\src\\main\\java\\com\\mycompany\\app\\resultados.csv";
        List<String> lineas = Files.lines(Paths.get(rutaArchivo))
                .skip(1)  // saltar la primera línea
                .collect(Collectors.toList());

       List <String> partido = new ArrayList<>();
        // Procesar cada línea del archivo y almacenar el resultado en el ArrayList

        for (int i = 0; i < lineas.size(); i++) {
            String[] datosPartido = lineas.get(i).split(";");



            if (Integer.parseInt(datosPartido[2]) > Integer.parseInt(datosPartido[3])) {
                partido.add(datosPartido[1]);


            } else if (Objects.equals(datosPartido[3], datosPartido[2])) {

               partido.add("empate");
            } else {
                partido.add(datosPartido[4]);

            }

            Ronda ronda = new Ronda(Integer.parseInt(datosPartido[0]));

        }//System.out.println("PARTIDO:");
       // System.out.println(partido);
        return partido;
    }


}