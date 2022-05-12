from tkinter import *
from time import *
import random
num=0 

def imageslide():


    fnameList = ["jeju1.gif", "jeju2.gif", "jeju3.gif", "jeju4.gif", "jeju5.gif",
                 "jeju6.gif", "jeju7.gif", "jeju8.gif", "jeju9.gif"]
    photoList=[None] * 9


    def clickFir():
        global num
        num = 0
        photo = PhotoImage(master=w,file="gif/"+fnameList[num])
        pLabel.configure(image=photo)
        pLabel.image=photo
        

    def clickNext() :
        global num
        num += 1
        if num > 8 :
            num = 0
        photo = PhotoImage(master=w,file="gif/" + fnameList[num])
        pLabel.configure(image=photo)
        pLabel.image=photo

    def clickPrev() :
        global num
        num -= 1
        if num < 0:
            num = 8
        photo = PhotoImage(master=w,file="gif/" + fnameList[num])
        pLabel.configure(image=photo)
        pLabel.image=photo

    def clickRand() :
        global num
        num = random.randrange(0,8)
        photo = PhotoImage(master=w,file="gif/" + fnameList[num])
        pLabel.configure(image=photo)
        pLabel.image=photo

    def pageUp(event) :
        clickNext()

    def pageDown(event) :
        clickPrev()



    window = Tk()
    w=Canvas(window, width=700, height=500)
    window.title("사진 앨범 보기")
    w.pack()

    w.bind("<Prior>",pageUp)
    w.bind("<Next>",pageDown)

    btnFir=Button(w, text="처음",command=clickFir)
    btnPrev=Button(w, text="<<이전",command=clickPrev)
    btnNext=Button(w, text="다음>>",command=clickNext)
    btnRand=Button(w, text="랜덤", command=clickRand)

    photo=PhotoImage(master=w,file="gif/"+fnameList[0])
    pLabel=Label(w, image=photo)

    btnFir.place(x=180,y=10)
    btnPrev.place(x=250, y=10)
    btnNext.place(x=400, y=10)
    btnRand.place(x=330, y=10)
    pLabel.place(x=15,y=50)
    
    w.mainloop()
