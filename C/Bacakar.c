/* file : bacakar.c */

#include <stdio.h>
int main()
{
  char a;
  char b;

  printf ("Tuliskan nama karakternya :");
  scanf ("%c", &a);
  printf ("Kode ASCIInya adalah : %d\n", a);

  printf ("Tuliskan kode ASCII-nya : ");
  scanf ("%d", &b);
  printf ("Karakternya adalah : %c\n", b);

  return 0;
}