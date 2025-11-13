#include <stdio.h>

float num1;
float num2;

int main(){

    scanf("%f",&num1);
    scanf("%f", &num2);

    float soma = num1 + num2;
    float subtração = num1 - num2;
    float multiplicação = num1*num2;
    float divisão = num1/num2;

    printf("%.2f\n", soma); 
    printf("%.2f\n", subtração);
    printf("%.2f\n", multiplicação);
    printf("%.2f\n", divisão);

    return 0;
}
