package TypyDanych.Zadanie1;

class TypyDanych {
    public static void main(String[] args) {
        // -Cześć Jan, słyszałem, że masz 25 lat i uczysz się programowania. Czy to prawda?
        //-true
        //-Czy Twoje inicjały to J K?
        //-Tak, true
        int yearsOld = 25;
        boolean isTrue = true;
        char firstNameChar = 'J';
        char firstSurnameChar = 'K';

        System.out.println("-Cześć Jan, słyszałem, że masz" + " " + yearsOld + " lat i uczysz się programowania. Czy to prawda?");
        System.out.println("-" + isTrue);
        System.out.println("-Czy Twoje inicjały to " + firstNameChar + " " + firstSurnameChar + "?");
        System.out.println("-Tak, " + isTrue);
    }
}
