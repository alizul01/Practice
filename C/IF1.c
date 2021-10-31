/* File : IF1.c */
/* Penulis : Ali Zulfikar */

#include <stdio.h>
int main ()
{
  int a;

  printf ("Contoh IF satu kasus \n");
  printf ("Ketikkan suatu nilai integer ");
  scanf("%d", &a);
  if (a>=5)
  {
    printf ("Nilai a positif %d \n", a);
  }
  return 0;
}