#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    if((i+1)%2==0)
    cout<<(i+1)*(i+1)-2<<" ";
    else
    cout<<(i+1)*(i+1)-1<<" ";
}
}