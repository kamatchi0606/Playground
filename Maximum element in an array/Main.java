#include<stdio.h>
int main()
{
  	//type your code here
  int n,i,max,a[100];
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  max=a[0];;
  for(i=1;i<n;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
    }
  }
  printf("%d",max);
}