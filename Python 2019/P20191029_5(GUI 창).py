#1029-5.py
#checkbutton

from tkinter import *
import tkinter.messagebox

def myfunc() :
    if var.get() == 0 :
        tkinter.messagebox.showinfo("hobby","game dislike")
    else :
        tkinter.messagebox.showinfo("hobby", "game like")

window = Tk()
window.title("checkbox test")
window.geometry("300x300")

# hobby?
var = IntVar()
cb1 = Checkbutton(window, text="게임",variable=var, command=myfunc)
#cb2 = Checkbutton(window, text="게임",variable=var)
cb1.pack()

window.mainloop()
