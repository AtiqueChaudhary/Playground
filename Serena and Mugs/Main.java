#include<iostream>
using namespace std;
void printresult(int *vmug,int mug,int cup)
{
  int sum=0;
  for(int i=0;i<mug;i++){
    cin>>vmug[i];
  sum=sum+vmug[i];
  }
  sum<=cup?cout<<"YES":cout<<"NO";
}
int main()
{
  //Type your code here.
  int mug,cup,sum=0;
  cin>>mug>>cup;
  int vmug[mug];
  printresult(vmug,mug,cup);
}