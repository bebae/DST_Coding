#1119-5.py
#dialog

from tkinter import *
from tkinter.filedialog import *

window = Tk()
window.geometry("400x100")

label = Label(window,text="file name : ?")
label.pack()

filename = asksaveasfile(parent=window,mode="w",defaultextension=".jpg",
                           filetype=(("JPG 파일","*.jpg:*.jpg"),("모든 파일","*.*")))

label.config(text=str(filename))

window.mainloop()








