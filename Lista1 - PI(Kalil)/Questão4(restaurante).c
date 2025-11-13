#include <stdio.h>

float valor_total;

int main(){

    scanf("%f", &valor_total);

    float valor_final = valor_total*1.1;
    
    printf("%.2f", valor_final);
}
