/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejora1;

/**
 *
 * @author SENA
 */
public class Arreglo2 {
    public static void main(String[] args) {
        int[] episodeDurationArray = new int []{30,32,27,31,60};
        int n = episodeDurationArray.length;
        
        int seasonDuration = 0;
        
        for (int i=0 ; i<n ; i ++){
        
        seasonDuration =seasonDuration +episodeDurationArray[i];
        }
        
            System.out.println(seasonDuration);
        }
    }
    

