#include<iostream>
using namespace std;
int pow(int m,int n)
{
  int res=1;
  while(n>0){
  res=res*m;
    n--;
  }
  return(res);
}
int main()
{
	int m,n,req;
  cin>>m>>n>>req;
  if(pow(m,n)>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
  

