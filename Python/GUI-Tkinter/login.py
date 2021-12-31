from tkinter        import *
from tkinter        import messagebox

def login():
    username = entry1.get()
    password = entry2.get()
    
    if username == "" or password == "":
        messagebox.showinfo("Login", "Please enter your username and password, Blank is not allowed")
    elif username == "admin" and password == "admin":
        messagebox.showinfo("Login", "Login Successful")
    else:
        messagebox.showinfo("Login", "Login Failed")

root = Tk()
root.title("Login")
root.geometry("300x200")

global entry1
global entry2

Label(root, text="Username").place(x = 20, y = 20)
Label(root, text="Password").place(x = 20, y = 70)

entry1 = Entry(root, bd=2).place(x = 140, y = 20)

entry2 = Entry(root, bd=2).place(x = 140, y = 70)

Button(root, text="Login", command=login, height=3, width =13, bd=4).place(x = 150, y = 120)
root.mainloop()