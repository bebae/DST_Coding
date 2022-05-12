from tkinter import *
from tkinter.ttk import *
 
class MyFrame(Frame):
    def __init__(self, master):
        Frame.__init__(self, master)
 
        self.master = master
        self.master.title("고객 입력")
        self.pack(fill=BOTH, expand=True)
 
        # 성명
        frame1 = Frame(self)
        frame1.pack(fill=X)
 
        lblName = Label(frame1, text="성명", width=10)
        lblName.pack(side=LEFT, padx=10, pady=10)
 
        entryName = Entry(frame1)
        entryName.pack(fill=X, padx=10, expand=True)
 
        # 회사
        frame2 = Frame(self)
        frame2.pack(fill=X)
 
        lblComp = Label(frame2, text="회사명", width=10)
        lblComp.pack(side=LEFT, padx=10, pady=10)
 
        entryComp = Entry(frame2)
        entryComp.pack(fill=X, padx=10, expand=True)
 
        # 특징
        frame3 = Frame(self)
        frame3.pack(fill=BOTH, expand=True)
 
        lblComment = Label(frame3, text="특징", width=10)
        lblComment.pack(side=LEFT, anchor=N, padx=10, pady=10)
 
        txtComment = Text(frame3) #html5 textarea(5,10)
        txtComment.pack(fill=X, pady=10, padx=10)
 
        # 저장
        frame4 = Frame(self)
        frame4.pack(fill=X)
        btnSave = Button(frame4, text="저장")
        btnSave.pack(side=LEFT, padx=10, pady=10)
 
 
def main():
    root = Tk()
    root.geometry("600x550+100+100")
    app = MyFrame(root)
    root.mainloop()
 
 
if __name__ == '__main__':
    main()
