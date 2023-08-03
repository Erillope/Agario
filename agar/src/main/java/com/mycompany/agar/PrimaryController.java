package com.mycompany.agar;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import javafx.animation.AnimationTimer;

public class PrimaryController {

    @FXML
    private Pane panel;
    private ArrayList<Circulo> comidas;
    private int numComida;
    private Bolita bolita;
    private double mouseX=0;
    private double mouseY=0;
    
    @FXML
    private void initialize(){
        comidas = new ArrayList<Circulo>();
        numComida = 300;
        bolita = new Bolita(Color.BLUE, panel);
        
        Circulo.genCirculos(comidas, numComida);
        
        
        bolita.randomSpawn(0, 1300, 0, 700);
        
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                
                bolita.move(mouseX, mouseY);
                bolita.comer(comidas);
                
                
            }
        };
        panel.setOnMouseMoved(event -> {
        mouseX = event.getSceneX();
        mouseY = event.getSceneY();
        });
        timer.start();
        
    }
    
    
    
}
