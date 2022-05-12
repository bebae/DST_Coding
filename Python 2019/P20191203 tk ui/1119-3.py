from tkinter import *
import random

window = Tk()
w = Canvas(window, width=300, height=300)
w.pack()

w.create_line(0,0,300,300)
w.create_line(0,0,300,100,fill="red")

#color = colorchooser.askcolor()

color= ["red", "orange", "yellow", "green", "blue"]
fill_color = random.choice(color)
w.create_rectangle(50,50,200,200,fill=fill_color)
#w.create_rectangle(50,50,200,200,fill=color[1])

w.create_oval(10,10,200,150)
w.create_arc(10,10,150,150, extent=90, style=ARC)

for degree in range(0,360,30) :
    w.create_arc(10,10+degree//5, 200, 150+degree//5,
                     extent=degree, style=ARC)
    
w.create_text(200,200,text="welcome to python")
w.create_text(200,200,text="welcome to python", fill="tan",
                  font=("중고딕", 20))

img = PhotoImage(file="..\gif\cat.gif")
w.create_image(20,20,anchor=NW, image=img)

window.mainloop()
