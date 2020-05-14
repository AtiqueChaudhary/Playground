#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r>>c>>n;
  (n>=r+1&&n<=2*r)||(n>=r*(c-2)+1&&n<=r*(c-2)+r)?std::cout<<"It is a mango tree":std::cout<<"It is not a mango tree";
}