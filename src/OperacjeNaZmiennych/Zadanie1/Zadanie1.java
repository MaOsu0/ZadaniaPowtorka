package OperacjeNaZmiennych.Zadanie1;

import java.util.Random;

class Zadanie1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(50);
        System.out.println("x :" + x);
        int y = random.nextInt(50);
        System.out.println("y: " + y);
        System.out.println();
        boolean result;


//Czy x jest większe od y?
        System.out.println("Czy x jest większe od y ?");
        if (x > y) {
            result = true;
            System.out.println(x + " jest większe od " + y);
        } else {
            result = false;
            System.out.println(x + " nie jest większe od " + y);
        }
        System.out.println();

        System.out.println("Czy x pomnożone przez 2 jest większe od y?");
        if ((x * 2) > y) {
            result = true;
            System.out.println(x + " pomnożone dwa razy jest większe od " + y);
        } else {
            result = false;
            System.out.println(x + " pomnożone dwa razy nie jest większe od " + y);
        }
        System.out.println();

        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        if (y < (x + 3) && y < (x - 2)) {
            System.out.println(result = true);
        } else {
            System.out.println(result = false);
        }
        System.out.println();

        System.out.println("Czy iloczyn liczb x i y jest parzysty?");
        if ((x / y) % 2 == 0) {
            System.out.println(result = true);
        } else {
            System.out.println(result = false);
        }

    }
}
