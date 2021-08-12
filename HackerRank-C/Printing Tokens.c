#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char const *argv[])
{
    char entrada[900000];
    fgets(entrada, 90000, stdin);
    int len = strlen(entrada);
    int i;
    for (i = 0; i < len; i++)
    {
        if (entrada[i] == ' ')
        {
            entrada[i] = '\n';
        }
    }
    printf("%s", entrada);

    //printf("%s", entrada);
    return 0;
}
