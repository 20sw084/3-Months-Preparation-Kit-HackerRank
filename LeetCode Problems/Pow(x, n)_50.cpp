//https://leetcode.com/problems/powx-n/
//Medium, Time: beats 100%, Memory: beats 20.24%

#include<bits/stdc++.h>

double myPow(double x, int n) {
    if( n == 0 )return 1;
    if( n < 0 ) {
        n = abs(n);
        x = 1/x;
    }
    if( n%2 == 0 ) {
        return myPow(x * x, n/2);
    }
    else return x * myPow(x ,n-1);
}

int main() {
    int x, n;
    x = 3;
    n = 5;
    std::cout<< x <<" power "<< n <<" is ";
    std::cout<<myPow(x, n)<<std::endl;

    return 0;
}