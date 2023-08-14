package org.example;

public class BelarusianHen extends Hen {
    int countOfEggs = 13;

    @Override
    public int getCountOfEggsPerMonth(){
        return countOfEggs;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - Беларусь. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
