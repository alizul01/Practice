filename = '01_file-Handling/programming.txt'
my_file = open(filename, 'w')

print("bella", file=my_file)
print("ciao", file=my_file)
my_file.close()