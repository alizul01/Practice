# Belajar List Comprehension

juice = ["Jus Apel", "Jus Jeruk", "Jus Mangga", "pisang"]
newJuice = [x.title() if x != "Jus Apel" else "Jus Jeruk" for x in juice]

print(newJuice)