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
  char str[20] = "Hello World";
  char and[20] = " ";
  char xor_zero[20] = " ";
  char xor_127[20] = " ";
  char or_127[20] = " ";
  printf("        Binary(Str[i])\tBinary(Str[i]) XOR 0\tBinary(Str[i]) XOR 127\tBinary(Str[i]) AND 127\t\n");
  for(i=0;i<strlen(str);i++)
  {
   xor_zero[i]=str[i]^'0';
   xor_127[i]=str[i]^127;
   and[i]=str[i]&127;
  or_127[i] = str[i]|127;
  
  
  printf("%c\t",str[i]);
  bin((int)str[i]);
  printf("\t\t");
  
  
  bin((int)xor_zero[i]);
  printf("\t\t");
  
  bin((int)xor_127[i]);
  printf("\t\t");
  
  bin((int)and[i]);
  printf("\n");
}
}
