

import random

score = [] #배열
tot = 0

n = int(input("n : "))
for i in range(0,n) :
    score.append(0) # int score[n]

for i in range(0,n) :
    score[i] = random.randrange(0,40) + 60
    tot += int(score[i])
    print("score[%d] = %d" % (i,int(score[i])) )
print("tot = %d" % tot)
l = len(score)          # 배열의 길이
print("len = %d" % l)
ave = tot/n
print("ave = %d" % ave)
ave = tot / len(score)  # java score.length
print("ave(len) = %d" % ave)
