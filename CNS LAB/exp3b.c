//Substitution cipher CAPITAL ALPHABETS - (manual)
#include<stdlib.h>
#include<string.h>
#include<stdio.h>
int main()
{
    char str[100];
    printf("Enter the Input String:");
    scanf("%s",str);
    char hash[26]="ZYXWVUTSRQPONMLKJIHGFEDCBA";
    
    char *e=malloc(strlen(str)*sizeof(char));
    for(int i=0;i<strlen(str);i++)
    {
        e[i]=hash[str[i]-'A'];
    }
    printf("Encrypted message : %s\n",e);
    char *de=malloc(strlen(str)*sizeof(char));
    for(int i=0;i<strlen(e);i++)
    {
        de[i]=hash[e[i]-'A'];
    }
    printf("Decrypted message : %s\n",de);
    return 0;
}
