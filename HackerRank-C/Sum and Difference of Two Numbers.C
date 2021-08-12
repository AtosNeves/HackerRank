#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, b;
      float c, d;
      scanf("%d %d", &a, &b);
      scanf("%f %f", &c, &d);
      printf("%d %d\n", a + b, a - b);
      printf("%.1lf %.1lf\n", c + d, c - d);

      return 0;
}