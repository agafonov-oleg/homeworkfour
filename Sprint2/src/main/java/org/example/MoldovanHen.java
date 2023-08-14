package org.example;

public class MoldovanHen extends Hen {
    int countOfEggs = 20;

    @Override
    public int getCountOfEggsPerMonth(){
        return countOfEggs;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - Молдова. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
