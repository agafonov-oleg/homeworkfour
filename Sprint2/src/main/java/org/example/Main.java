package org.example;
import java.util.*;
import java.lang.Error;

import static org.example.Reader.*;

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
        //homework4();

        /*Homework №5, Task №1*/
        //Hen myHen = new Hen();
        //myHen.chooseHen("Финляндия");
        /*Homework №5, Task №2*/
        //Calculator calc = new Calculator();
        //System.out.println(calc.multiply(2147483649L ,2147483649L));
        //System.out.println(calc.subtract(2147483649L ,4611686022722355201L));
        //System.out.println(calc.sum(5 ,5));
        //System.out.println(calc.divide(5.22 ,2));
        /*Homework №5, Task №3*/
        //ArrayUtil array = new ArrayUtil();
        //int[] targetArray = new int[] {1, 2, -66, 15};
        //System.out.println(array.min(targetArray));
        //System.out.println(array.max(targetArray));
        /*Homework №5, Task №3*/
        //Reader[] readers = createReaders(3);
        //Reader reader = getRandomReader(readers);
        //Book[] books = createBooks();
        //reader.takeBook(books);
        //reader.takeBook(new String[]{"Book 1", "Book 2", "Book 3", "Book 4"});
        //reader.takeBook(2);
        //reader.returnBook(books);
        //reader.returnBook(new String[]{"Book 1", "Book 2", "Book 3", "Book 4"});
        //reader.returnBook(2);

        /*Homework №6, Task №1*/
        ArrayList<Integer> targetList = createRandomNumericArrayListInRange(10);
        System.out.println(targetList);
        /*Homework №6, Task №2*/
        //System.out.println(getFirstElements(targetList, 21));
        /*Homework №6, Task №3*/
        //System.out.println(getUniqueElements(targetList));
        /*Homework №6, Task №4*/
        //System.out.println(ascendingElements(targetList));
        //System.out.println(descendingElements(targetList));
        /*Homework №6, Task №5*/
        //System.out.println(getMinOfList(targetList));
        //System.out.println(getMaxOfList(targetList));
        //System.out.println(getSumOfList(targetList));
        /*Homework №6, Task №6*/
        //System.out.println(getPozitiveNumberOfCollection(targetList));
        /*Homework №6, Task №7*/
        //System.out.println(deleteOddElements(targetList));
        /*Homework №6, Task №8*/
        System.out.println(getIndexElement(targetList, 2));
    }

    /* Список будет генерироваться от -arraySize/2 до arraySize/2 */
    public static ArrayList<Integer> createRandomNumericArrayListInRange(Integer arraySize){
        ArrayList<Integer> createdArrayList = new ArrayList<>();
        for(int i = 0; i < arraySize; i++) {
            createdArrayList.add(new Random().nextInt(arraySize) - arraySize/2);
        }
        return createdArrayList;
    }

    /* Возвращает первые n элементов из коллекции */
    public static ArrayList<Integer> getFirstElements (ArrayList<Integer> firstList, int numberOfElements) {
        if(numberOfElements > firstList.size()) {
            numberOfElements = firstList.size();
        }
        ArrayList<Integer> secondList = new ArrayList<>();
        for(int i = 0; i < numberOfElements; i++) {
            secondList.add(firstList.get(i));
        }
        return secondList;
    }

    /* Возвращает уникальные элементы из коллекции */
    public static ArrayList<Integer> getUniqueElements (ArrayList<Integer> firstList) {
        Set<Integer> uniqueElementsList = new HashSet<>(firstList);
        return new ArrayList<>(uniqueElementsList);
    }

    /* Сортирует коллекцию по возрастанию */
    public static ArrayList<Integer> ascendingElements (ArrayList<Integer> firstList) {
        firstList.sort(Comparator.naturalOrder());
        return firstList;
    }

    /* Сортирует коллекцию по убыванию */
    public static ArrayList<Integer> descendingElements (ArrayList<Integer> firstList) {
        firstList.sort(Comparator.reverseOrder());
        return firstList;
    }

    /* Получаем минамальное число в коллекции */
    public static int getMinOfList (ArrayList<Integer> firstList) {
        return Collections.min(firstList);
    }

    /* Получаем максимальное число в коллекции */
    public static int getMaxOfList (ArrayList<Integer> firstList) {
        return Collections.max(firstList);
    }

    /* Получаем сумму чисел в коллекции */
    public static int getSumOfList (ArrayList<Integer> firstList) {
        int sumOfList = 0;
        for (Integer i : firstList) {
            sumOfList += i;
        }
        return sumOfList;
    }

    /* Получаем коллекцию только положительных чисел */
    public static ArrayList<Integer> getPozitiveNumberOfCollection(ArrayList<Integer> firstList) {
        ArrayList<Integer> createdArrayList = new ArrayList<>();
        for (Integer i : firstList) {
            if (i > 0) {
                createdArrayList.add(i);
            }
        }
        return createdArrayList;
    }

    /* Удаляем из коллекции все нечетные числа */
    public static ArrayList<Integer> deleteOddElements(ArrayList<Integer> firstList) {
        ArrayList<Integer> createdArrayList = new ArrayList<>();
        firstList.removeIf(i -> i % 2 != 0);
        return firstList;
    }

    /* Получаем индекс элемента из коллекции */
    public static String getIndexElement(ArrayList<Integer> firstList, int element) {
        String iterator = "";
        int indexValue = firstList.indexOf(element);
        if (indexValue != -1)
            iterator = String.valueOf(indexValue);
        else
            iterator = "Element " + element + " is not in the collection";
        return iterator;
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

    public static void homework4(){
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

    public static Reader[] createReaders(Integer arraySize){
        Reader[] createdArray = new Reader[arraySize];
        for(int i = 0; i < createdArray.length; i++) {
            createdArray[i] = new Reader(getRandomElementFromArray(fioArray),
                    getRandomLibraryCard(), getRandomElementFromArray(facultyArray),
                    getRandomBirthDate(), getRandomElementFromArray(phoneArray));
        }
        return createdArray;
    }

    public static Reader getRandomReader(Reader[] readers){
        return readers[new Random().nextInt(readers.length)];
    }

    public static Book[] createBooks(){
        Book firstbook = new Book("Harry Potter", "J. K. Rowling");
        Book secondbook = new Book("The Old Man and the Sea", "Ernest Hemingway");
        Book thirdbook = new Book("The Master and Margarita", "Mikhail Bulgakov");
        return new Book[]{firstbook, secondbook, thirdbook};
    }
}