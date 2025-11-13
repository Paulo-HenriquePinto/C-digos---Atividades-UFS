#include <stdio.h>

char nome[20];
char atração_preferida[50]; 

int main(){
   
    scanf(" %[^\n]", &nome);
    scanf(" %[^\n]", &atração_preferida);

    printf("Bem vindo %s! Aguardamos você na/o %s!", nome, atração_preferida);

    return 0;

}

//Quando você coloca o ^ (caret) como o primeiro caractere dentro do scanset, ele inverte a regra de leitura. Em vez de ler apenas os caracteres listados, ele passa a ler TUDO, EXCETO o caractere que vier depois do ^
//Se você escreve scanf("%[^Q]", str);, o scanf vai ler tudo, até encontrar a letra Q.
