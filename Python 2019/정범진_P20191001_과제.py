#1001-7
# 2개 integer 숫자
# 4칙 루핑


import random

class Two :

    #field
    x = 0
    y = 0
    tot = 0

    #construction
    def __init__(self) :
        self.x = random.randrange(1,11)
        self.y = random.randrange(1,11)


    def chick(self) :
        print("──────────")
        print("      4칙 연산 ")
        print("──────────")
        print("    %d + %d = %2d" % (self.x, self.y, self.x + self.y))

        print("    %d - %d = %2d" % (self.x, self.y, self.x - self.y))

        print("    %d * %d = %2d" % (self.x, self.y, self.x * self.y))
 
        print("    %d / %d = %2d" % (self.x, self.y, self.x / self.y))
        print("──────────")

    def looping(self) :
        self.tot = 0

        print("     구간의 합")
        print("──────────")
        if (self.x > self.y) :
            for i in range(self.y,self.x+1) :
                self.tot += i
                
            print("       Y < X   ")
            print("   Y ~ X Sum = %d" % self.tot)
            
        elif(self.y > self.x) :
            for i in range(self.x,self.y+1) :
                self.tot += i
                
            print("       X < Y   ")
            print("   X ~ Y Sum = %d" % self.tot)
            
        else :
            print("       X = Y   ")
            print("   X ~ Y Sum = %d" % self.tot)

        print("──────────")
    def exit(self) :
        sel = int(input("\n────확인용────"))
        print("───────프로그램 종료─────────")
        
            
#main
t = Two()
t.chick()
t.looping()

t.exit()


        
        
