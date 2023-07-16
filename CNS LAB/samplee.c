#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main()
{
 char str[]="Sravika";
 char str1[20],str2[20];
 int i,len;
 len = strlen(str);
 for(i=0;i<len;i++)
 {
   str1[i] = str[i]&127;
  printf("%c",str1[i]);
    }
  printf("\n");
 for(i=0;i<len;i++)
 {
  str2[i] = str[i]^127;
  printf("%c",str2[i]);
   }
 printf("\n");
}
