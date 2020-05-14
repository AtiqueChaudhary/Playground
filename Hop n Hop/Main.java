#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,x1=3,y1=4,count=0;
  cin>>x>>y;
  for(int i=0;x1!=x || y1!=y;i++)
  {
    if(x1==x){
      cout<<count+(y-y1);
      return 0;
    }
    else if(y1==y){
      cout<<count+(x-x1);
      return 0;
    }
    else{
      x1++;
      y1++;
      count++;
    }
      //cout<<x1<<y1<<count;

  }
  cout<<x1<<y1<<count;
}