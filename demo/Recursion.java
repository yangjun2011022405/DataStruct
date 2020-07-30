package com.example.demo;

public class Recursion {


    //斐波拉契数列： f(n)=f(n-1)+f(n-2); f(0)=1 f(1)=1 f(2)=2;
    public int Fibonacci(int n) {
        if (n < 0) {
            return 0;
        } else {
            if (n == 0) {
                return 1;
            } else if (n == 1) {
                return 1;
            } else {
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }
        }
    }

    //爬楼梯问题 一次可以爬1级台阶或2级台阶，n级台阶一共有多少种爬法
    public int ClimbStairs(int n) {
        if (n < 0) {
            return 0;
        } else {
            if (n == 0) {
                return 1;
            } else if (n == 1) {
                return 1;
            } else if (n == 2) {
                return 2;
            } else {
                return ClimbStairs(n - 1) + ClimbStairs(n - 2);
            }
        }
    }
}
