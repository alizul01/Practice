/* File : maxsort.c */
/* Penulis : Ali Zulfikar */

#include <stdio.h>
int main()

{
  int i;
  int Tab[10] = {1, 50, 6, 200, 3, 100, 30, 8, 99, 100};
  int max;
  int k, temp;

  for (i=0; i<9; i++) {
    max = i;
    for (k=i+1; k < 10; k++) {
      if (Tab[k] > Tab[max]) {
        max = k;
      }
    }

    temp = Tab[i];
    Tab[i] = Tab[max];
    Tab[max] = temp;
  }
  for (i=0; i<10; i++) {
    printf ("%d > ", Tab[i]);
  }
  return 0;
}