/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.practicajunit;

/**
 *
 * @author DANA
 */
public class Circulo {

    /**
     * @param radio El valor del radio del circulo
     */
    private double radio;

    /**
     * Constructor vacio Inicializa a 0 el radio.
     */
    public Circulo() {
    }

    /**
     * Constructor
     *
     * @param radio Recibe el radio del nuevo objeto
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Devuelve el área del círculo.
     *
     * @return double, el valor del área.
     */
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Calcula y devuelve el valor del perímetro del círculo.
     *
     * @return double, El valor del perímetro
     */
    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }

    /**
     * @return radio double, devuelve el valor del radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Introduce un nuevo valor para el radio.
     *
     * @param radio double, el valor del radio nuevo.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * metodo que mostrará el nombre de la clase del objeto
     */
    public void mostrarNombre() {
        System.out.println("Datos del " + this.getClass().getSimpleName());
        System.out.println("------------------");
    }

    /**
     *
     * @param circulito, objeto de tipo Circulo
     * @return Devuelve el radio del objeto pasado
     */
    public static double mostrarRadio(Circulo circulito) {
        return circulito.radio;
    }
     /**
     * 
     * @param circulo1,  objeto de tipo Circulo
     * @param circulo2,  objeto de tipo Circulo
     * @return devuelve el objeto de tipo Circulo  que sea mayor
     */
    public static Circulo mayorCirculo(Circulo circulo1, Circulo circulo2) {
        if (circulo1.radio >= circulo2.radio) {
            return circulo1;
        } else {
            return circulo2;
        }
    }

    
}
