package ru.mirea.Practice1.ball;

public class MainBall {

    public static void main(String[] args) {
        Ball bl1 = new Ball("Red", 25);
        Ball bl2 = new Ball();
        Ball bl3 = new Ball("Green");
        bl2.setColor("Yellow");
        bl2.setWeight(20);
        System.out.println(bl1);
        System.out.println(bl2);
        System.out.println("Color of bl3 = " + bl3.getColor());
        System.out.println("Weight of bl3 = " + bl3.getWeight());
        System.out.println(bl3);

    }
}
