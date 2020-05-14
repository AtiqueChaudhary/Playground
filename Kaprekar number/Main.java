#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
    if (n == 1)
       cout<<"Kaprekar Number";
    int sqr_n = n * n;
    int ctr_digits = 0;
    while (sqr_n)
    {
        ctr_digits++;
        sqr_n /= 10;
    }
    sqr_n = n*n; 
    for (int r_digits=1; r_digits<ctr_digits; r_digits++)
    {
         int eq_parts = pow(10, r_digits);

         if (eq_parts == n)
            continue;
         int sum = sqr_n/eq_parts + sqr_n % eq_parts;
         if (sum == n){
           cout<<"Kaprekar Number";
           return(0);
         }
    }
    cout<<"Not a Kaprekar Number";
}