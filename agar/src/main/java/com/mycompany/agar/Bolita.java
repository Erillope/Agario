/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agar;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
/**
 *
 * @author user
 */
public class Bolita extends Circulo{
    
    private double peso=20;
    public Bolita(Color color, Pane panel){
        super(10, color, panel);

    }
    
    public void move(double x, double y){
        
        setCenterX(getCenterX()+(x-getCenterX())/peso);
        setCenterY(getCenterY()+(y-getCenterY())/peso);
        
    }
    
    public boolean estaDentro(double x, double y){
        
        return Math.pow(x-getCenterX(),2)+Math.pow(y-getCenterY(),2)<=Math.pow(getRadius(),2);
    }
    public void comer(ArrayList<Circulo> comida){
       
        for (Circulo c: comida){
            
            if (estaDentro(c.getCenterX(), c.getCenterY())){
                c.randomRelocate(0, 1300, 0, 700);
                setRadius(getRadius()+0.1);
                peso+=0.1;
                
            }
        }
        
        
    }
    
    
}
