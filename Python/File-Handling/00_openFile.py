# Membuka file dengan mode r
filename = '01_File-Handling/data.txt'
try:
    my_file = open(filename)
except FileNotFoundError:
    print('File tidak ditemukan')
    exit() # Keluar dari program
# Dengan tanda "aku" 
for ln in my_file:
    if "kamu" in ln:
        print(ln, end="")
    
my_file.close()