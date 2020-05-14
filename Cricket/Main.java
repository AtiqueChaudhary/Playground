#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int tb,tr,rs,bb;
  cin>>tb>>tr>>rs>>bb;
  float to=float(tb/6);
  cout<<to<<"\n";
  float of=(bb/6)+(float(bb%6)/10);
  cout<<of<<"\n";
  float crr=rs/of;
  cout<<((float )((int)(crr * 10+ 0.5)) / 10)<<"\n";
  float trr=tr/to;
  cout<<((float )((int)(trr * 10+0.5))) / 10<<"\n";
  crr>trr?cout<<"Eligible to Win":cout<<"Not Eligible to Win";
  
  
}