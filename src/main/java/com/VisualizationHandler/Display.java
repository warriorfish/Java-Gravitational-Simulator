package com.VisualizationHandler;

import java.util.function.Consumer;

public interface Display {
    public void displayBuffer(int BitMap[]);

    public void testDisplay();

    public void initializeDisplay();
    public void initializeDisplay(Consumer<Integer> callback);
}
