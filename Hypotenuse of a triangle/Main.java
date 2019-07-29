#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float adj,oppo,hyp;
  scanf("%f%f",&adj,&oppo);
  hyp=sqrt((adj*adj)+(oppo*oppo));
  printf("%0.2f",hyp);
  return 0;
}