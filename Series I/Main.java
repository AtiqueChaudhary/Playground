#include<iostream>
using namespace std;
int main()
{
	int n;
  float a=0.5,next;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<a<<" ";
    next=3*a;
    a=next;
  }
}