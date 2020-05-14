#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r;
  string door;
  cin>>door>>r;
  if(door=="front")
  {
    if(r==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(r==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
    }
}


