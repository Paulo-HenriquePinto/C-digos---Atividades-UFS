#include <stdio.h>

float salário;
float aumento;

int main(){

    scanf("%f",&salário);
    scanf("%f",&aumento);

    float salário_novo = salário*(1 + (aumento/100));

    printf("Seu salario teve aumento %.1f %%, passando de R$ %.1f para R$ %.1f",aumento,salário, salário_novo);

    return 0;

}
