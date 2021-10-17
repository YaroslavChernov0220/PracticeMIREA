package ru.mirea.Practice10.Task2;

import ru.mirea.Practice10.Task2.Chair.FunctionalChair;
import ru.mirea.Practice10.Task2.Chair.MagicChair;
import ru.mirea.Practice10.Task2.Chair.VictorianChair;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
