/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejora1;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class peliculas2 {
    public static void main(String[] args) {
        System.out.println("¿que dia de la semana es?");
        
        Scanner scanner = new Scanner(System.in);
        int day0Week = scanner.nextInt();
                
      
        
        if (day0Week == 1){
        System.out.println("Es lunes de comedia");
        
        }else if (day0Week ==2){
            System.out.println("Es martes de drama");
        
        }else if (day0Week == 3){
            System.out.println("Es miercoles de accion");
        }else if (day0Week == 4){
            System.out.println("Jueves animadas");
        } else if (day0Week == 5){
            System.out.println("Viernes terror");
                    
        }else if (day0Week == 6){
            System.out.println("Sabado documentales");
            
         
        }else if (day0Week == 7){
            System.out.println("Domingo es comedia");
       
        
        }else{
            System.out.println("¿en que dia vives?");
        }
        
        
        
        
        
        switch (day0Week){
            case 1:
                System.out.println("el lunes es comedia");
                break;
            case 2:
                System.out.println("el martes es drama");
                break;
             case 3:
                System.out.println("el lunes es accion");
                break;   
                
            case 4:
                System.out.println("el jueves es animada");
                break;
                
            case 5:
                System.out.println("el viernes es terror");
                break;
                        
            case 6:
                System.out.println("el sabado es documentales");
                break;
            
                
            case 7:
                System.out.println("el domingo es comedia");
                break;
                
            default:
                System.out.println("¿en que dia vives?");
        }
    }
}
