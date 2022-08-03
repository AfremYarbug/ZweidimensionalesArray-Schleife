package main;

public class Main {

    public static void main(String[] args) {

        int[][] array = {{4, 8}};

        for (int[] x : array) {
            for (int[] y : array) {

                System.out.println(x[0] + y[1]);
            }
        }

    }
}
