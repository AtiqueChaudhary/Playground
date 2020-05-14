#include<iostream>
using namespace std;
int fibo(int n)
{
  int a=0,b=1;
  while(n<=1)
    return(n);
  return(fibo(n-1)+fibo(n-2));
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fibo(n-1);
}
