#1203 main.py
from tkinter import *

import turtle as t

def func_help() :
    massgebox.showinfo("도움말","help fuction")

def func_exit() :
    window.quit()
    window.destroy()

window = Tk()
window.geometry("200x150")

mainMenu = Menu(window)
window.config(menu=mainMenu)

fileMenu = Menu(mainMenu,tearoff=0)

mainMenu.add_cascade(label="파일",menu=fileMenu)
fileMenu.add_command(label="도움말",command=func_help)
fileMenu.add_separator()
fileMenu.add_command(label="종료",command=func_exit)

fileMenu = Menu(maniMenu)



window.mainloop()
