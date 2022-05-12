#1112-2.py

from tkinter import *
from time import *
import random

#image 슬라이드
fnameList=["jeju1.gif","jeju2.gif","jeju3.gif","jeju4.gif","jeju5.gif",
            "jeju6.gif","jeju7.gif","jeju8.gif","jeju9.gif"]
photoList=[None]*9
num = 0     # 그림의 위치

#함수 이벤트
def clickPrev() :
    global num
    num -= 1
    if num < 0 :
        num=0
    photo=PhotoImage(file="../img/"+fnameList[num])
    pLabel.configure(image=photo)
    pLabel.image = photo
    
def clickNext() :
    global num
    num += 1
    if num > 8 :
        num=8
    photo=PhotoImage(file="../img/"+fnameList[num])
    pLabel.configure(image=photo)
    pLabel.image = photo

def clickRand() :
    global num
    num = random.randrange(0,8)
    photo=PhotoImage(file="../img/"+fnameList[num])
    pLabel.configure(image=photo)
    pLabel.image = photo

def pageUp(event) :
    clickPrev()

def pageDown(event) :
    clickNext()
      
# 프레임 창 
window = Tk()
window.geometry("700x500")
window.title("jeju image slide")

# 키보드 설정 (PageUp,PageDown)
window.bind("<Prior>",pageUp)
window.bind("<Next>",pageDown)

# 버튼 + 이벤트 호출
btnPrev = Button(window,text="<<이전", command=clickPrev)
btnNext = Button(window,text="다음>>", command=clickNext)
btnRand = Button(window,text="<임의>", command=clickRand)

#이미지 보여주기
photo=PhotoImage(file="../img/" + fnameList[0])
pLabel = Label(window,image=photo)

# 버튼 위치
btnPrev.place(x=250,y=10)
btnNext.place(x=400,y=10)
btnRand.place(x=325,y=10)
pLabel.place(x=15,y=50)

window.mainloop()

