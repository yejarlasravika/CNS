#include<stdlib.h>
#include<stdio.h>
#include<string.h>
void bin(unsigned n)
{
  unsigned i;
  for(i=1<<7 ; i>0; i=i/2)
   (n&i) ? printf("1"):printf("0");
}
int main()
{
 int i,n;
 char str[20] = "Hello world";
 char xor_zero[20]= " ";
  printf("        Binary(Str[i])\tBinary(Str[i]) XOR 0\t\n");
  for(i=0;i<strlen(str);i++)
  {
    xor_zero[i] = str[i]^'0';
     
  printf("%c\t",str[i]);
  bin((int)str[i]);
  printf("\t");
  
  
  bin((int)xor_zero[i]);
  printf("\n");
  }
}
