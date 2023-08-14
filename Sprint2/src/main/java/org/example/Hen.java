package org.example;

public class Hen {
    int countOfEggs = 0;
    public int getCountOfEggsPerMonth(){
        return countOfEggs;
    }

    public String getDescription(){
        return "Я курица";
    }

    public void chooseHen(String country){
        Hen hen = HenFactory.getHen(country);
        System.out.println(hen.getDescription());
    }
}
