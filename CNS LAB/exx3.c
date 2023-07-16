//Caesar cipher numerical values -(manual code) 
#include<stdlib.h>
#include<string.h>
#include<stdio.h>

char* encrypt(char* s,int shift){
    char* ans=malloc(strlen(s)*sizeof(char));
    int i=0;
    while(s[i]!='\0'){
        ans[i]=(((s[i]+shift)-'0')%10)+'0';
        i++;
    }
    return ans;
}
char* decrypt(char* s,int shift){
    char* ans=malloc(strlen(s)*sizeof(char));
    int i=0;
    while(s[i]!='\0'){
        int val=((s[i]-shift)-'0');
        if(val<0)   val+=10;
        ans[i]=(val%10)+'0';
        i++;
    }
    return ans;
}


int main(){
    char str[100];
    printf("Enter the Input String:");
    scanf("%s",str);
    int shift;
    printf("Enter the Shift:");
    scanf("%d",&shift);
    char* e;
    char* de;
    printf("Encrypted Message is:");
    e=encrypt(str,shift);
    printf("%s\n",e);
    de=decrypt(e,shift);
    printf("Decrypted Message is:");
    printf("%s\n",de);
    return 0;
}