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
public class Arreglos {
    public static void main(String[] args) {
        System.out.println("escribe el numero de episodio que quieres saber su duracion");
        Scanner scanner = new Scanner(System.in);
        int episodeIndex = scanner.nextInt();
         //como se inserta un numero para que reste preguntar instructora
        
        int [] episoDurationArray = new int [7];
        int n = episoDurationArray.length;
        episoDurationArray [0]=30;
        episoDurationArray [1]=32;
        episoDurationArray [2]=27;
        episoDurationArray [3]=31;
        episoDurationArray [4]=68;
        
        
        if(episodeIndex >= 0 && episodeIndex < 7){
            
        int episoDuration = episoDurationArray [episodeIndex];
        System.out.println("el episodio dura : "+ episoDuration + "minutos" );
        
        }else{
            System.out.println("Error, la serie tiene 5 episodios");
        }
}
}

