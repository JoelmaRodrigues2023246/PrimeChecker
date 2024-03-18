/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primechecker;

import java.util.ArrayList;

/**
 *
 * @author Lecturer
 */
public class PrimeChecker {

    /**
     * @param args the command line arguments
     */
    
    /*
            What is a prime number?
        Only divisible by itself and one (one is not a prime number)
        
        Exercise - 
        1) write a program that checks if a given number is prime
            - Given number n
            - Check each number bewteen 2 and n-1 (sqrt(n))
            - if any of these divide evenly, then n is not prime and we can stop return false
                - if (n % i ==0)
            - if it is not not prime, then it is prime return true
        2) have it split up the task into multiple threads
    */
    
    public static boolean checkPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                System.out.println(i);
                return false;
            }   
        }
        return true;
    }
    
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(checkPrime(2)); // true
//        System.out.println(checkPrime(3)); // true
//        System.out.println(checkPrime(4)); // false
//        System.out.println(checkPrime(10)); // false
//        System.out.println(checkPrime(91)); // false
//        System.out.println(checkPrime(47)); // true

        int n = 10000;
        int numThreads = 5;
        int startNum = 2;
        int numbersPerThread = (int) Math.floor((Math.sqrt(n) - startNum) / 5);
        ArrayList<PrimeCheckThread> threadList = new ArrayList<>();
        
        // (Math.sqrt(n) - startNum) / 5
        // (100-2)/5 = 20
        
        for (int i = 1; i <= numThreads; i++) {
            threadList.add((new PrimeCheckThread(startNum*i, (startNum*i) + numbersPerThread, n)));
        }
        
        for (Thread thread : threadList) {
            thread.start();
        }
        
        boolean isPrime = true;
        
        for (PrimeCheckThread thread : threadList) {
            thread.join();
            isPrime = isPrime && thread.isPrime;
        }
        
        System.out.println(isPrime);
        

    }
    
}
