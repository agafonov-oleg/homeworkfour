package org.example;

public class FinlandHen extends Hen {
    int countOfEggs = 15;

    @Override
    public int getCountOfEggsPerMonth(){
        return countOfEggs;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - Финляндия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
