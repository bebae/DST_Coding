import time
from tkinter import *

window = Tk()
window.geometry('500x500+0+0');

w1 = Canvas(window, width=400, height=400, bg='cyan')
w1.pack()

w2 = Canvas(window, width=200, height=200, bg='yellow')
w2.pack()

one = w1.create_oval(10,100,50,150, fill="green")

for i in range(100) :
    w1.move(one,3,0)
    window.update()
    time.sleep(0.1) #delay
