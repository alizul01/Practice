# Belajar Looping Pada Python

i = 1
while i < 10:
    print(i)
    i += 1
print()
"""
Di python gaada i++, bisanya pake += 1
"""
print("Menggunakan break")
i = 1
while i < 10:
    print(i)
    if i == 3:
        break
    i += 1

print()
print("Menggunakan continue")
i = 0
while i < 10:
    i += 1
    if i == 5:
        continue
    elif i == 10:
        break
    print(i)

# Kita dapat menggunakan else pada while
print()
print("Menggunakan else pada while")
i = 0
while i < 10:
    print(i)
    i += 1
else:
    print("i is no longer less than 10")