//
//  main.cpp
//  math
//
//  Created by Daniel D Utvich on 2017-03-24.
//  Copyright © 2017 Daniel D Utvich. All rights reserved.
//

//************************//
//PROJECT EULER PROBLEM 3 //


/************************************************************
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ? 
 
This program finds the largest factor of 600851475143 that is
also a prime number.
************************************************************/


#include <iostream>
#include <cmath>
using namespace std;

long findDatNumber ( long l );

int main() {
   
    long num = 600851475143;
    
    findDatNumber(num);
    
}

long findDatNumber ( long l ) {
    long j = 2;
    while ( l % j != 0 ) {
        j++;
        cout << "j++" << endl;
    }
    if ( l % j == 0 ) {
        cout << "factor found" << endl;
        if ( l == j )
        {
            cout << l << " <--- answer" << endl;
            return 0;
        }
        else {
            cout << "factor not found" << endl;
            l = l / j;
            findDatNumber(l);
        }
        
    }
    return 0;
}


