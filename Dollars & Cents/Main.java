#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,d2,c1,c2;
    cin>>d1>>c1>>d2>>c2;
  if(c1+c2>=100)
    cout<<d1+d2+1<<"\n"<<c1+c2-100;
  else
    cout<<d1+d2<<"\n"<<c1+c2;
}