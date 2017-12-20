package edu.kit.informatik;
public class Kryptosystem {

public static void main(String[] args) {
    int n = Integer.parseInt(args[1]); //type a number
    if (args[0].equals("sieve")) {
        sieve(n); //call the method,and all the prime number will be printed.
    }
    if (args[0].equals("EGCD")) {
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int gcd = gcd(a, b);
        System.out.println(gcd);
    }
    }

public static void sieve(int n) {
    int[] number = new int[n];   //create a number array from 0 to n;
    number[0] = 1;  //0 is not a prime number,so it was mark as 1 (if the number is prime number then was marked as 0)
    number[1] = 1;  //1 is not a prime number.
    for (int i = 2; i < Math.sqrt(n); i++) {  
        if (number[i] == 0) {
            for (int j = i * i; j < n; j += i) {
                number[j] = 1;   
        }
    }
}
/*use for loop to check index number from 2 to root n,
when a number is prime number (was marked as 0),
then squared value from this number is not prime number(was marked as 1).*/


    for (int i = 0; i < number.length; i++) {
        if (number[i] == 0) {
            System.out.print(i + " ");
            }
        }
    }
//check all index numbers from array,if this number was marked by 0,then it is prime number,so print it out.


 public static int gcd(int a, int b) {
    while (b != 0) {
    int temp = a % b;
    a = b;
    b = temp;
    }
    return a;
    }
}
 
