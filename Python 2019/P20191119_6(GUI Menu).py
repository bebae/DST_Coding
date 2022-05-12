#1119-6.py
#dialog(다이얼로그)=대화

from tkinter import *
from tkinter.filedialog import *

def func_open() :
    filename = askopenfilename(parent=window,
                              filetype=(("GIF 파일","*.gif"),("모든 파일","*.*")))
    photo = PhotoImage(file=filename)
    L1.config(image=photo)
    L1.image = photo
                
def func_exit() :
    window.quit()
    window.destroy()


def fune_gr() :
    print("그래픽")
def fune_score() :
    print("점수")
def fune_jumsu() :
    print("점수")
    
# 창의 기본구성
window = Tk()
window.geometry("400x400")
window.title("명화 감상")

photo = PhotoImage()
L1 = Label(window, image=photo)
L1.pack(expand=1,anchor=CENTER)         # pack=붙이기/(옵션)=확장/가운데

mainMenu = Menu(window)
window.config(menu=mainMenu)
fileMenu = Menu(mainMenu)           # fileMenu를 mainMenu에 넣는다

mainMenu.add_cascade(label="파일",menu=fileMenu)   # 추가

#menu item
#fileMenu.add_command(label="열기", command=func_open)
fileMenu.add_command(label="종료", command=func_exit)

exeMenu = Menu(mainMenu)
mainMenu.add_cascade(label="포트폴리오", menu=exeMenu)
exeMenu.add_command(label = "그래픽", command=fune_gr)
exeMenu.add_command(label = "score", command=fune_score)
exeMenu.add_command(label = "check jumsu", command=fune_jumsu)


window.mainloop()
