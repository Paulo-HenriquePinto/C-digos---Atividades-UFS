#include <stdio.h>

float notaA;
float notaB;
float notaC;



int main(){

    scanf("%f",&notaA);
    printf("");
    scanf("%f",&notaB);
    printf("");
    scanf("%f",&notaC);
    printf("");

    float média = ((notaA*2.0)+(notaB*3.0)+(notaC*5.0))/10.0;

    printf("MEDIA = %.1f",média);

    return 0;

}
