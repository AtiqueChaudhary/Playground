#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  char str1[50];
  int j=0;
  cin>>str;
  for(int i=0;i<str.length();i++)
  {
    if((str[i]>='A' && str[i]<='Z') || (str[i]>='a' && str[i]<='z'))
    {str1[j]=str[i];j++;}
  }
  str1[j]='\0';
  cout<<str1;
}