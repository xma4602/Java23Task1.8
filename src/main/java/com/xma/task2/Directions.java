package com.xma.task2;

public enum Directions {
    UP("вверх", '↑', new int[]{0, 1}),
    DOWN("вниз", '↓', new int[]{0, -1}),
    LEFT("влево", '←', new int[]{-1, 0}),
    RIGHT("вправо", '→', new int[]{1, 0});

    private String title;
    private char symbol;
    private int[] vector;

    Directions(String title, char symbol, int[] vector) {
        this.title = title;
        this.symbol = symbol;
        this.vector = vector;
    }

    public String getTitle() {
        return title;
    }

    public char getSymbol() {
        return symbol;
    }

    public int[] getVector() {
        return vector;
    }
}
