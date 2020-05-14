#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i;
  cin>>n;
  cout<<n<<"\n";
  for(i=0;n!=1;i++)
  {
    if(n%2==0){
      n=n/2;
      cout<<n<<"\n";
    }
    else{
      n=(3*n)+1;
      cout<<n<<"\n";
    }
  }
      cout<<i;
}
