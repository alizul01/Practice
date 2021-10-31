/* File : seqsearch.c */
/* Penulis : Ali Zulfikar */

#include <stdio.h>
int main ()
{
  int i;
  int Tab[10] = {1, 50, 6, 200, 3, 100, 30, 8, 99, 10};
  int x = 8;

  i = 0;
  while ( (Tab[i] != x) && (i<9)) {
    i++;
  }
  if (Tab[i] == x) {
    printf("Indeks bernilai X = %d", i);
  } else {
    printf ("Nilai tidak ditemukan");
  }
  return 0;
}