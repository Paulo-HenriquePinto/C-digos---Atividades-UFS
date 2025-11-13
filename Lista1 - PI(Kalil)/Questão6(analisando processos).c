#include <stdio.h>

int minutos_por_processo;

int main(){

    scanf("%d",&minutos_por_processo);

    int número_de_processos = (8*60)/minutos_por_processo;

    printf("%d", número_de_processos);

    return 0;
}
