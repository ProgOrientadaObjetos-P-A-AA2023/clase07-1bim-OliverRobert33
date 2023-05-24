package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor2;

// OLIVER SARAGURO

public class ManjeoArrayList5 {

    public static void main(String[] args) {
        String[] lineas = {"Tara Hernandes|contratado|30",
            "Luis Andrade|factura|35", "Ana Juarez|nombramiento|40"};

        for (int i = 0; i < lineas.length; i++) {

            ArrayList<String> partes = new ArrayList<>(Arrays.asList
        (lineas[i].split("\\|")));

            Profesor2 p2 = new Profesor2(partes.get(0), partes.get(1),
                    Integer.parseInt(partes.get(2)));
            System.out.println(p2);
        }

    }
}
