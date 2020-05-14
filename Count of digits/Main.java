#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i;
  cin>>n;
  if(n==0)
    cout<<"1";
  else
  {
  for(i=0;n!=0;i++)
  {
    n=n/10;
  }
  cout<<i;
  }}

