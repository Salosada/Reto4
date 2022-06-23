/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto4;
import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Bienvenido al menu, ingrese un numero del 1 al 6");
        
        System.out.println("1. Agregar Venta");
        System.out.println("2. Agregar Panel");
        System.out.println("3. Agregar seguro");
        System.out.println("4. Mostrar todas las ventas");
        System.out.println("5. Mostrar todos los paneles");
        System.out.println("6. Mostrar todos los seguros");
        
        Scanner teclado = new Scanner(System.in);
        char caracter;
        caracter = teclado.next().charAt(0);
        
        switch(caracter){
            case '1':
                System.out.println("Se agregará una Venta");
                menu();
                break;
            case '2':    
                System.out.println("Se agregará un Panel");
                menu();
                break;
                
            case '3':    
                System.out.println("Se agregará un Seguro" );
                menu();
                break;
                
            case '4':
                System.out.println("A continuación se mostrarán todas las ventas");
                menu();
                break;
            case '5':
                System.out.println("A continuación se mostrarán todos los paneles");
                menu();
                break;
            case '6':
                System.out.println("A continuación se mostrarán todos los seguros");
                menu();
                break;
            default:
                System.out.println("Ingrese un valor valido");
                menu();
                break;
                
        }
    }
}
