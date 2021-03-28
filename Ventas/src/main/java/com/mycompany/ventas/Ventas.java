package com.mycompany.ventas;

/**
 *
 * @author INDEXHTML821
 */
import java.util.Scanner;

public class Ventas {

    private double ventaTotal;
    private int opcion;
    private int cantidad;

    Scanner in = new Scanner(System.in);

    public Ventas() {
        //Constructor
    }

    public double Venta() {

        while (opcion != -1) {
            System.out.printf("Escriba opcion %s%n",
                    "1-2-3-4-5");
            opcion = in.nextInt();
            if(opcion == -1){
                continue;
            }
            System.out.printf("Escriba cantidad%n");
            cantidad = in.nextInt();
            switch (opcion) {
                case 1:
                    ventaTotal += (2.98 * cantidad);
                    break;
                case 2:
                    ventaTotal += (4.50 * cantidad);
                    break;
                case 3:
                    ventaTotal += (9.98 * cantidad);
                    break;
                case 4:
                    ventaTotal += (4.49 * cantidad);
                    break;
                case 5:
                    ventaTotal += (6.87 * cantidad);
                    break;

            }
           

        }
         System.out.print(ventaTotal);
        return 0;
    }
}
