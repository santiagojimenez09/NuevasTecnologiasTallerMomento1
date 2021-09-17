/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author Santiago
 */
public class Jugador {
    
    //ATRIBUTOS=VARIABLES=DATOS
    
    private byte numeroCamiseta;
    private String nombre;
    private String apellidos;
    private String posicion;
    private byte edad;
    private String equipoOrigen;
    
    
    //METODOS=ACCIONES=FUNCIONES ESPECIALES
    //CONSTRUCTOR
    
    public Jugador() {
        
    }
    
    //METODOS=ACCIONES=FUNCIONES

    public byte getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(byte numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        
        if(edad <=16 || edad>=40){
            System.out.println("No se puede convocar el jugador no cumple con la edad");
        }else{
            this.edad = edad;
        }
    }

    public String getEquipoOrigen() {
        return equipoOrigen;
    }

    public void setEquipoOrigen(String equipoOrigen) {
        if("medellin".equals(equipoOrigen)){
            System.out.println("El jugador no tiene el nivel para ser convocado");
        }else{
        this.equipoOrigen = equipoOrigen;
        }
    }

    
    
    

    
    
    
}
