import time
from tkinter import *

window = Tk()
w = Canvas(window, width=400, height=400)
w.pack()

one = w.create_oval(10,100,50,150, fill="green")

for i in range(100) :
    w.move(one,3,0)
    window.update()
    time.sleep(0.1)
