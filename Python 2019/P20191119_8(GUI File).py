#1119-9.py
#file

# 파일에서 텍스트 읽어오기

# 선언
infp = None
inList = ""


infp = open("20191119-6(GUI Menu).py","r",encoding="utf-8")

while True :
    instr = infp.readline()
    if instr == "" :
        break
    print(instr,end="")

infp.close()


