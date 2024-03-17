package com.perscholas.java_basics;

/* Assignment Name: PA 303.2.1 - Practice Assignment  - Core Java - Variables
Author: Pavlenko Anna
Date: March_15_2024
 */

public class JavaBasicsClass {
    public static void main(String[] args) {

        // Assignments:
        System.out.println("Assignments: ");

        /* 1. Write a program that declares two integer variables,
            assigns an integer to each, and adds them together.
            Assign the sum to a variable. Print out the result.
         */
        System.out.println();
        System.out.println("#1: ");

        int a = 7;
        int b = -15;

        int sum = a + b;

        System.out.println("The sum of 2 <int> variables equals: " + sum);


        /* 2. Write a program that declares two double variables,
            assigns an integer to each, and adds them together.
            Assign the sum to a variable. Print out the result.
         */
        System.out.println();
        System.out.println("#2: ");

        double x1 = 27.57;
        double y1 = 5.25;

        double sum1 = x1 + y1;

        System.out.println("The sum of 2 <double> variables equals: " + sum1);

        /* 3. Write a program that declares an integer variable and
            a double variable, assigns numbers to each, and adds
            them together. Assign the sum to a variable. Print out
            the result. What variable type must the sum be?
         */
        System.out.println();
        System.out.println("#3: ");

        int ii = 25;
        double dd = 78.98;

        double sum2 = ii + dd;

        System.out.println("The sum of <int> and <double> variables equals: " + sum2);
        System.out.println("Type sum of <int> and <double>: is double");

//        System.out.println("Type sum of <int> and <double>: " + sum2.isInstance());
//        System.out.println("Type sum of <int> and <double>: " + sum2.getClass().getName());

        /* 4. Write a program that declares two integer variables,
            assigns an integer to each, and divides the larger number
            by the smaller number. Assign the result to a variable.
            Print out the result. Now change the larger number to
            a decimal. What happens? What corrections are needed?
         */
        System.out.println();
        System.out.println("#4: ");

        int larger = 25;
        int smaller  = 3;

        int div = larger / smaller;

        double larger1 = 25.0;

       // int div1 = larger1 / smaller;

        double div2 = larger1 / smaller;

        System.out.println("The devision of 2 <int> variables equals: " + div);
        System.out.println("The <int> result of devision <double> on <int> variables equals Error: \"incompatible types: possible lossy conversion from double to int\"");
        System.out.println("The devision of <double> on <int> variables equals: " + div2);


        /* 5. Write a program that declares two double variables,
            assigns a number to each, and divides the larger by
            the smaller number. Assign the result to a variable.
            Print out the result. Now, cast the result to an integer.
            Print out the result again.
         */
        System.out.println();
        System.out.println("#5: ");

        double large = 125.0;
        double small = 23.0;

        double div3 = large / small;

        System.out.println("The deviding of 2 <double> variables equals: " + div3);
        System.out.println("The casting the result to an integer equals: " + (int)div3);

        /* 6. Write a program that declares two integer variables,
            x and y, and assigns the number 5 to x and the number 6 to y.
            Declare a variable q and assign y/x to it and print q. Now,
            cast y to a double and assign it to q. Print q again.
         */
        System.out.println();
        System.out.println("#6: ");

        int x = 5;
        int y = 6;

        int q = y / x;

        System.out.println("The deviding of 2 <int> variables equals: " + q);


        System.out.println("The casting <y> to a double and assign it to <q> equals: " + "q = " + (double)y);

        /* 7. Write a program that declares a named constant and uses
        it in a calculation. Print the result.
         */
        System.out.println();
        System.out.println("#7: ");

        final double w = 3.14;
        int diameter = 25;

        double area = w * diameter;

        System.out.println("The Area of circle equals: " + area + " inch.");


        /* 8. Write a program where you create three variables that
            represent products at a cafe. The products could be beverages
            like coffee, cappuccino, espresso, green tea, etc. Assign prices
            to each product. Create two more variables called subtotal and
            totalSale and complete an “order” for three items of the first
            product, four items of the second product, and two items of the
            third product. Add them all together to calculate the subtotal.
            Create a constant called SALES_TAX and add sales tax to the subtotal
            to obtain the totalSale amount. Be sure to format the results to two
            decimal places.
         */
        System.out.println();
        System.out.println("#8: ");

        final double SALES_TAX = 0.15;

        // The products at the Cafe:
        double coffee_latte = 5.14;
        double espresso = 5.45;
        double green_tea = 4.95;

        //The ORDER for subtotal & Total Sale:
        double first_pr = coffee_latte * 3;
        double second_pr = espresso * 4;
        double third_pr = green_tea * 2;

        double subTotal = first_pr + second_pr + third_pr;
        System.out.println("The Total Sales equals: " + subTotal);

        double totalSales = subTotal + subTotal * SALES_TAX;
        System.out.println("The Total Sales after Tax equals: " + totalSales);

        double z = Math.round(totalSales*100);

        System.out.println("The Total Sales: " + z/100);

    }
}