#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>

int main()
{

      char ch;
      char l[100];
      char w[100];
      scanf("%c ", &ch);
      scanf("%s ", l);
      fgets(w, 100, stdin);
      printf("%c\n", ch);
      printf("%s\n", l);
      printf("%s\n", w);

      return 0;
}
