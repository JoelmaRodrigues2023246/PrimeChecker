package primechecker;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lecturer
 */
public class PrimeCheckThread extends Thread {
    int startNum;
    int endNum;
    int n;
    boolean isPrime;

    public PrimeCheckThread(int startNum, int endNum, int n) {
        this.startNum = startNum;
        this.endNum = endNum;
        this.n = n;
    }

    public boolean checkPrime() {
        if (n < 2) return false;
        for (int i = startNum; i <= endNum; i++) {
            if (n%i==0) {
                System.out.println(i);
                return false;
            }   
        }
        return true;
    }
    
    public void run() {
        isPrime = checkPrime();
    }
}
