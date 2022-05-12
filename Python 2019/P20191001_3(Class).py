#1001-6.py
# not class

import random
class Sungjuk :

    # 생성자 function
    def __init__(self) :
        self.kor = random.randrange(40,100)
        self.eng = random.randrange(40,100)
        self.mat = random.randrange(40,100)

    def sungjuk_cal(self) :
        self.tot = self.kor + self.eng + self.mat
        self.ave = self.tot / 3

        if self.ave >= 90 :
            self.grade = "A"
        elif self.ave >= 80 :
            self.grade = "B"
        elif self.ave >= 70 :
            self.grade = "C"
        else :
            self.grade = "D"
    # method function
    def info_print(self) :
        print("kor :   %d" % self.kor)
        print("eng :   %d" % self.eng)
        print("mat :   %d" % self.mat)
        print("tot :   %d" % self.tot)
        print("ave :   %d" % self.ave)
        print("grade : %s" % self.grade)

#main
# s : object instance
s = Sungjuk()
s.sungjuk_cal()
s.info_print()
