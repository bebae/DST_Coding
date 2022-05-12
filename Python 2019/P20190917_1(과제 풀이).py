#20190917-1
# array=배열
# c     : int score[10];
# java  : int[] score = new int[10];
import random

hap=0
for i in range(0,10,1) :
    x = random.randrange(0,100)
    print("%d" % x, end =" ")
    hap += x
print("\nhap = %d" % hap)

#array -> list
print("-----------------")

x = []
for i in range(0,10,1) :
    y = random.randrange(0,100)
    x.append(y)

#hap
hap = 0
for i in range(0,10,1) :
    hap += x[i]
    print("%d" % x[i], end=" ")
print("\nhap = %d" % hap)

#max min
mmax = 0
maxpos = 0
mmin = 100
minpos = 0

for i in range(0,10,1) :
    print("%d" % x[i], end=" ")
    if mmax < x[i] :
        mmax = x[i]
        maxpos = i
    if mmin > x[i] :
        mmin = x[i]
        minpos = i

print("\nmax = %d" % mmax)
print("maxpos = %d" % maxpos)
print("min = %d" % mmin)
print("minpos = %d" % minpos)







        
