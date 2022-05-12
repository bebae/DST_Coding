#1105-3.py

from tkinter import *
import tkinter.messagebox

btnList = [""]*9
fnameList=["0.png","froyo.gif","gingerbread.gif","honeycomb.gif","icecream.gif"
           , "jellybean.gif","kitkat.gif","lollipop.gif","marshmallow.gif"]
photoList=[None]*9
i,k=0,0     # loop var
num=0       # 9개 posi
xpos, ypos = 0,0    # matrix pos 1,1 / 3,3

window = Tk()
window.geometry("210x210")

for i in range(0,9) :
    photoList[i] = PhotoImage(file="../img/0.png")#+fnameList[i])
    btnList[i] = Button(window,image=photoList[i])

    
#layout - place
for i in range(0,3) :
    for k in range(0,3) :
        btnList[num].place(x=xpos,y=ypos)
        num += 1
        xpos += 70  # image size 67x67
    xpos = 0
    ypos += 70

window.mainloop()
