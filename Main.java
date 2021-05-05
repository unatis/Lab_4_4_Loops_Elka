package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int Size = 5;

        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<Size; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=Size-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }


    }
}
