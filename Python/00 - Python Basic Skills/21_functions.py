# Belajar membuat fungsi di Python

def my_function():
    print("Hello, Function!")

my_function()

def kenalin(nama):
    print(f"Salam Kenal, {nama}!")

kenalin("Alizul")

def namaLengkap(fname, lname):
    print(f"Nama lengkap saya adalah {fname} {lname}")

namaLengkap("Ali", "Zul")

# Arbitrary Arguments
def fungsi(*args):
    print(args)

fungsi("1, 2, 3, 4, 5", "6, 7, 8, 8 ,9")

# Keyword Arguments
def fungsiku(child3, child2, child1):
    print(f"Anak yang paling muda adalah {child3}")

fungsiku(child1="Ali", child2="Zul", child3="Rizal")

# Arbitrary Keyword Arguments
def fungsiku2(**kwargs):
    print("Nama Awalnya adalah " + kwargs["fname"])
    print("Nama terakhirnya ialah " + kwargs["lname"])

fungsiku2(fname="Ali", lname="Zul")

def mengalikan(a, b):
    return a * b

a = mengalikan(3, 5)
print(a)

"""
Kalo ga pake return maka akan mengembalikan nilai None
"""

def mengalikan2(a, b):
    print(a * b)
print()
b = mengalikan2(3, 5)
"""
Muncul 15 karena print, tapi waktu kita mengakses b, maka akan mengembalikan nilai None
"""
print(b)

# Fungsi Rekursif (Recursion)
def rekursif(n):
    if (n > 0):
        result = n + rekursif(n-1)
    else:
        result = 0
    return result

print(rekursif(6))

# Rumus Faktorial dengan fungsi rekursif
def faktorial(n):
    if n == 1:
        return 1
    else:
        return n * faktorial(n-1)

print(faktorial(5))