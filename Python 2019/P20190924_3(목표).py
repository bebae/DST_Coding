

import random

class Compare :
    #field
    x = 0
    y = 0

    #construction
    def __init__(self) :
        self.x = 10
        self.y = 20

    #method
    def func_compare(self) :
        #대소비교
        if(self.x > self.y) :
            print("%d > %d" % (self.x,self.y))
        elif(self.x==self.y) :
            print("%d = %d" % (self.x,self.y))
        else :
            print("%d < %d" % (self.x,self.y))

#main
c = None
c = Compare()
c.func_compare()
print("─────────")
