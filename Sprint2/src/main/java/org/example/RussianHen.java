package org.example;

public class RussianHen extends Hen {
    int countOfEggs = 10;

    @Override
    public int getCountOfEggsPerMonth(){
        return countOfEggs;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - Россия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
