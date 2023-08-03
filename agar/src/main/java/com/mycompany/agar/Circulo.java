/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agar;
import java.util.ArrayList;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
/**
 *
 * @author Erillope
 */
public class Circulo extends Circle{
    protected static Pane myPane;
    
    public Circulo(double radio, Color color, Pane panel){
        super(radio);
        setFill(color);
        myPane = panel;
    }
    
    public void spawn(double x, double y){
        setCenterX(x);
        setCenterY(y);
        myPane.getChildren().add(this);
    }
    
    public void randomSpawn(double a, double b, double c, double d){
        double x = Math.random()*(b-a) + a;
        double y = Math.random()*(d-c) + c;
        spawn(x,y);
    }
    
    public void randomRelocate(double a, double b, double c, double d){
        double x = Math.random()*(b-a) + a;
        double y = Math.random()*(d-c) + c;
        setCenterX(x);
        setCenterY(y);
    }
    
    public static void genCirculos(ArrayList<Circulo> arr, int num){
        ArrayList<Circulo> array = new ArrayList<Circulo>();
        for (int i=0; i<num; i++){
            int r = (int)(Math.random()*255);
            int g = (int)(Math.random()*255);
            int b = (int)(Math.random()*255);
            Color randomRGB = Color.rgb(r, g, b);
            array.add(new Circulo(5, randomRGB,myPane));
        }
        for (Circulo circulo : array){
            circulo.randomSpawn(0, 1300, 0, 700);
        }
        
        arr.addAll(array);
    }

    
}
