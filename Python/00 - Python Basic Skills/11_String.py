# Python String

# Print
print('Hello, World!')

# Assign to Variable
a = 'Hola!'
print(a)

# Multiline String
a = '''Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua.'''
print(a)

# Strings itu array
a = "Hello, World!"
print(a[0])

# Looping di dalam string
for x in "alizul":
    print(x, end="")

print() # Enter

# Panjang String
b = "Halo Salam Kenal! Namaku Ali Zulfikar~"
print(len(b))

# Check Kata dalam String (Ini kereeen)
text = "Sebenernya aku itu suka sama dia hehe"
print("suka" in text)

# Check apakah tidak ada
txt = "aku kok sering banget ya dighosting dia huhu"
print("cinta" not in txt) # True

"""
Kenapa true? karena emang bener dia NOT IN txt
kalo kita pake "cinta" in txt itu baru FALSE karena
emang ngga ada.
"""

# Slicing String
c = "Hola dunia"
print(c[2:]) # Output la dunia karena dimulai dari index ke-2
print(c[:4]) # Output Hola karena hanya dari awal hingga kurang dari 4

# Modify String

a = "Hello, World"
print(a.lower())
print(a.upper())

# String Concatenation
a = "1"
b = "9"
c = a + b
print(c) # Jokes

age = 20
txt = "I am {} years old"
print(txt.format(age))

# String Formatting
quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars"
print(myorder.format(quantity, itemno, price))

quantity = 3
itemno = 567
price = 49.95
myorder = "I want to pay {2} dollars for {0} pieces of item {1}"
print(myorder.format(quantity, itemno, price))

# Escape Character
txt = "We are the so-called \"Vikings\" from the north."
print(txt)

"""
Kalo kita mau nulis double quote di dalam string,
kita harus menggunakan escape character.
yaitu \".
"""

"""
Apa saja yang escape character?
\n = newline
\t = tab
\b = backspace
\f = formfeed
\r = carriage return
\v = vertical tab
\\ = backslash
\" = double quote
\' = single quote
"""

# String Methods
a = "Hello, World!"
print(a.lower())
print(a.upper())
print(a.swapcase())
print(a.capitalize())
print(a.title())
print(a.strip())
print(a.lstrip())
print(a.rstrip())
print(a.replace("H", "J"))
print(a.find("W"))
print(a.rfind("o"))
print(a.count("l"))
print(a.startswith("H"))
print(a.endswith("!"))

# String Format (Advanced)
print("Variable b")
b = "Hello, World!"
print(b.isdigit())
print(b.isalnum())
print(b.isalpha())
print(b.isupper())
print(b.islower())
print(b.istitle())