# graphio uset interface
from tkinter import *

window = Tk()
window.title("gul test")
window.geometry("400x400")

l1 = label(window.text="강아지",font=("굴림",30),
           fg="blue",bg="yellow")
l1.pack()

# 이미지
photo = Photolmage(file="dog.gif")
l2 = Label(window, image=photo)
l2.pack() #윈도우 창에 붙이기

b1 = Button(window,text"Push",fg="blue",bg="yellow")
    
        
