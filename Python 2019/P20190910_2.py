#0910-2.py
# 3과목 점수
# 1. progam value init
# 2. scan input
# 3. 랜덤 지정

import random

kor = eng = mat = 90

kor = random.randrange(0,40) + 60
eng = random.randrange(0,40) + 60
mat = random.randrange(0,40) + 60

#kor = int(input("kor : "))
#eng = int(input("eng : "))
#mat = int(input("mat : "))


tot = kor+eng+mat
ave = tot/3

if  (ave >= 90) : grade = "A"
elif(ave >= 80) : grade = "B"
elif(ave >= 70) : grade = "C"
elif(ave >= 60) : grade = "D"
else            : grade = "F"


print("----------------")
print("kor = %d" % kor)
print("eng = %d" % eng)
print("mat = %d" % mat)
print("tot = %d" % tot)
print("ave = %d" % ave)
print("grade = %s" % grade)
print("----------------")
