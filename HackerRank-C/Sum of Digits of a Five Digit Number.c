#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int a, soma = 0, d = 0;
      scanf("%d", &a);

      while (a >= 10)

      {
            d = a % 10;
            a = a / 10;
            soma = soma + d;
      }
      soma = soma + a % 10;
      printf("%d\n", soma);
      return 0;
}