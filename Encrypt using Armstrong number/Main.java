#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int temp=n,res=0,digit=0,Num=n;
  while (Num != 0) {
        Num /= 10;
        ++digit;
    }
  for(int i=1;n!=0;i++)
  {
	res=res+power(n%10,digit);
      n=n/10;
  }
  if(res==temp)
    return(1);
  else
    return(0);
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}

