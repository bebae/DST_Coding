#1105 - 1

# 레이아웃
# java
# class W extends Frame
# Panel p1 = new Panel();
# p1.setLayout(new BorderLaout()) center;
# p1.setLayout(new FlowLaout()) top left;
# GridLayout(2,2);
# Frame f = new Frame();
# f.add(p1);

# app xml UI

from tkinter import *

window = Tk()
window.geometry("300x400")

button1 = Button(window,text="버튼 1",bg="yellow")
button1["fg"] = "blue"
button2 = Button(window,text="버튼 2",font=("돋움체",20))
button3 = Button(window,text="버튼 3")

photo1 = PhotoImage(file="../img/dog.png")

button4 = Button(window,image=photo1)

button1.pack()
button1.place(x=0,y=0)
button2.place(x=100,y=100)
button3.place(x=200,y=200)
button4.place(x=0,y=200)

    

window.mainloop()
