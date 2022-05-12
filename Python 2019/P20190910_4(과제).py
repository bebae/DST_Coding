#0910-4.py

import random

class_no = [26,23,20]       # a:26 b:23 c:20
score = []                  # 성적 갯수? n


def func_call(m,n) :      # m = 1 class 26? 23? 20? 매개변수
    while True :
        print("\n=================")
        print("   1. ave        ")
        print("   2. max        ")
        print("   3. min        ")
        print("   4. result     ")   # 1 class list
        print("   5. exit       ")   # 1 class >>
        print("=================")
        sel = int(input("You select(1~5) : "))
        if sel == 1:
            print("\n-----------------")
            print("   tot = %d" % tot1[n])
            print("   ave = %d" % ave1[n])
            print("-----------------")
            

        elif sel == 2 :
            imax = 0
            for i in range(0,m) :
                if imax < score[i] :
                    imax = score[i]
            print("\n-----------------")
            print("   imax = %d" % imax)
            print("-----------------")

        elif sel == 3 :
            imin = 100
            for i in range(0,m) :
                if imin > score[i] :
                    imin = score[i]
            print("\n----------------")
            print("   imin = %d" %imin)
            print("-----------------")
    
        elif sel == 4 :
            print("\n---------------------")
            for i in range(0,m) :
                print("   score[%2d] : %d" % (i+1,score[i]))
            print("---------------------")
        elif sel == 5 : break
        else : break

tot1 = []       #전체 합계를 위한 배열
ave1 = []       #전체 평균

L = len(class_no)   # 배열 길이
# 점수 선언
for j in range(0,L) :
        tot = 0
        ave = 0
        
        n = class_no[j]
                      
        for i in range(0,n) :
            score.append(0)
        for i in range(0,n) :
            score[i] = random.randrange(0,40)+60
            tot += int(score[i])
            
        ave1.append(int(tot/n))
        tot1.append(tot)


while True :
    print("\n=================")
    print("  1. A반        ")
    print("  2. B반        ")
    print("  3. C반        ")
    print("  4. 전체       ")
    print("  5. 종료")
    print("=================")
    cho = int(input("You select(1~4) : "))
    


# 배열을 위한 매개변수
  
    if cho == 1 :
        func_call(class_no[0],0)
        continue
    if cho == 2 :
        func_call(class_no[1],1)
        continue
    if cho == 3 :
        func_call(class_no[2],2)
        continue
    if cho == 4 :       #전체 반의 합,평균

        print("\n-----------------\n")
        for i in range(0,L) :
            if i == 0 : grade = "A"
            elif i == 1 : grade = "B"
            elif i == 2 : grade = "C"
            else : grade = "?"
            
            print("      %s반 " % grade)
            print("  tot = %d" % tot1[i])
            print("  ave = %d\n" % ave1[i])

        print("   총  합 = %d" % (tot1[0]+tot1[1]+tot1[2]))
        print("   총평균 = %d" % ((ave1[0]+ave1[1]+ave1[2])/3))
        print("-----------------")
    
            
        continue
    elif cho == 5 :
        print("프로그램 종료")
        break
    else :
        print("-----------------")
        print("다시 선택")
        continue
