#include<iostream>
using namespace std;
int power(int a,int n)
{
  while(n<=1)
    return(a);
  return(a*power(a,n-1));
}
int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a\nEnter the value of n\n";
  cin>>a>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
}

