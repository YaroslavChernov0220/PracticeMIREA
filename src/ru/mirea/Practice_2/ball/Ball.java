package ru.mirea.Practice_2.ball;

public class Ball {
    private String color;
    private int weight;

    public Ball(){}
    public Ball(String color, int weight){
        this.color = color;
        this.weight = weight;
    }
    public Ball(String color){
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getColor(){
        return color;
    }

    public int getWeight(){
        return weight;
    }

    public String toString(){
        return this.color+", weight "+this.weight;
    }
}
