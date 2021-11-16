# Belajar Tuples 

"""
Perbedaan tuples dan list adalah:
Tuples tidak bisa diubah atau immutable
"""

thistuple = ("Apple", "Banana", "Cherry")
print(thistuple[0])
print(len(thistuple))

istuple = ("Apple")
print(type(istuple))

"""
Bukan tuple
"""

isitTuple = ("Apple",)
print(type(isitTuple))
"""
Ini baru tuples karena koma diakhir
"""

y = ("Orange", "Cherry")
thistuple += y

print(thistuple)

"""
Kita ga bisa mengubah isi tuple
tapi kita bisa mengubah tuple menjadi list
lalu kita bisa mengubah list menjadi tuple
"""

x = list(thistuple)
x.remove("Cherry")
x.append("Mango")
thistuple = tuple(x)

print(thistuple)

(*green, yellow) = thistuple
print(green)
print(yellow)

print(thistuple.count("Apple"))