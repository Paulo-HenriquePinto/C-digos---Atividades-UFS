#include <stdio.h>

int número;

int main(){
    
    scanf("%d", &número);

    int antecessor = número-1;
    int sucessor =  número+1;

    printf("%d %d",antecessor, sucessor);

}
