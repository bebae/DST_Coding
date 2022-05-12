#1001-1.py
#class

class Car :

    #field
    name = ""
    color = ""
    loc = 0

    #construction
    def __init__(self,name) :
        self.name = name
        self.color = color
        self.loc = 0

    #method
    def fw(slef,x) :
        self.loc += x
        if self.loc > 1000 :
            self.uturn()
            print("start u-turn")
        self.display_loc()  
            
    def dw(self,x) :
        self.loc -= x
        if self.loc < 0 :
            self.loc = 0
            print("no more bw")
        self.display_loc()

    def display_loc(slef) :
        print("%s location : %d" % (self.name,self.loc))

    def uturn() :
        self.loc = 0
        
    #def stop(self) :
            


#main
avante = Car("avante")
avante.fw(10)
avante.fw(20)

sonata = Car("sonata")
sonata.fw(10)
sonata.bw(20)

#java Car avante = new Car();

print("main end")
