#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    int testes, i, copy, aux;
    scanf("%d", &testes);
    copy = testes-1;
    int arr[testes];
    for (i = 0; i < testes; i++)
    {
        scanf("%d", &arr[i]);
    }
    for (i = 0; i < testes / 2; i++)
    {
        aux = arr[i];
        arr[i] = arr[copy];
        arr[copy] = aux;
        copy = copy - 1;
        printf("%d\n", copy);
    }
    for (i = 0; i < testes; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}
