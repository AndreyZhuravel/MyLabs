package com.andreyhome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please input number n: ");
        Scanner scan1 = new Scanner(System.in);

        int n = scan1.nextInt();

        for(int i=1;i<=n;i++)
        {
            int sum=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    sum=sum+j;
            }
            if(sum==(2*i))  //проверка совершенного числа
                System.out.println(i);
        }
        /*Теорема Евклида. В тех случаях, когда число (2 в степени N) – 1 = простое,
        число (2 в степени N)–1 · ((2 в степени N) – 1) - является совершенным.

        Античные математики считали очень важным рассматривать вместе с каждым числом
        все его делители, отличные от самого этого числа. Такие делители называют собственными.
        Числа, имеющие много собственных делителей, назывались abundant (избыточными), а
        имеющие мало, – defizient (недостаточными). При этом в качестве меры использовалось
        не количество, а сумма собственных делителей, которую сравнивали с самим числом.
        Так например, для 10 сумма делителей
        1 + 2 + 5 = 8 < 10,
        так что делителей «недостаток». Для 12 же
        1 + 2 + 3 + 4 + 6 = 16 > 12,
        т.е. делителей «избыток». Поэтому 10 – «недостаточное», а 12 – «избыточное» число.

        Совершенное число = сумма собственных делителей равна самому числу, примеры:
        6 = 1+2+3
        28 = 1+2+4+7+14

        */
    }
}