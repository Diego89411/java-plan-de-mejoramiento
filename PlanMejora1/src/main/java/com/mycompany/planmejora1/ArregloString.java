/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejora1;

/**
 *
 * @author SENA
 */
public class ArregloString {
    public static void main(String[] args) {
        String[]movietitleArray = new String[]{"up","titanic","pepe toro","camacho","piratas del caribe"};
   
    for (String title : movietitleArray){
        if(title.contains("i")){
        System.out.println(title);
    }
    }
    
}
}