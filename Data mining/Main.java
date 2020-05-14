#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s1=0,s2=0;
  cin>>n;
  for(int i=1;n!=0;i++)
  {
    i%2==0?s1=s1+(n%10):s2=s2+(n%10);
    n=n/10;
  }
  s1==s2?cout<<"Yes":cout<<"No";
}