#include<iostream>
using namespace std;
int fact(int n)
{
  while(n>1)
  return(n*fact(n-1));
}
int main()
{
  //Type your code here.
	int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}
