//
//  main.cpp
//  smallestFactor
//
//  Created by Daniel D Utvich on 2017-03-25.
//  Copyright © 2017 Daniel D Utvich. All rights reserved.
//


//************************//
//PROJECT EULER PROBLEM 5 //


/************************************************************
 2520 is the smallest number that can be divided by each of 
 the numbers from 1 to 10 without any remainder. 
 What is the smallest positive number that is evenly divisible
 by all of the numbers from 1 to 20?
 
 This program finds the smallest number that can be evenly
 divided by numbers 1-20
 ************************************************************/

#include <iostream>
long factorial(long n);

int main(int argc, const char * argv[]) {
    
    long num = 1000;
    long num2 = 0;
    
    bool check = false;
    
    while (check == false) {
        num ++;
        num2 = num * 20;
        std::cout << num2 << std::endl;
        for( int i = 1; i <= 20; i++){
            if(num2 % i == 0 && i == 20) {
                std::cout << "passed" << std::endl;
                check = true;
            }
            if(num2 % i != 0) {
                std::cout << "failed" << std::endl;
                break;
            }
        }
    }
    
    std::cout << num2;
    
    return 0;
}

long factorial(long n)
{
    if(n > 1)
        return n * factorial(n - 1);
    else
        return 1;
}
