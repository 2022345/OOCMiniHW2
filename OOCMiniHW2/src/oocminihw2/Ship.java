/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author suele
 */
public class Ship implements Sailable {
    private boolean sailHoisted = false;
    
    @Override 
    public void hoistSail (){
        sailHoisted = true;
    }
    
    @Override
    public void lowerSail (){
        sailHoisted = false;
    }
       
    
    @Override
    public boolean isSailHoisted (){
        return sailHoisted;
    }
    
    @Override
    public void landHo(){
        
    }
    
    
}
