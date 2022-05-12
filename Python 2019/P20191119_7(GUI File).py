#1119-8.py
#file

# 파일에서 텍스트 읽어오기

# 선언
infp = None
inList = ""


infp = open("data.txt","r",encoding="utf-8")

inList = infp.readlines()

for inStr in inList :
    print(inStr,end="")

infp.close()


