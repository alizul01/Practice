# Belajar GUI dengan Tkinter
from tkinter import *

def hi():
    l["text"] = "Hello!"

def increaseNum():
    num["text"] = int(num["text"]) + 1

window = Tk()
window.title("Learn Tkinter")
window.geometry("1366x768")
num = Label(window, text="0")
l = Label(window, text="Hello, World!")
l.pack()
b = Button(window, text="Click Me!", command=hi)
b.pack()
num = Label(window, text="0")
num.pack()
add = Button(window, text="add", command=increaseNum)
add.pack()
# Add 2 user input field
a = Entry(window, width = 10 , borderwidth = 5, relief = "groove", bg = "white")
a.pack()
window.mainloop()