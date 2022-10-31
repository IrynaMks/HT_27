public class Main {
    public static void main(String[] args) {
        System.out.println("homework #27");

        System.out.println("#1 - multiplication table for 3");

        for (int i = 0; i < 10; i++) {
            System.out.println("3 * " + i + " = " + (i * 3));
        }

        System.out.println("#2 - calculate arithmetical");
        int end = 100;
        double result = 0;
        for (int i = 1; i <= end; i++)
            result = result + i;
        {
            System.out.println("from 0 to " + end);
            System.out.println("arithmetic mean =  " + (result / end));
        }

       /* вроді як має бути умова if при виводі результатів, але перемінні 2 шт
        - одна та яка вводиться і арифметично рахується "setNumber"
        - і друга та яка "n"-кількість ітерацій */

    /*
        if (Res_Div(n) > 0) {
            System.out.println("result of division " + Res_Div(100));
            System.out.println("number of iterraions - " + Res_Div(n));
        } else {
            System.out.println("set number is too small");
        }
    }

    static double Res_Div (int setNumber) {
        int n = 0;
        double p;
        for (p = setNumber; p > 50; n++)
            p = p / 2;
        return p, n;
    }
        */
    }
}
