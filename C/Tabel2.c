/* File : Tabel2.c */
/* Penulis : Ali Zul */

#include <stdio.h>
int main()
{
  printf("Ketikkan 5 nilai tiap 1 baris (enter yee) \n");
  int Tab [5];
  int i;

  for (i=0; i<4; i++)
  {
    scanf("%d", &Tab[i]);
  }

  for (i=0; i<4; i++)
  {
    printf("Tab[%d] = %d ;", i, Tab[i]);
  }
  printf("\n");
  return 0;
}