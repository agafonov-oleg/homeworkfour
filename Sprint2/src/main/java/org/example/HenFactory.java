package org.example;

public class HenFactory {

    public static Hen getHen(String country) {

        return switch (country) {
            case "Россия" -> new RussianHen();
            case "Финляндия" -> new FinlandHen();
            case "Молдова" -> new MoldovanHen();
            case "Беларусь" -> new BelarusianHen();
            default -> null;
        };
    }
}
