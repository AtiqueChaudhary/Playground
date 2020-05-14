#include<iostream>
using namespace std;
int main()
{
  int year,res;
  std::cin>>year;
  res=year%4;
  if(res==0)
  {
    std::cout<<year<<" is a leap year";
  }
  else
  {
    std::cout<<year<<" is not a leap year";
  }
  return(0);
}