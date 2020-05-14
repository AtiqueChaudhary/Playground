#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,a[20],m;
  cin>>n;
  for (int i=0;i<n;i++)
  	cin>>a[i];
  cin>>m;
  for (int i=0;i<n;i++)
  	if(a[i]==m)
    {cout<<"She passed her exam";return(0);}
  cout<<"She failed";
  
}