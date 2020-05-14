#include<iostream>
using namespace std;
int main()
{
  int total_wt,max,na,nc;
  std::cin>>max>>na>>nc;
  total_wt=(na*75)+(nc*30);
  if(total_wt<=max)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    if(total_wt>max)
    {
      std::cout<<"Boat will drow";
    }
  }
  return(0);
}
