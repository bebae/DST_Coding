#0924-22.py
# two integer num
# 4칙. 비교 . 구간 합
# looping and list
# 3 times

import random


def calculate(xnum,ynum) :
    print("─────4칙 연산─────\n")
    for i in range(0,3) :
        # 4칙

        print("  ─────%d─────" % (i+1))    
        z = x[i] + y[i]
        print(" │     %d + %d = %2d    │" % (x[i],y[i],z))
        z = x[i] - y[i]
        print(" │     %d - %d = %2d    │" % (x[i],y[i],z))
        z = x[i] * y[i]
        print(" │     %d * %d = %2d    │" % (x[i],y[i],z))
        z = x[i] / y[i]
        print(" │     %d / %d = %2d    │" % (x[i],y[i],z))
    print("  ───────────")

def compare(xnum,ynum) :
    print("\n─────대소 비교─────\n")
    for i in range(0,3) :

    # 대소 비교

        if (x[i]>y[i]) :
            print("      x = %d > y = %d" % (x[i],y[i]))
        elif (x[i]==y[i]) :
            print("      x = %d = y = %d" % (x[i],y[i]))
        else :
            print("      x = %d < y = %d" % (x[i],y[i]))

def hap(xnum,ynum) :
    print("\n─────구간의 합─────\n")
    # looping summing

    for i in range(0,3) :
        
        if(x[i] > y[i]) :
            
            for j in range(y[i],x[i]+1) :
                tot[i] += j

            
        elif(y[i] > x[i]) :
                
            for j in range(x[i],y[i]+1) :
                tot[i] += j

            
        else :
            tot.append(tnum)    

    for i in range(0,3) :
        print("  X:%d ~ Y:%d 값의 합 tot = %2d" % (x[i],y[i],tot[i]))

#main

x = []
y = []
tot = [0,0,0]
tnum = 0

#input
for i in range(0,3) :
    x.append(random.randrange(1,10))
    y.append(random.randrange(1,10))


calculate(x[i],y[i])
compare(x[i],y[i])
hap(x[i],y[i])





print("")
sel = int(input("──────확인용──────"))
print("─────────프로그램 종료───────────")    
