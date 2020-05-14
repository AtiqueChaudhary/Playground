
#include<iostream>
using namespace std;
struct time1
{
  int hr,min,sec;
};
int main()
{
  //Type your code here.
  time1 t1,t2,t3;
  cin>>t1.hr>>t1.min>>t1.sec>>t2.hr>>t2.min>>t2.sec;
  if(t1.sec>=t2.sec)
    t3.sec=t1.sec-t2.sec;
  else{
    t3.sec=(60+t1.sec)-t2.sec;
  	t1.min=t1.min-1;
  }
  if(t1.min>=t2.min)
    t3.min=t1.min-t2.min;
  else{
    t3.min=60+t1.min-t2.min;
  	t1.hr=t1.hr-1;
  }
  //if(t1.hr>t2.hr)
    t3.hr=t1.hr-t2.hr;
  cout<<t3.hr<<":"<<t3.min<<":"<<t3.sec;
  
}
