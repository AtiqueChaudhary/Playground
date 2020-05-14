#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
      int m, n, sum = 0, row[10], col_n = 0, diag = 0;
    cin >> m >> n;
    int i, j;
    int mat[m][n];
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++){
          mat[i][j]=0;
            cin >> mat[i][j];
        }
    }

    for(i = 0; i < m; i++)
    {
      int row=0;
        for(j = 0; j < n; j++)
        {
          //cout<<mat[i][j]<<"\n";
          row = row + mat[i][j];
        }
      cout<<row<<"\n";
    }
    for(i = 0; i < m; i++)
    {
    	//cout<<row[i]<<"\n";
    }
}
