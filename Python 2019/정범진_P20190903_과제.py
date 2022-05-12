
import random
import turtle as t

while True :
    print("-------------------")
    print(" 1. x ~ y hap   ")
    print(" 2. 4칙 연산    ")
    print(" 3. 거북이 graphic")
    print(" 4. 종료        ")
    print("-------------------")

    choice = int(input("선택 : "))
    if (choice == 1) :
        print("X ~ Y의 합")
        hap = 0
        count = 0
        x = random.randrange(1,10)
        y = random.randrange(11,100)

        for i in range(x,y+1) :
            hap += i
            count += 1
        print("-------------------")
        print("x = %d" % x)
        print("y = %d" % y)

        print("hap = %d" % hap)
        print("ave = %d" % (hap/count))
        print("-------------------")

        continue
    elif (choice == 2) :
        print("4칙 연산")
        x = random.randrange(1,20)
        y = random.randrange(0,20)

        print("-------------------")
        print("x = %d" % x)
        print("y = %d" % y)

        print("x + y = %d" % (x+y))
        print("x - y = %d" % (x-y))
        print("x * y = %d" % (x*y))
        print("x / y = %d" % (x/y))
        print("-------------------")

        
        continue
    elif (choice == 3) :
        print("turtle 그래픽")
        print("-------------------")
        print("  1. 삼각형")
        print("  2. 사각형")
        print("  3. 오각형")
        print("  4. 육각형")
        print("-------------------")
        angle = int(input("선택 : "))

        
        if (angle == 1) :
            t.fd(100)
            for i in range(0,2) :
                t.lt(120)
                t.fd(100)
            
        elif (angle == 2) :
            t.fd(100)
            for i in range(0,3) :
                t.lt(90)
                t.fd(100)
        elif (angle == 3) :
            t.fd(100)
            for i in range(0,4) :
                t.lt(72)
                t.fd(100)
        elif (angle == 4) :
            t.fd(100)
            for i in range(0,5) :
                t.lt(60)
                t.fd(100)
        else :
            ("입력 실패")
            continue
       
        t.mainloop()
        print("프로그램 종료")
        break
    elif (choice == 4) :
        print(" 종료 ")
        break
    else :
        print("다시 선택하세요!")
        continue
        
