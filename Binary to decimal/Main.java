#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main()
{
  int n,i=0,rem,sum=0;
  scanf("%d",&n);
  while(n!=0)
  {
    rem = n%10;
    sum = sum + rem*pow(2,i);
    n = n/10;
    i++;
  }
    printf("%d",sum);
return 0;
}