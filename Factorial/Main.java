#include<stdio.h>
int main()
{
	//your code here
  long int n,i,fact=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  printf("%ld",fact);
}