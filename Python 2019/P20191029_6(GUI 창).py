#1029-6.py

from tkinter import *
import tkinter.messagebox

btnList = [""]*9
fnameList=["eclair.gif","froyo.gif","gingerbread.gif","honeycomb.gif","icecream.gif"
           , "jellybean.gif","kitkat.gif","lollipop.gif","marshmallow.gif"]
photoList=[None]*9
i,k=0,0
num=0

def clickImage(event) :
    tkinter.messagebox.showinfo("3x3 gamebox","image click")

window=Tk()
window.geometry("210x210")

for i in range(0,9) :
    photoList[i] = PhotoImage(file="../GIF/" +fnameList[i])
    btnList[i] = Button(window,image=photoList[i])

#layout
for i in range(0,3) :
    btnList[num].grid(row=i)
    for k in range(0,3) :
        btnList[num].grid(row=i,column=k)
        num += 1

for i in range(0,9) :
    btnList[i].bind("<Button>",clickImage)

window.mainloop()
