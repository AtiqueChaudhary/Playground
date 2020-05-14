#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  cin>>r>>c>>n;
  (n>=1 && n<=c)||n%c==0||(n-1)%r==0?cout<<"Yes":cout<<"No";
}
