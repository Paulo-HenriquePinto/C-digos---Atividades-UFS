#include <stdio.h>

double num1;
double num2;


int main(){

    scanf("%lf",&num1);
    scanf("%lf",&num2);

    double média = (num1+num2)/2;

    printf("%.2lf",média);

    return 0;
}

/*Se a entrada foi 6,5:

O scanf começa a ler o 6.

O scanf encontra a vírgula (,).

O scanf interpreta a vírgula como um caractere não numérico ou um delimitador(padrão inglês).

O scanf para a leitura do número, deixando o ,5 no buffer de entrada.

O valor armazenado na sua variável float é apenas 6.0. */
