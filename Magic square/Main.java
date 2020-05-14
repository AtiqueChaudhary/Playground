#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,sum1=0,sum2=0;
  cin>>r;
  int a[r][r];
  for(int i=0;i<r;i++)
    for(int j=0;j<r;j++)
      cin>>a[i][j];
  for(int i=0;i<r;i++){
    sum1=sum1+a[i][i];
    sum2=sum2+a[i][r-i-1];
    //cout<<a[i][r-i-1];
  }
  sum1==sum2?cout<<"Yes":cout<<"No";
}
