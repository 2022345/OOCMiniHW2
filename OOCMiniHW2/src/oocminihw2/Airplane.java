/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author suele
 */
public class Airplane implements Flyable{
    private float altitude = 0;
    private float speed = 0;
    private String make = "Fly";
    private String type = "Airplane";
    
    @Override
    public void accelerate (float speed){
        this.speed = speed;
    }
    
    @Override
    public void brake(){
        this.speed = 0;
    }
    
    @Override
    public void turn (float angle){
        
    }
    
    @Override 
    public float getDirection (){
        return 0;
        
    }
    
    @Override
    public float getSpeed (){
        return speed;
    }
    
    @Override
    public String getMake(){
        return make;
    }
    
    @Override
    public String getType(){
        return type;
    }
    
    @Override
    public void changeAltitude(float change){
        altitude = change;
    }
    
    @Override
    public float getAltitude(){
        return altitude;
    }
}
