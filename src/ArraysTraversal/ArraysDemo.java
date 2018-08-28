package ArraysTraversal;

import java.util.Random;

public class ArraysDemo{

    public static void main(String[] args) {
        // we will be demonstrating the various ways to traverse an array

        double[] arr = new double[100];
        Random rn = new Random();
       // initialize the array with random doubles
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.ceil(rn.nextDouble()*10);
        }

        for (double db: arr) {
            System.out.println(db +"sqrt --> " + Math.sqrt(db));
        }

    }



}
