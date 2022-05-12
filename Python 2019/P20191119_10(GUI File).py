#1119-10.py
#file
# 성적 파일 입출력

import os

inf = None
ifname = ""
sum = 0
w = [] #list

ifname = input("input file name : ")    #data1.txt

# 파일 여부
if os.path.exists(ifname) :

    inf = open(ifname,"r",encoding="utf-8")

    for line in inf :
        line = line.rstrip()
        w = line.split()
        for score in range(1,len(w)) :
            sum += int(w[score])    # 파일에서 숫자를 int로 변환하여 sum +=
        print(sum)
        sum = 0
    inf.close()
else : print("%s file not exsts" % ifname)


