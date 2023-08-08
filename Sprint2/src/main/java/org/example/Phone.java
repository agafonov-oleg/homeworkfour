package org.example;

public class Phone {
    private String model;
    private Integer weight;
    private String number;
    public Phone(String model, Integer weight, String number) {
        this.model = model;
        this.weight = weight;
        this.number = number;
    }
    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receivePhoneCall(String name, String number){
        System.out.println("Звонит " + name);
        System.out.println("Номер телефона " + number);
    }

    public void sendMessages(String[] numbers, String number){
        for (String s : numbers) {
            System.out.println("На номер " + s + " было отправлено сообщение с номера " + number);
        }
    }

}
