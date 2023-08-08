package org.example;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

import org.example.User;
import org.example.Phone;

public class Main {
    public static void main(String[] args) {
        /*Homework №3*/
        /*Task № 1*/
        //task_one();
        /*Task № 2*/
        //task_two();
        /*Task № 3*/
        //task_three();
        /*Task № 4*/
        //task_four();
        /*Task № 5*/
        //task_five();

        /*Homework №4*/
        /*Task №1*/
        task_one_homework4();
    }

    public static int[] createRandomNumericArray(Integer arraySize){
        int[] createdArray = new int[arraySize];
        for(int i = 0; i < createdArray.length; i++) {
            createdArray[i] = (int)(Math.random() * arraySize) + 1;
        }
        return createdArray;
    }

    public static int[] createRandomNumericArrayInRange(Integer arraySize, int min, int max){
        int[] createdArray = new int[arraySize];
        for(int i = 0; i < createdArray.length; i++) {
            createdArray[i] = (int)(Math.random() * (max - min)) + min;
        }
        return createdArray;
    }

    public static void printArray(int[] printedArray){
        System.out.println("Array : " + Arrays.toString(printedArray));
    }

    public static void printArray(User[] printedArray){
        for (User user : printedArray) {
            System.out.println("Last name:  " + user.lastName + ", name: " + user.firstName + " - " + user.age);
        }
    }
    public static int[] reverseArray(int[] oldArray){
        int[] reversedArray = new int[oldArray.length];
        for(int i = 0; i < oldArray.length; i++) {
            reversedArray[oldArray.length - 1 - i] = oldArray[i];
        }
        return reversedArray;
    }

    public static int[] increaseArrayByTimes(int[] targetArray, int times){
        for(int i = 0; i < targetArray.length; i++) {
            targetArray[i] = targetArray[i]*times;
        }
        return targetArray;
    }

    public static int[] replaceNegativeNumbersInArrayWithZero(int[] targetArray){
        for(int i = 0; i < targetArray.length; i++) {
            if(targetArray[i] < 0){
                targetArray[i] = 0;
            }
        }
        return targetArray;
    }

    public static String getRandomFirstName(){
        String[] firstNames = {"Oleg", "Artem", "Dima", "Victor"};
        return firstNames[new Random().nextInt(firstNames.length)];
    }

    public static String getRandomLastName(){
        String[] lastNames = {"Agafonov", "Petrov", "Ivanov", "Sidorov"};
        return lastNames[new Random().nextInt(lastNames.length)];
    }

    public static Integer getRandomAge(){
        return new Random().nextInt(90);
    }

    public static User[] createArrayWithClassObjects(Integer arraySize){
        User[] createdArray = new User[arraySize];
        for(int i = 0; i < createdArray.length; i++) {
            createdArray[i] = new User(getRandomFirstName(), getRandomLastName(), getRandomAge());
        }
        return createdArray;
    }

    public static void task_one(){
        int[] targetArray = createRandomNumericArray(5);
        printArray(targetArray);
        printArray(reverseArray(targetArray));
    }

    public static void task_two(){
        int[] targetArray = createRandomNumericArray(7);
        printArray(targetArray);
        printArray(increaseArrayByTimes(targetArray, 2));
    }

    public static void task_three(){
        int[] targetArray = createRandomNumericArrayInRange(8, -10, 10);
        int countNegativeNumbers = 0;
        printArray(targetArray);
        for (int j : targetArray) {
            if (j < 0) {
                ++countNegativeNumbers;
            }
        }
        System.out.println("count Negative Numbers : " + countNegativeNumbers);
    }

    public static void task_four(){
        int[] targetArray = createRandomNumericArrayInRange(12, -20, 10);
        printArray(targetArray);
        printArray(replaceNegativeNumbersInArrayWithZero(targetArray));
    }

    public static void task_five(){
        User[] targetArray = createArrayWithClassObjects(3);
        printArray(targetArray);
    }

    public static void task_one_homework4(){
        Phone myPhone = new Phone("PhoneX", 150, "89121562478");
        Phone yourPhone = new Phone("Mi", 123, "81234567899");
        Phone otherPhone = new Phone("Samsung", 144, "81564897523");
        System.out.println("Phone model of myPhone: " + myPhone.getModel());
        System.out.println("Phone weight of myPhone: " + myPhone.getWeight());
        System.out.println("Phone number of myPhone: " + myPhone.getNumber());

        System.out.println("Phone model of yourPhone: " + yourPhone.getModel());
        System.out.println("Phone weight of yourPhone: " + yourPhone.getWeight());
        System.out.println("Phone number of yourPhone: " + yourPhone.getNumber());

        System.out.println("Phone model of otherPhone: " + otherPhone.getModel());
        System.out.println("Phone weight of otherPhone: " + otherPhone.getWeight());
        System.out.println("Phone number of otherPhone: " + otherPhone.getNumber());
        myPhone.receiveCall("Oleg");
        yourPhone.receiveCall("Ivan");
        otherPhone.receiveCall("Petr");
        myPhone.receivePhoneCall("Oleg", myPhone.getNumber());
    }
}