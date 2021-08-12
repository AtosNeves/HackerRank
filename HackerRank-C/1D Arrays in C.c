#include <stdio.h>
#include <stdlib.h>
int main(int argc, char const *argv[])
{
    int testes, i, entrada, soma = 0;
    scanf("%d", &testes);
    int arr[testes];
    for (i = 0; i < testes; i++)
    {
        scanf("%d", &entrada);
        soma = soma + entrada;
    }
    printf("%d\n", soma);
    return 0;
}
