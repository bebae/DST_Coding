#1119-9.py
#file
# 파일 입출력

import os

# 선언
infp = None
outfp = None
inList = ""
outList = ""

infile = ""
outfile = ""

infile = input("입력 파일명 입력")
outfile = input("출력 파일명 출력")

if os.path.exists(infile) : #data.txt
    infp = open("data.txt","r",encoding="utf-8")
    outfp = open("outfile","w",encoding="utf-8")

    while True :
        instr = infp.readline()
        if instr == "" :
            break
        print(instr, end="");

        infp.close()
        outfo.close()

else :
    print("%s file not exists"% infile)
    

