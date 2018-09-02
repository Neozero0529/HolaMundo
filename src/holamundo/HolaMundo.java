/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;
/**
 *
 * @author mamue
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.printf("Bienvenido al Comienzo de la programacion en Java!\n");
        System.out.println("Aquí mostrare las diferencias de entradas y salidas por medio de out e int via system");
       
        System.out.printf("Ingrese un nombre:");
        String yourName = input.nextLine();
        
        System.out.println("Un reuso de la variable");
        System.out.printf("Hola, %s!\n", yourName);                
        System.out.println("Aquí mostrare las diferencias de entradas y salidas por medio de out e int via system");
        System.out.println("Escribe un mensaje de bienvenida!");
        String cualQuiercosa = input.nextLine();
        System.out.println(cualQuiercosa);
    }
    
}
