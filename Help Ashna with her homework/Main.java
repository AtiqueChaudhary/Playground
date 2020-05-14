#include<iostream>
int main()
{
  int a,b,sum,diff,mult,quo,rem;
  std::cin>>a>>b;
  sum=a+b;
  diff=a-b;
  mult=a*b;
  quo=a/b;
  rem=a%b;
  std::cout<<"a+b="<<sum;
  std::cout<<"\na-b="<<diff;
  std::cout<<"\na*b="<<mult;
  std::cout<<"\na/b="<<quo;
  std::cout<<"\na%b="<<rem;
  return(0);
}
  