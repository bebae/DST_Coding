#20190917-2
#주사위 3개

import random

#1
dice1 = random.randrange(1,6)
dice2 = random.randrange(1,6)
dice3 = random.randrange(1,6)

hap = dice1+dice2+dice3

print("dice1 = %d" % dice1, end=" ")
print("hap = %d" % hap)

#2
print("---------------------")

dice=[]
hap=0
for i in range(0,3) :
    dice.append(random.randrange(1,6))
    print("dice[%d] : %d" % (i,dice[i]))
    hap += dice[i]
print("hap = %d" % hap)

#3  3명 주사위-3개 
print("--------------------")

hap = [0,0,0]
for i in range(0,3) :
    dice = []
    for j in range(0,3) :
        dice.append(random.randrange(1,6))

        print("dice[%d] : %d" % (i,dice[j]), end=" ")
        hap[i] +dice[j]
    print("\nhap[%d] = %d" % (i,hap[i]))
    
        





