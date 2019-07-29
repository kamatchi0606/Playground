#include<stdio.h>
#include<string.h>
int isVowel(char ch)
{ 
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
         {  
           return 0;
         }
         else
         {
           return 1;
         }
  }


  
int main()
{
  char str[100],i;
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
    if(isVowel(str[i]))
       {
         printf("%c",str[i]);
       }
   }
     return 0;
 }

