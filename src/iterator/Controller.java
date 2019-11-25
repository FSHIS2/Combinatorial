package iterator;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n = input.nextInt();
        System.out.println("Las posibles combinaciones con " +
                n + " bits son:");
        Combination combination = new Combination(n, 0, 1);
        combination.showCombinations();
    }
}
