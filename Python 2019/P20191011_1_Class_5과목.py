#1011-1.py
#kias os db sys ca ic
# ave 60 40 drop

import random

class Kisa :
    #field
    os = db = ca = sys = ic = 0
    ave = 0
    sucess =""#pass nonpass drop

    #construction
    def __init__(self) :
        self.os = random.randrange(30,100)
        self.db = random.randrange(30,100)
        self.ca = random.randrange(30,100)
        self.sys = random.randrange(30,100)
        self.ic = random.randrange(30,100)
        
    #method
    def kisa_check(self) :
        self.ave = (self.os+self.db+self.ca+self.sys+self.ic)/ 5

        if self.ave >= 60 :
            self.sucess = "pass"
        else : 
            self.sucess = "nonpass"

        if self.os < 40 or self.db < 40 or self.ic < 40 or self.sys < 40 or self.ic < 40 :
                self.sucess = "drop"

    def result(self) :
        print("os = %d" % self.os)
        print("db = %d" % self.db)
        print("ca = %d" % self.ca)
        print("sys = %d" % self.sys)
        print("ic = %d" % self.ic)
        print("ave = %d" % self.ave)
        print("sucess = %s" % self.sucess)
        print("───────────────")

    # if self.sucess == "pass" : 0 += 1 합격자 수 count


#main

n = input("인원수 : ")
n = int(n)
for i in range(n) :
            
    k = Kisa()
    k.kisa_check()
    k.result()









        
        
    
