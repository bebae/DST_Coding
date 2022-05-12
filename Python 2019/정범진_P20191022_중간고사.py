#20191022 중간고사

import random


class Check :
   
    dap     =   [None] * 20     # 답안 배열
    stu_dap =   [None] * 20     # 학생 답 배열
    ox      =   [None] * 20     # OX 저장 배열
    name  = ["청하","소향","펑티모"]

    kor = [0,0,0]    # 언어영역
    eng = [0,0,0]   # 외국어영역
    mat = [0,0,0]     # 수리영역
    tot = []     # 총점
    ave = []     # 평균
    
    def dapji(self) :    # 문제의 답 생성
        for i in range(20) :
                self.dap[i] = random.randrange(0,4)+1
       
    def stu(self) :       # 학생 답 생성
        for i in range(20) :
            self.stu_dap[i] = random.randrange(0,4)+1
    def name(self,num) :
        name1 = ["김","박","이","정","오","신","심","고"]
        name2 = ["오","대","우","동","우","준","상","지"]
        name3 = ["성","철","진","준","기","원","혁","권"]

        x = random.randrange(0,7)
        y = random.randrange(0,7)
        z = random.randrange(0,7)

        for i in range(num+1) :
            self.name = name1[x]+name2[y]+name3[z]

            
    def dap_check(self,i,j) :
        o = 0
        x = 0
        
        
        for k in range(20) :

            if self.stu_dap[k] == self.dap[k] :
                    o += 1
                    self.ox[k] = "O"
            else :
                    x += 1
                    self.ox[k] = "X"
        jumsu = o*5
        if (i == 0) :
            self.kor[j] = jumsu
        elif (i == 1) :
            self.eng[j] = jumsu
        elif (i == 2) :
            self.mat[j] = jumsu
        else :
            print("없음")
        
        return jumsu


    def result(self,jumsu,i) :
        
        #print("%s   : " % self.name[i], end=" " )
        for i in range(20) :
            print("%c " % self.ox[i], end=" ")

        print("   %d" % jumsu)
        
    def all_result(self) :

        for i in range(3) :

            print("  ")
            if(i == 0) :
                print(" 청하 ",end=" ")
            if(i == 1) :
                print(" 소향 ",end=" ")
            if(i == 2) :
                print("펑티모",end=" ")

            for j in range(3) :
                
                if(i == 0) :
                    print(" %4d " % (self.kor[j]),end=" ")
                elif(i == 1) :
                    print(" %4d " % (self.eng[j]),end=" ")
                elif(i == 2) :
                    print(" %4d " % (self.mat[j]),end=" ")
            if(i == 0) :
                print(" %4d " % (self.kor[0]+self.kor[1]+self.kor[2]),end=" ")
                print(" %4d " % ((self.kor[0]+self.kor[1]+self.kor[2])/3),end=" ")
            if(i == 1) :
                print(" %4d " % (self.eng[0]+self.eng[1]+self.eng[2]),end=" ")
                print(" %4d " % ((self.eng[0]+self.eng[1]+self.eng[2])/3),end=" ")
            if(i == 2) :
                print(" %4d " % (self.mat[0]+self.mat[1]+self.mat[2]),end=" ")
                print(" %4d " % ((self.mat[0]+self.mat[1]+self.mat[2])/3),end=" ")

   
#main
        
        
num = 3
#num = int(input("선택 : "))

C = Check()

for i in range(num) :
        
    C.dapji()
    
    if(i == 0) :
        print(" 청하 ")
    if(i == 1) :
        print(" 소향 ")
    if(i == 2) :
        print("펑티모")
        
    for j in range(num) :
        C.stu()
    
#       C.name(num)
        jumsu = C.dap_check(i,j)
        C.result(jumsu,i)
    print("")
    
#정리 출력

print("  이름   언어  외국어  수리   총점   평균  ")
print("──────────────────────")

C.all_result()






    














