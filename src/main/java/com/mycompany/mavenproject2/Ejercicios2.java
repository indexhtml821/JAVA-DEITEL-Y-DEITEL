package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Ejercicios2 {

    public static void main(String args[] ) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Escriba un número");
            int num = in.nextInt();
            for (int j = 1; j <= num; j++) {
                System.out.print("* "+ j);
            }
            System.out.println("");
        }

    }

}
