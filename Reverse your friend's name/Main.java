
#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string fullName;
  int i=0;
getline (cin, fullName);
	string rev;
  while(fullName[i]!='\0')
    i++;
  int end=i-1;
  for(i=0;fullName[i]!='\0';i++)
  {
    rev[i]=fullName[end];
    end--;
  }
  rev[i]='\0';
  for(i=0;rev[i]!='\0';i++)
  cout<<rev[i];
}
