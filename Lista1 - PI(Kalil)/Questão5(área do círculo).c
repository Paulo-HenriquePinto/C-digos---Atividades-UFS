#include <stdio.h>

double raio;

int main(){

    scanf("%lf", &raio);

    double raio_m = raio * 0.01;

    double área_circulo = raio_m*raio_m*3.14159;
    
    printf("Area = %.4lf", área_circulo);

    return 0;

}
