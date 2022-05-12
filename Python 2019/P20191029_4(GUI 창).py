#1029-4.py

from tkinter import *
import tkinter.messagebox

def myfunc() :
    tkinter.messagebox.showinfo("강아지 버튼","강아쥐 귀엽지")

window = Tk()
window.geometry("300x300")
window.title("pic pushed event")

photo = PhotoImage(file="../GIF/dog4.gif")
btn = Button(window,image=photo, command=myfunc)
btn.pack()

window.resizable(width= FALSE, height=FALSE)
window.mainloop()
