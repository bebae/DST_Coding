#1112-5.py
#login UI

from tkinter import *

window = Tk()

L1 = Label(window, text="아이디")
L1.grid(row=0)
L2 = Label(window, text="비밀번호")
L2.grid(row=1)

E1 = Entry(window)     # <input type="text" name="">
E1.grid(row=0,column=1)
E2 = Entry(window)
E2.grid(row=1,column=1)


B1 = Button(window,text="종료",command=quit)
B1.grid(row=3,column=0,sticky=W)
