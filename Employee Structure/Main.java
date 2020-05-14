#include<iostream>
using namespace std;
struct employee
{
  char name[20],desg[20];
  int id,age;
  float sal;
};
int main()
{
  //Type your code here.
  employee e;
  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\nEmployee Details\n";
  cin>>e.name>>e.id>>e.age>>e.desg>>e.sal;
  cout<<"Name of the Employee : "<<e.name<<"\nID of the Employee : "<<e.id<<"\nAge of the Employee : "<<e.age<<"\nDesignation of the Employee : "<<e.desg<<"\nSalary of the Employee : "<<e.sal;
}