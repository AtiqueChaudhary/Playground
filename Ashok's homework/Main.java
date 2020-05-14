#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c;
  cin>>r>>c;
  int a1[r][c],a2[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a1[i][j];
    }
  }
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a2[i][j];
    }
  }
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cout<<a1[i][j]+a2[i][j]<<" ";
    }
    cout<<"\n";
  }
}

