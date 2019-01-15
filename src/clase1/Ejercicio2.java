/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author Lulitrix
 */
public class Ejercicio2 {

    int i;
    int suma = 0;
    int num;
    Scanner sc = new Scanner(System.in);

    public Ejercicio2() {
    }
    
    public void numPerfecos() {
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        
        for (i = 1; i < num; i++) { 
            if (num % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == num) {
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
       
    }
}




