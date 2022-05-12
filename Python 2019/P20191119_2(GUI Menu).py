#1119-2.py
#menu

from tkinter import *
from tkinter import messagebox

# 버튼 클릭시 이벤트
def func_open() :
    messagebox.showinfo("메뉴 선택","열기 메뉴")

def func_exit() :
    window.quit()       # 프로그램 종료
    window.destroy()    # 창 종

window = Tk()

mainMenu = Menu(window)
window.config(menu=mainMenu)

fileMenu = Menu(mainMenu)
# 창에 메뉴 "파일"을 추가
mainMenu.add_cascade(label="파일",menu=fileMenu)

fileMenu.add_command(label="열기",command=func_open)
fileMenu.add_separator()
fileMenu.add_command(label="종료",command=func_exit)

window.mainloop()
