#1119-3.py
#dialog

from tkinter import *
from tkinter.simpledialog import *

window = Tk()
window.geometry("400x100")

label = Label(window,text="input : ?")
label.pack()

value = askinteger("","1~6 value insert",minvalue=1,maxvalue=6)
label.config(text=str(value))

window.mainloop()








