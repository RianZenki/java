/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursoemvideo.operadores;

/**
 *
 * @author Nacazato
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        
        System.out.println("A média é igual a: " + m);*/
        
        /*
        //Incremento
        int numero = 5;
        numero += numero++;
        System.out.println(numero);
        */
        
        /*
        // Metedos da biblioteca Math
        float v = 8.5f;
        
        int floor = (int) Math.floor(v); // Arredonda para baixo
        int ceil = (int) Math.ceil(v); // Arredonda para cima
        int round = Math.round(v); // Arredondamento aritmetico
        float abs = Math.abs(v); // Valor absoluto
        
        System.out.println("Valor de V: " + v);
        System.out.println("Arredondado para baixo: " + floor);
        System.out.println("Arredondado para cima: " + ceil);
        System.out.println("Arredondamento aritmetico: " + round);
        System.out.println("Valor absoluto: " + abs); // Tira parte negativa
        */
        
        // Gerador de numero aleatorio
        double ale = Math.random(); // gera um numero entre 0 a 1
        int n = (int) (5 + Math.random() * (10-5)); // gera um numero entre 5 a 10
        System.out.println(n);
        
    }
    
}
