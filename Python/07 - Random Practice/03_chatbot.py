import string

chatbot_name = "Anabul"

while True:
    # Input from user
    usermsg = input("You: ").lower().strip(string.punctuation + string.whitespace)
    # Fungsi dari string.punctuation + string.whitespace menghilangkan karakter yang tidak diinginkan
    # Contoh: "Hello, world!" menjadi "Hello world"
    
    print(chatbot_name + ":", end=" ")
    
    # Untuk quit program
    if usermsg == "quit" or usermsg == "selesai" or usermsg == "keluar" or usermsg == "udahan":
        print("Goodbye!")
        break
    
    # Respon chatbot
    if usermsg == "halo" or usermsg == "hello" or usermsg == "hallo":
        print("Hai juga!?")
    elif "nama" in usermsg:
        print("Nama saya " + chatbot_name + ".")
    elif usermsg == "makasih" or usermsg == "terima kasih":
        print("Makasih kembali <3")
    elif "harga" in usermsg:
        print("Harga aku mahal.") 
    else:
        print("Eh gimana, ga ngerti gue!")