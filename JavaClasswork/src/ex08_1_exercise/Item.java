/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex08_1_exercise;

/**
 *
 * @author Manex
 */
public class Item {
    char color;
    
    // declare and code the setColor method
    public boolean setColor(char c){
        if(c == ' '){
            return false;
        }else{
            this.color = c;
            return true;
        }
    }    

    
}
