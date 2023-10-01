#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int fre[26];
int main() {

    char S[100001];
    scanf("%s",&S);
    int len=strlen(S);
    int i=0;
    for(i=0;i<len;i++)
        {
        fre[S[i]-'a']++;
        }
    int flag=0;
    int same=0;
    int count=0;
    for(i=0;i<26;i++)
        {
        if(flag==0&&fre[i]!=0)
            {
            flag=1;
            same=fre[i];
        }
        if(flag==1&&fre[i]!=0&&fre[i]!=same)
            {
            count++;
        }
        
    }
    if(count<=1)
    printf("YES");
    else
        printf("NO");
    return 0;
}
