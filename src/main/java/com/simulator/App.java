package com.Simulator;

import com.VisualizationHandler.OpenGLDisplay;

public class App {
    public static void main(String[] args) {
        OpenGLDisplay display = new OpenGLDisplay(640,420, "Hello sharks!");
        display.testDisplay();
    }
}
