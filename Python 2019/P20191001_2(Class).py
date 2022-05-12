#1001-3
#class

class Car :

    #field
    name = ""
    color = ""
    speed = 0
    count = 0
    # private int count X
    # static in tcount = 0;

    #construction
    def __init__(self,color,name) :
        self.speed = 0
        self.color = color
        self.name = name
        #self.count += 1
        Car.count += 1  #!!!!!

    def SpeedUp(self,value) :
        self.speed += value
        if self.speed > 120 :
            self.speed = 120
            print("over 120Km")
        self.info()
    def SpeedDown(self,value) :
        self.speed -= value
        if self.speed < 0 :
            self.spee = 0
            print("Stop")
        self.info()
            
    
    def info(self) :
        print("kind : %s / color : %s / speed : %d / count : %d" %
              (self.name,self.color,self.speed, Car.count))

#main
avante = Car("white", "avante")
#avante.name = "avante"
#avante.color = "white"
avante.SpeedUp(10)
avante.SpeedUp(20)
avante.SpeedUp(30)
