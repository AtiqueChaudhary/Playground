
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float h;
  cin>>n>>h;
  if(n==2)
    cout<<h+(0.5*h);
  else if(n==3)
    cout<<2*h;
  else
    cout<<"Number of items is more";
}
