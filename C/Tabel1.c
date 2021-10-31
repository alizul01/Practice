/* File : Tabel1.c */
/* Penulis : Ali Zulfikar */

#include <stdio.h>
int main ()

{
  int Tab[5] = {1, 2, 3, 4, 5};


  int i;

  for (i=0; i<5; i++) 
  {
    printf("Tab[%d] = %d ;", i, Tab[i]);
  }
  printf ("\n");

  return 0;
}