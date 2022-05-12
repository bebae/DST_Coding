
from tkinter import *


def myfunc1() :
    print("pushed button1")
def myfunc2() :
    print("pushed button2")
def myfunc3() :
    print("pushed button3")

#창 설정
window = Tk()
window.title("Button Test")
window.geometry("900x300")

#사진
photo1 = PhotoImage(file="../img/hart.png")
photo2 = PhotoImage(file="../img/dog.png")
photo3 = PhotoImage(file="../img/dog.png")
photo1 = photo1.zoom(20)
photo2 = photo2.zoom(20)

photo1 = photo1.subsample(32)
photo2 = photo2.subsample(32)

button1 = Button(window,image=photo1,command=myfunc1)
button2 = Button(window,image=photo2,command=myfunc2)
button3 = Button(window,image=photo3,command=myfunc3)
exitbutton = Button(window,text="Exit",command=quit)
exitbutton["fg"]="#0000FF"
exitbutton["bg"]="yellow"

button1.pack(side=LEFT)
button2.pack(side=LEFT)
button3.pack(side=LEFT)
exitbutton.pack(side=LEFT)

