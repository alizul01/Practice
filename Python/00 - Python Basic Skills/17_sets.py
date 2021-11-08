# Learning Set in Python

"""
Sifat dari set adalah:
    - Tidak bisa diubah
    - Tidak bisa diurutkan
"""
thisset = set(("Apple", "Banana"))
print(thisset)

set2 = {"Cherry", "Orange"}
print(set2)

print(len(thisset))

# Untuk mengetahui tipe dari set
print(type(thisset))

# Looping dalam set
for x in thisset:
    print(x)

data = {x.lower() for x in thisset}
print(data)

print("Cherry" in thisset)

thisset.add("Rice")
print(thisset)

thisset.update(data)
print(thisset)

# Memasukkan set ke dalam list
list = list(thisset)
print(list)

# Join two sets
set1 = {"a", "b", "c"}
set2 = {1, 2, 3, "c"}

set3 = set1.union(set2)
print(set3)

# Keep only the duplicate values
set1 = {"a", "b", "c"}
set2 = {1, 2, 3, "c"}
set1.intersection_update(set2)
print(set1.intersection(set2))

# Keep All, but remove the duplicate values
set1 = {"a", "b", "c"}
set2 = {1, 2, 3, "c"}
set1.symmetric_difference_update(set2)

print(set1)