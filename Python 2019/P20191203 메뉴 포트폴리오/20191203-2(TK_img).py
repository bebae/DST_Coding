# imageslide.py

from tkinter import *
import random

num = 0

    def imageslide() :

        photList = [None]*9
        for i in range(0,len(photList)) :
            fnameList = f"jeju{i}.gif"


    def click_bw() :
        global num
        num -= 1
        if num < 0 :
            num = 8

        photo = PhotoImage(master=w,file="img/"+fnameList[num])
        pLabel.config(image=photo)
    def click_rand() :
        global num
        num = random.randrange(0,8)
        if num < 0 :
            num = 8

        photo = PhotoImage(master=w,file="../img/"+fnameList[num])
        pLabel.config(image=photo)
    def click_fw() :
        global num
        num += 1
        if num > 8 :
            num = 0

        photo = PhotoImage(master=w,file="../img/"+fnameList[num])
        pLabel.config(image=photo)



    window = TK())
    w=Canvas(window.width=700,hegiht=500)
    window.title("image slibe")

    btnbw = Button(w,text="<<이전",command=click_bw)
    btnRand = Button(w,text="임의",command=click_rand)
    btnfw = Button(w,text="다음>>",commad=click_fw)

    photo = PhotoImage(master=w,file="img/"+fnameList[0])
    pLabel.config(w.image = photo)

    btnbw.place(x=250,y=10)
    btnrand.place(x=330,y=10)
    btnfw.place(x=410,y=10)

    pLabel.place(x=15,y=50)

    w.mainloop()








