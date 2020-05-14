#include<iostream>
using namespace std;
int main()
{
  int a;
  std::cin>>a;
  if(a<0)
  {
    std::cout<<a<<" is a negative number.";
  }
  else
  {
    std::cout<<a<<" is a positive number.";
  }
  return(0);
}