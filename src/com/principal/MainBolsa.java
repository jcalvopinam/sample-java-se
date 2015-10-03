package com.principal;

import com.beans.Chocolate;
import com.beans.Goma;
import com.genericos.Bolsa;

public class MainBolsa {

    public static void main(String[] args) {
        Bolsa<Goma> bolsaGomas = new Bolsa<Goma>(3);
        Bolsa<Chocolate> bolsaChocolates = new Bolsa<Chocolate>(5);

        bolsaGomas.add(new Goma("Shuuty", "mediano"));
        bolsaGomas.add(new Goma("Khyw", "gigante"));

        System.out.println("Bolsa de Gomitas con:\n");
        for (Goma goma : bolsaGomas) {
            System.out.println("Gomita de: " + goma.getMarca() + ", tamaño " + goma.getTamanio());
        }
        System.out.println("Cantidad de gomitas en la bolsa: " + bolsaGomas.getNumeroElementos() + "/" + bolsaGomas.getCapacidad() + "\n");

        bolsaChocolates.add(new Chocolate("Ferrero", "avellanas"));
        bolsaChocolates.add(new Chocolate("Noggi", "pasas"));
        bolsaChocolates.add(new Chocolate("Suizo", "nuez"));
        bolsaChocolates.add(new Chocolate("Manicho", "mani"));

        for (int i = 0; i < 50; i++) {
            System.out.print("_");
        }
        
        System.out.println("\n\nBolsa de Chocolates con:\n");
        for (Chocolate chocolate : bolsaChocolates) {
            System.out.println("Chocolates de: " + chocolate.getMarca() + ", con relleno de: " + chocolate.getRelleno());
        }
        System.out.println("Cantidad de chocolates en la bolsa: " + bolsaChocolates.getNumeroElementos() + "/" + bolsaChocolates.getCapacidad());
    }
}
