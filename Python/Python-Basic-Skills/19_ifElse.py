# Belajar If Else Statement pada Python

"""
Python support logical conditions from mathematics:
Equals : a == b
Not Equals : a != b 
Less than : a < b
Less than or equal to : a <= b
Greater than : a > b
Greater than or equal to : a >= b
"""

# Example
a = 10
b = 20
if b > a:
    print("b is greather than a")

"""
Perlu diingat kalo if else di python agak sedikit berbeda dengan
bahasa pemrograman lainnya. Jika kita menggunakan if else di python,
maka kita harus menambahkan spasi di depan kode blok kita.

if a > b:
    print("a is greather than b")

bukan
if a > b:
print("a is greather than b")

itu yang di atas akan menghasilkan error.
"""

a = 33
b = 33
if b > a:
    print("b is greather than a")
elif a == b:
    print("a and b are equal")

"""
Bukan else if ya, tapi menggunakan elif
"""

a = 200
b = 123

if b > a:
    print("b is greather than a")
elif a == b:
    print("a and b are equal")
else:
    print("a is greater than b")

# Short hand if else
if a > b: print("a is greater than b")

a = 2
b = 330
print("A") if a > b else print("B")

"""
Logika di python syntaxnya berbeda dengan bahasa program
lain. Kalau di java kita menggunakan tanda &&, ||, !
kalau di python kita menggunakan and, or, not
"""

a = 200
b = 33
c = 500
if a > b or a > c:
    print("At least one of the conditions is True")

if a > b and c > a:
    print("Both condition is True")
