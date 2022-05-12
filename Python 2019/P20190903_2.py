# 3 subjects scores
import random

kor = 90
eng = random.randrange(0,100)
mat = input("mat : ")
mat = int(mat)

tot = kor + eng +mat
ave = tot/3

if(ave >= 90) :
    grade = "A"
elif(ave >= 80) :
    grade = "B"
elif(ave == 70) :
    grade = "C"
else :
    grade = "F"


print("kor = %d" % kor)
print("eng = %d" % eng)
print("mat = %d" % mat)
print("tot = %d" % tot)
print("ave = %d" % ave)
print("grade = %s" % grade)
