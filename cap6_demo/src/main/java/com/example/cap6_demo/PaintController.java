package com.example.cap6_demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PaintController implements Initializable {
    private Figuras figura;
    @FXML private Canvas canvas;
    private GraphicsContext graphicsContext;

    @FXML protected void ovaloClick() {
        figura = Figuras.OVALO;
    }

    @FXML protected void rectanguloClick() {
        figura = Figuras.RECTANGULO;
    }

    @FXML protected void lineaClick() {
        figura = Figuras.LINEA;
    }

    @FXML protected void canvasMousePressed(MouseEvent e) {
        //System.out.println("PRESSED: " + e.getX() + ", " + e.getY());
    }

    @FXML protected void canvasMouseClicked(MouseEvent e) {
        //System.out.println("CLIKED: " + e.getX() + ", " + e.getY());
        if (figura == Figuras.RECTANGULO) {
            graphicsContext.strokeRect(e.getX(), e.getY(),100.0, 100.0);
        } else if (figura == Figuras.OVALO) {
            graphicsContext.strokeOval(e.getX(), e.getY(), 100.0, 100.0);
        } else if (figura == Figuras.LINEA) {
            graphicsContext.strokeLine(e.getX(), e.getY(), 100.0, 100.0);
        }
    }

    @FXML protected void canvasMouseReleased(MouseEvent e) {
        //System.out.println("RELEASED: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        graphicsContext = canvas.getGraphicsContext2D();
    }
}
