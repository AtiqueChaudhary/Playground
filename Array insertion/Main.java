#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int n,loc,val,temp;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
    cout<<"Enter the location where you wish to insert an element\n";
  cin>>loc;
  if(loc>n){
    cout<<"Invalid Input";
  	return(0);}
  cout<<"Enter the value to insert\n";
  cin>>val;
  cout<<"Array after insertion is \n";
  for(int i=0;i<=n;i++)
  {
    if(i<loc-1){
          cout<<a[i]<<"\n";
      continue;
    }
    else{
      temp=a[i];
      a[i]=val;
      val=temp;
    }
	cout<<a[i]<<"\n";

  }

}
