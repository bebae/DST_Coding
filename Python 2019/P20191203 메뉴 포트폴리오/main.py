from tkinter import*
from tkinter.simpledialog import*
from tkinter.colorchooser import*
from time import*
import turtle as t
import math as m
import random


from tdgraph import*
from td import*
from bubblesort import*
from imageslide import*

def func_open():
    messagebox.showinfo("메뉴선택", "도움말")

def func_exit():
    window.quit()
    window.destroy()

window=Tk()
window.geometry("200x150")

mainMenu=Menu(window)
window.config(menu=mainMenu)

fileMenu=Menu(mainMenu)
mainMenu.add_cascade(label="파일",menu=fileMenu)
fileMenu.add_command(label="도움말",command=func_open)
fileMenu.add_separator()
fileMenu.add_command(label="종료",command=func_exit)

fileMenu=Menu(mainMenu)
mainMenu.add_cascade(label="GUI",menu=fileMenu)
fileMenu.add_command(label="이미지슬라이드",command=imageslide)
fileMenu.add_command(label="2차원그래프",command=tdgraph)

fileMenu=Menu(mainMenu)
mainMenu.add_cascade(label="수식연산",menu=fileMenu)
fileMenu.add_command(label="2차원방정식",command=td)
fileMenu.add_command(label="버블소트",command=bubble)

window.mainloop()

