#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0;
  cin>>n;
  int temp=n;
  for(int i=0;n!=0;i++)
  {
    sum=sum+(n%10);
    n=n/10;
  }/*
  if(temp%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";*/
  temp%sum==0?cout<<"Harshad Number":cout<<"Not Harshad Number";
  
}
