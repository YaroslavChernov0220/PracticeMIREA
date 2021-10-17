package ru.mirea.Practice10.Task2;

import ru.mirea.Practice10.Task2.Chair.FunctionalChair;
import ru.mirea.Practice10.Task2.Chair.MagicChair;
import ru.mirea.Practice10.Task2.Chair.VictorianChair;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicanChair();
    public FunctionalChair createFunctionalChair();
}
