package org.example;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Reader {
    private final String FIO;
    private final Integer libraryCard;
    private final String faculty;
    private final Calendar birthDate;
    private final String phone;
    public static Integer numberOfReaders = 100;
    public static Integer startYearOfBirth = 1980;
    public static Integer finishYearOfBirth = 2005;
    public static String[] fioArray = {"Agafonov O.D.", "Petrov V.V.", "Ivanov I.I."};
    public static String[] facultyArray = {"Information Technology", "Faculty of Mathematics", "Faculty of History", "Faculty of Biology"};
    public static String[] phoneArray = {"8-925-156-48-51", "8-9963-563-54-12", "8-987-256-74-26", "8-911-562-85-44"};
    public Reader(String FIO, Integer libraryCard,
                  String faculty, Calendar birthDate,
                  String phone) {
        this.FIO = FIO;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public String getFIO() {
        return FIO;
    }

    public Integer getLibraryCard() {
        return libraryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public static String getRandomElementFromArray(String[] array){
        return array[new Random().nextInt(array.length)];
    }

    public static Integer getRandomLibraryCard(){
        return new Random().nextInt(numberOfReaders);
    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    public static Calendar getRandomBirthDate(){
        Calendar randomDate = new GregorianCalendar();
        int randomYear = randBetween(startYearOfBirth, finishYearOfBirth);
        randomDate.set(Calendar.YEAR, randomYear);
        int randomMonth = randBetween(0, 12);
        randomDate.set(Calendar.MONTH, randomMonth);
        int randomDayOfYear = randBetween(1, randomDate.getActualMaximum(Calendar.DAY_OF_YEAR));
        randomDate.set(Calendar.DAY_OF_YEAR, randomDayOfYear);
        return randomDate;
    }
    public void takeBook(int numberOfBooks){
        System.out.println(FIO + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String[] array){
        System.out.println(FIO + " взял книги: " + Arrays.toString(array));
    }

    public void takeBook(Book[] books){
        String[] booksNames = new String[books.length];
        for(int i = 0; i < books.length; i++) {
            booksNames[i] = books[i].nameOfBook;
        }
        System.out.println(FIO + " взял книги: " + Arrays.toString(booksNames));
    }
    public void returnBook(int numberOfBooks){
        System.out.println(FIO + " вернул " + numberOfBooks + " книги");
    }

    public void returnBook(String[] array){
        System.out.println(FIO + " вернул книги: " + Arrays.toString(array));
    }

    public void returnBook(Book[] books){
        String[] booksNames = new String[books.length];
        for(int i = 0; i < books.length; i++) {
            booksNames[i] = books[i].nameOfBook;
        }
        System.out.println(FIO + " вернул книги: " + Arrays.toString(booksNames));
    }
}
