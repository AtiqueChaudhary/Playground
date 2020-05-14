#include<iostream>
using namespace std;
struct ft_inch
{
  int i;
  float ft;
};
int main()
{
  //Type your code here.
  ft_inch f1 ,f2 ,f3;
  cin>>f1.i>>f1.ft>>f2.i>>f2.ft;
  f3.i=f1.i+f2.i;
  if(f1.ft+f2.ft>=12){
    f3.ft=(f1.ft+f2.ft)-12;
    f3.i=f3.i+1;
  }
  else
    f3.ft=f1.ft+f2.ft;
  cout<<f3.i<<"'-"<<f3.ft<<"\"";
}


