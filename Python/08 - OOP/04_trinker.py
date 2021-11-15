import tkinter

main_window = tkinter.Tk()

label1 = tkinter.Label(main_window, text="label1")
label2 = tkinter.Label(main_window, text="label2")

tombol1 = tkinter.Button(main_window, text="tombol")
inputUser = tkinter.Entry(main_window)
# Submit input dari user
submit = tkinter.Button(main_window, text="Submit")

label1.pack()
label2.pack()
tombol1.pack()
inputUser.pack()
submit.pack()

main_window.mainloop()