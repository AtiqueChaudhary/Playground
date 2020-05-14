#include<iostream>
using namespace std;
struct college
{
	char name[20],city[20];
  int yr;
  float pass;
};
  
int main()
{
  //Type your code here.
  college clg[10];
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1<<"\nEnter name\nEnter city\nEnter year of establishment\nEnter pass percentage";
    cin>>clg[i].name>>clg[i].city>>clg[i].yr>>clg[i].pass;
  }
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1<<"\nName:"<<clg[i].name<<"\nCity:"<<clg[i].city<<"\nYear of establishment:"<<clg[i].yr<<"\nPass percentage:"<<clg[i].pass;
  }
  
  
}