# Python List

myList = ["Apple", "Banana", "Cherry", "Durian"]
print(myList)  # Untuk print semua isi list
print(myList[0])  # Untuk print isi list pada index ke 0

print(len(myList))  # Untuk print jumlah isi list

"""
List adalah variabel yang menampung banyak data.
List dapat menampung data berupa string, integer, float, boolean, ataupun list.
"""

list1 = ["Apple", "Banana", "Cherry", "Durian"]
list2 = [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
list3 = [True, False, True]

print(list1)
print(list2)
print(list3)

"""
List juga dapat menampung tipe data berbeda-beda.
"""

list4 = ["Alizul", 24, True, "40"]
print(list4)

# Untuk melihat tipe data dari list
print(type(list4[2]))
print(type(list1[0]))

thislist = list((1, 2, 3, 4, 5))
print(thislist)

print(thislist[0])
print(thislist[-5])
print(thislist[0:3])
print(thislist[:3])
print(thislist[1:])
print(thislist[-1:-4:-1])

food = ["apple", "banana", "cherry"]
if "apple" in food:
    print("Yes, apple is in the list")

thislist.insert(2, "apple")
print(thislist)

# Append adalah untuk menambahkan data pada list
food.append("orange")
print(food)

# insert adalah untuk menambahkan data pada list pada index tertentu
food.insert(1, "Rice")
print(food)

# Extend adalah untuk menambahkan banyak data pada list 
food.extend(["Peer", "Tomato", "Potato"])
print(food)

# Remove adalah untuk menghapus data pada list
food.remove("Peer")
print(food)

# Remove Specified Index adalah untuk menghapus data pada list pada index tertentu
food.pop(0)
print(food)

# Bisa juga menggunakan del untuk menghapus data pada list
del food[2]
print(food)

# Clear adalah untuk menghapus semua data pada list
food.clear()
print(food)

# Loop Lists adalah untuk melakukan perulangan pada list
drink = ["Coke", "Pepsi", "Sprite", "Fanta", "Coffee"]
for i in drink:
    print(i)

# List Comprehension
[print(y) for y in drink]