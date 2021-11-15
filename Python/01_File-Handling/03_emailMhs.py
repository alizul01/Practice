try:
    dataNama = open('01_File-Handling/dataNama.txt', 'r')
    emails2 = open('01_File-Handling/emails2.txt', 'w')
except IOError:
    print('File not found')
    exit()

for email in dataNama:
    x = email.strip("\n")
    print(x + "@polinema.ac.id", file=emails2)
dataNama.close()
emails2.close()