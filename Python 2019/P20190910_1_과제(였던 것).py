#0910-1.py

import random
def func_hap() :    #func define
    hap = 0
    x = random.randrange(0,3)
    y = random.randrange(10,20)

    for i in range(x,y) :
        hap += i
    print("---------------------")
    print("x = %d" % x)
    print("y = %d" % y)
    print("hap = %d" % hap)

def func_else() :
    print("else call")

#main 함수격
while True :
    print("---------------------")
    print("  1 : X ~ Y hap      ")
    print("  2 : 4칙 연산       ")
    print("  3 : turtle graphic ")
    print("  4 : 종료           ")
    choice = int(input("선택 : "))

    if choice == 1:
        func_hap()  #함수 불러오기
    else :
        print("error")
