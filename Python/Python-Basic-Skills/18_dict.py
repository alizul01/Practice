# Belajar Dictionary Python

thisdict = {
    "brand" : "Ford",
    "model" : "Mustang",
    "year" : 1964
}

print(thisdict["brand"])

# Get Keys of Dictionary
x = thisdict.keys()
print(x)

thisdict["color"] = "yellow"
print(x)

x = thisdict.values()
print(x)

thisdict["year"] = 2021
print(x)

if "model" in thisdict:
    print("Yes, \'model\' is one of keys in the thisdict dictionary")

thisdict.update({"year": 2020})
print(x)

# Adding items to the dictionary
thisdict["ambassador"] = "Hondiw"
print(x)

# Removing items in the dictionary
thisdict.pop("ambassador")
print(x)

# Remove all items in the dictionary
thisdict.clear()
print(x)

# Delete the dictionary
del thisdict

# Loop Dictionaries with for loop
thisdict = {
    "brand" : "Ford",
    "year" : 1949,
    "color" : "blue"
}
for x in thisdict.keys():
    print(x)

for x in thisdict.values():
    print(x)

for x in thisdict.items():
    print(x)


mydict = dict(thisdict)
print(mydict)

for y in mydict.items():
    print(y)

myFamily = {
    "child1" : {
        "name" : "Ali",
        "year" : 2003
    },
    "child2" : {
        "name" : "Siti",
        "year" : 2004
    },
    "child3" : {
        "name" : "Rizal",
        "year" : 2005
    }
}

# Call child1 name and year
print(myFamily["child1"]["name"])

# or this
print(myFamily["child1"]["year"])

car =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print(car.get("model"))
print(car["brand"])