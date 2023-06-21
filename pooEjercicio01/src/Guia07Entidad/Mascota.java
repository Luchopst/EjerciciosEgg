/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07Entidad;

/**
 *
 * @author User
 */
public class Mascota {
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    
    //constructor vacio
   public Mascota(){
        
    }
    //constructor con propiedades
    public Mascota(String nombre, String apodo,String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        if(tipo.equals("perro") || tipo.equals("gato") || tipo.equals("loro") || tipo.equals("conejo")){
        this.tipo = tipo;
    }
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }
    
    public void setnombre(String nombre){
        if (nombre.length()>0){
            this.nombre = nombre;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public String getnombre(){
        return this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
}