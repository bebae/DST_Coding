#1119-3.py
#dialog

from tkinter import *
from tkinter.filedialog import *

window = Tk()
window.geometry("400x100")

label = Label(window,text="file name : ?")
label.pack()

filename = askopenfilename(parent=window,filetype=(("GIF 파일","*.gif"),("모든 파일","*.*")))

label.config(text=str(filename))

window.mainloop()








