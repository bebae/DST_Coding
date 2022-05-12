#1112-4.py
# WASD
from tkinter import *



#함수 이벤트
def keyEvent(event) :
    photo = PhotoImage(file="../img/dog3.gif")
    # chr() : 문자로 변환
    if chr(event.keycode) == "W" :
        photo = PhotoImage(file="../img/dog4.gif")
    elif chr(event.keycode) == "A" :
        photo = PhotoImage(file="../img/cat2.gif")
    elif chr(event.keycode) == "D" :
        photo = PhotoImage(file="../img/rabbit.gif")
    elif chr(event.keycode) == "S" :
        photo = PhotoImage(file="../img/dog3.gif")

    L1.configure(image=photo)
    L1.image = photo


# 과제 부분
def UpKey(event) :
    global Y
    Y -= 20
    if(Y > -10):        # 사진이 프레임 밖으로 나가기 방지
        L1.place(x=X,y=Y)
    else :
        Y += 20
def DownKey(event) :
    global Y
    Y += 20
    if(Y < (610-200)):
        L1.place(x=X,y=Y)
    else :
        Y -= 20
    
def LeftKey(event) :
    global X
    X -= 20
    if(X > -10):
        L1.place(x=X,y=Y)
    else :
        X += 20
    
def RightKey(event) :
    global X
    X += 20
    if(X < (610-200)):
        L1.place(x=X,y=Y)
    else :
        X -= 20
    

# 이미지 위치 초기값
X = 200
Y = 200
      
# 창 설정
window = Tk()
window.geometry("600x600")
window.resizable(width=False,height=False)  #프레임 크기조절 방지

# 이미지 라벨
photo = PhotoImage(file="../img/cat2.gif")
L1 = Label(window,image=photo)
L1.pack(expand=1,anchor=CENTER)
# 이미지 위치 지정
L1.place(x=X,y=Y)

# 이벤트 호출
window.bind("<Key>",keyEvent)

# 키보드 설정 (방향키)
window.bind("<Up>",UpKey)
window.bind("<Down>",DownKey)
window.bind("<Left>",LeftKey)
window.bind("<Right>",RightKey)

window.mainloop()
