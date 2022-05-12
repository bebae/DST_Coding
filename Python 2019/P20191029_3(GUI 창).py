#1029-3.py
#radio button
#padding margin

from tkinter import *

def event_hand() :
    if var.get() == 1 :
        l2.configure(image=photo1)
    elif var.get() == 2 :
        l2.configure(image=photo2)
    else :
        l2.configure(image=photo3)
        
window = Tk()
window.geometry("400x400")
window.title("pet select")

l1 = Label(window,text="like animal?",fg="blue", font=("굴림",20))

var = IntVar()
rb1 = Radiobutton(window,text="강아지",variable=var, value=1)
rb2 = Radiobutton(window,text="고양이",variable=var, value=2)
rb3 = Radiobutton(window,text="토끼",variable=var, value=3)
btnok = Button(window,text="사진보기",command=event_hand)

photo1 = PhotoImage(file="../GIF/dog3.gif")
photo2 = PhotoImage(file="../GIF/cat2.gif")
photo3 = PhotoImage(file="../GIF/rabbit.gif")

l2 =Label(window,width=200,height=200, bg="yellow", image=None)

# layout
l1.pack(padx=5, pady=5)
rb1.pack(padx=5, pady=5)
rb2.pack(padx=5, pady=5)
rb3.pack(padx=5, pady=5)
btnok.pack(padx=5, pady=5)
l2.pack(padx=5, pady=5)

window.resizable(width=FLASE, height=FALSE)
window.mainloop()
