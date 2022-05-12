#1011-3.py
# 답안지 체크

import random


class Check :
    jungdap = [1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4]
    stu_dapji = [None] * 20
    ox =        [None] * 20
       
    def dapji(self) :
        for i in range(20) :
            stu_dapji[i] = random.randrange(0,4) + 1 #1 2 3 4
    def dapji_check(self) :
        o = 0
        x = 0
        for i in range(20) :
            if stu_dapji[i] == jungdap[i] :
                o += 1
                ox[i] = "O"
            else :
                x += 1
                ox[i] = "X"
        jumsu = o*5
        return jumsu


    def result(self,jumsu) :
        
        print("정답 : ", end=" ")
        for i in range(20) :
            print("%d " % jungdap[i], end=" ")
        print("")

        print("학생 : ", end=" ")
        for i in range(20) :
            print("%d " % stu_dapji[i], end=" ")
        print("")

        print("OX   : ", end=" " )
        for i in range(20) :
            print("%c " % ox[i], end=" ")
        print("")

        print("jumsu = %d" %jumsu)


#main
        
c = Check()
c.dapji()
jumsu = c.dapji_check()
c.result(jumsu)



