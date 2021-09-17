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
        int buscar;
        int opc;
        int cont=0;
        
        /*ArrayList<Jugador> jugadores=new ArrayList<>();*/
        Jugador[] jugadores=new Jugador[23];
        
        
        do{
            
            System.out.println("***Convocatorias Seleccion Colombia***");
            System.out.println("***************");
            
            System.out.println("1. Agregar jugador");
            System.out.println("2. Buscar jugador por nro camiseta");
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
                    
                    if(cont <=23){
                    
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
                    }else{
                        System.out.println("No se pueden agregar mas jugadores");
                    }
                    
                    
                    
                     break;
                case 2:
                    
                    System.out.println("Ingrese el nro que camiseta a buscar");
                    buscar=entrada.nextInt();
                    for(int i=0;i<cont;i++){
                        if(buscar==jugadores[i].getNumeroCamiseta()){
                        
                            System.out.println("Nombre del jugador " + jugadores[i].getNombre());
                            System.out.println("Apellidos del jugador " + jugadores[i].getApellidos());
                            System.out.println("Posicion en la que juga " + jugadores[i].getPosicion());
                            System.out.println("Edad del jugador " + jugadores[i].getEdad());
                            System.out.println("Equipo donde juga " + jugadores[i].getEquipoOrigen());
                            System.out.println("");
                        
                        }else{
                        
                            System.out.println("El jugador no fue convocado");
                        
                        }
                        
                     }
               
                        
                    
                    
                    break;
                case 3:
                    
                    System.out.println("Ingrese el nro de camiseta del jugador a editar");
                    buscar=entrada.nextInt();
                    for(int i=0;i<cont;i++){
                        if(buscar==jugadores[i].getNumeroCamiseta()){
                        
                            System.out.println("Edite el nro de la camisa del jugador");
                            jugadores[i].setNumeroCamiseta(entrada.nextByte());
                            System.out.println("Nombre del jugador " + jugadores[i].getNombre());
                            System.out.println("Edite el nombre del jugador");
                            jugadores[i].setNombre(entrada.next());
                            System.out.println("Apellidos del jugador " + jugadores[i].getApellidos());
                            System.out.println("Edite el apellido del jugador");
                            jugadores[i].setApellidos(entrada.next());
                            System.out.println("Posicion en la que juga " + jugadores[i].getPosicion());
                            System.out.println("Edite la posicion del jugador");
                            jugadores[i].setPosicion(entrada.next());
                            System.out.println("Edad del jugador " + jugadores[i].getEdad());
                            System.out.println("Edite la edad del jugador");
                            jugadores[i].setEdad(entrada.nextByte());
                            System.out.println("Equipo donde juga " + jugadores[i].getEquipoOrigen());
                            System.out.println("Edite el equipo origen del jugador");
                            jugadores[i].setEquipoOrigen(entrada.next());
                            System.out.println("");
                        
                        }else{
                        
                            System.out.println("El jugador no ha sido registrado");
                        
                        }
                        
                     }
                    
                    break;
                case 4:
                    
                    for(int i=0; i<cont;i++){
                    
                        System.out.println("Numero de camiseta es " + jugadores[i].getNumeroCamiseta());
                        System.out.println("Nombre del jugador " + jugadores[i].getNombre());
                        System.out.println("Apellidos del jugador " + jugadores[i].getApellidos());
                        System.out.println("Posicion en la que juga " + jugadores[i].getPosicion());
                        System.out.println("Edad del jugador " + jugadores[i].getEdad());
                        System.out.println("Equipo donde juga " + jugadores[i].getEquipoOrigen());
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
