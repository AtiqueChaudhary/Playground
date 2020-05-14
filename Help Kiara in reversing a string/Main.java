#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100]; 
  string str1;
int count = 0, end, i=0;    
//Your code goes here   
getline(cin,str1);
  while(str1[i]!='\0')
    i++;
  end=i-1;
  for(i=0;str1[i]!='\0';i++)
  {
    rev[i]=str1[end];
    end--;
  }
  
std::cout<<rev;
}