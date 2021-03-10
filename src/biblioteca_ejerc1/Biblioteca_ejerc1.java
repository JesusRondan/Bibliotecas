/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_ejerc1;

import java.util.Scanner;

/**
 *
 * @author ema_2
 */
public class Biblioteca_ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1 = new Libro();
        System.out.println("informacion de mi clase libro1: " + libro1.toString());
        
        libro1.setTitulo("mi planta de naranja lima");
        libro1.setAutor("Jose M. Vasconcello");
        libro1.setCantidadEjemplares(5);
        System.out.println("informacion de mi clase libro1: \n" + libro1.toString());
        
        Scanner sc = new Scanner(System.in);
        int opcion = 999;
        while(opcion != 0)
        {
            System.out.println("ingrese la opcion: (1: prestar - 2: devolver - 0: salir)");
            opcion = sc.nextInt();
            switch(opcion)
            {
                case 0:
                    System.out.println("bye bye");
                    break;
                case 1: 
                    if (libro1.prestamo()) {
                        System.out.println("Prestamo realizado con exito!");
                    } else {
                      System.out.println("no cuenta con libros disponibles");
                    }
                    break;
                case 2:
                    if (libro1.devolucion()) {
                        System.out.println("Devolución realizada con exito!");
                    } else {
                      System.out.println("No cuenta con libros prestados");
                    }
                    break;
                default: System.out.println("opcion incorrecta, ingrese nuevamente:");  
                        opcion = sc.nextInt();              
            }       
        
        }
                 
                Libro libro2 = new Libro("El Principito","Antoine de Saint-Exupéry", 3);
                
                libro1.controlarIgualdad(libro2);
                libro1.controlarIgualdad(libro1);
                libro2.controlarIgualdad(new Libro());
                libro2.controlarIgualdad(new Libro("El Principito","Antoine de Saint-Exupéry", 5));
               
        
        
        
       System.out.println("Saliendo de la biblioteca...: \n" + libro1.toString());

    
}
}
