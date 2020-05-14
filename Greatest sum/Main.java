#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,max=0,count=0;
  cin>>r>>c;
  int a[r][c];
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++)
  {
    int row=0;
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
      row+=a[i][j];
    }
    cout<<row<<" ";
    if(max<row){
      max=row;
    count++;}
  }
  cout<<"\nRow "<<count<<" has maximum sum"; 
  cout<<"\nSum of columns is ";
  count=0;max=0;
  for(int i=0;i<c;i++)
  {
    int col=0;
    for(int j=0;j<r;j++)
    {
      cin>>a[j][i];
      col+=a[j][i];
    }
    cout<<col<<" ";
    if(max<col){
      max=col;
    count++;}
  }
  cout<<"\nColumn "<<count<<" has maximum sum"; 
}
