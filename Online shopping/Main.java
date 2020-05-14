#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a1,d1,s1,a2,d2,s2,a3,d3,s3;
  cin>>a1>>d1>>s1>>a2>>d2>>s2>>a3>>d3>>s3;
  int F=a1-((d1*a1)/100)+s1;
  int S=a2-((d2*a2)/100)+s2;
  int A=a3-((d3*a3)/100)+s3;
  cout<<"In Flipkart Rs."<<F<<"\n"<<"In Snapdeal Rs."<<S<<"\n"<<"In Amazon Rs."<<A<<"\n";
  if(A<S && A<F)
        cout<<"He will prefer Amazon";
 
  else if(S<F)
    cout<<"He will prefer Snapdeal";
  else
	   cout<<"He will prefer Flipkart";
}
