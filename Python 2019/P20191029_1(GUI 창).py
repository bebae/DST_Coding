#GUI(Graphic User Interface) with tutle grahic. TK
#1029-1.py

from tkinter import *

#창 설정
window = Tk()
window.title("Gui Test")
window.geometry("400x400")

#텍스트
label1 = Label(window,text="Welcome to python",font=("휴먼옛체",30),fg="blue",bg="yellow")
label1.pack()

#사진
photo = PhotoImage(file="../img/hart.png") # 확장자 변환X / PNG,GIF 
label2 = Label(window,image=photo)
label2.pack()

window.resizable(width=FALSE,height=FALSE)
window.mainloop()

#버튼
button1 = Button(window,text="push",fg="white",bg="black")
button1.pack()


###java###
# import java.awt.*
# class Win extends Frame
# Frame f = new Frame()
# f.setvisible(true)

# Label label1 = new Label();

###java script###
# windown(?).open("","",width=400, height=400)

