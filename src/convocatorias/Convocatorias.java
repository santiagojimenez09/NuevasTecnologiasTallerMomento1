/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convocatorias;

import java.util.ArrayList;
import java.util.Scanner;
import jugador.Jugador;

/**
 *
 * @author Santiago
 */
public class Convocatorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int opc;
        int cont=0;
        
        /*ArrayList<Jugador> jugadores=new ArrayList<>();*/
        Jugador[] jugadores=new Jugador[23];
        
        
        do{
            
            System.out.println("***Convocatorias Seleccion Colombia***");
            System.out.println("***************");
            
            System.out.println("1. Agregar jugador");
            System.out.println("2. Buscar jugador");
            System.out.println("3. Editar informacion de jugador");
            System.out.println("4. Mostrar todos los jugadores");
            System.out.println("5. Salir");
            System.out.print("Digite una opcion: ");
            opc=entrada.nextInt();
            
            switch(opc){
            
                case 1:
                    System.out.println("Registro de jugadores");
                    System.out.println("");
                    jugadores[cont]=new Jugador();
                    /*jugadores.set(cont, new Jugador());*/
                    
                    
                    
                    System.out.println("Digite el numero de la camiseta");
                    jugadores[cont].setNumeroCamiseta(entrada.nextByte());
                    /*jugadores.get(cont).setNumeroCamiseta(entrada.nextByte());*/
                    
                    
                    System.out.println("Ingrese los nombres del jugador");
                    jugadores[cont].setNombre(entrada.next());
                    /*jugadores.get(cont).setNombre(entrada.next());*/
                    
                    System.out.println("Ingrese los apellidos del jugador");
                    jugadores[cont].setApellidos(entrada.next());
                    /*jugadores.get(cont).setApellidos(entrada.next());*/
                    
                    System.out.println("Ingrese posicion del jugador");
                    jugadores[cont].setPosicion(entrada.next());
                    /*jugadores.get(cont).setPosicion(entrada.next());*/
                    
                    System.out.println("Ingrese la edad del jugador");
                    jugadores[cont].setEdad(entrada.nextByte());
                    /*jugadores.get(cont).setEdad(entrada.nextByte());*/
                    
                    System.out.println("Ingrese el equipo donde juega");
                    jugadores[cont].setEquipoOrigen(entrada.next());
                    /*jugadores.get(cont).setEquipoOrigen(entrada.next());*/
                    
                    cont=cont+1;
                    
                    
                    
                    
                     break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    
                    for(int i=0; i<cont;i++){
                    
                        System.out.println(jugadores[i].getNumeroCamiseta());
                        System.out.println(jugadores[i].getNombre());
                        System.out.println(jugadores[i].getApellidos());
                        System.out.println(jugadores[i].getPosicion());
                        System.out.println(jugadores[i].getEdad());
                        System.out.println(jugadores[i].getEquipoOrigen());
                        System.out.println("");
                    
                    }
                    
                    break;
                    
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            
            
            
            }
        
        }while(opc!=5);
        
    }
    
}
