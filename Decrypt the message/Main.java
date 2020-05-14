#include<iostream>
using namespace std;
int main()
{
  int a,b,sum=0;
  cin>>a>>b;
  int c=a+b;
  for(int i=1;i<=c/2;i++)
  {
    if(c%i==0)
      sum=sum+i;
  }
  if(sum==c)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}
