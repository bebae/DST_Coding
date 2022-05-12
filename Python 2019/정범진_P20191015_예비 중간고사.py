# 20191015 중간고사 예비


import random

class Board :
            
      pan = [0,1,2,3,4,5,6,-7,8,9,-10,11,-12,13,14,-15,16,17,18,19,-20,21,22,-23,24,25,26,27,-28,29,30,-30,32,33,-34,35,36]
      
      def dice(self,p) :

            #전역 변수
            global loca1      #플레이어 1 위치
            global loca2
            money1 = 500       # 초기 자금
            money2 = 500

            print("┌──────────┐")
            if(p == 1) :
                  loca = loca1
                  money = money1
                  print("│     플레이어 1     │")
            else :
                  loca = loca2
                  money = money2
                  print("│     플레이어 2     │")
            print("└──────────┘")
            if(loca < 36) :
                  dice = random.randrange(1,6)
                  print("dice  :  %d  " % dice, end=" ")
                  next_can = loca+dice
                  if (next_can > 36) :
                        next_can = 36
                        
                  # 지옥 확인
                  if (self.pan[next_can] < 0) :
                        
                        print("현위치:%d " % loca, end=" ")
                        print("그 앞은 지옥 입니다")
                  else :
                        loca += dice
                        if(loca > 35) :
                              print("!!골인!!")
                        else :
                              print("현위치:%d " % loca)
                              
                        # money
                        if(loca == 3 or loca == 6 or loca == 13) :
                              money += 100
                              print("money get!! ", end=" ")
                        elif(loca == 21 or loca == 32) :
                              money += 300
                              print("money get!! ", end=" ")
                        elif(loca == 18) :
                              money += 500
                              print("money get!! ", end=" ")
                        elif(loca == 25) :
                              money -= 100
                              print("money lose..", end=" ")
                        elif(loca == 29) :
                              money -= 200
                              print("money lose..", end=" ")
                        elif(loca == 33) :
                              money -= 500
                              print("money lose..", end=" ")
                  if(money1 < 0) :
                        money = 0
                  print("소지금:%d" % money)
                  
                  if(p == 1) :
                        loca1 = loca
                        money1 = money
                        # 잡기
                        if(loca2 == loca) :
                              print("플레이어 1이 플레이어 2를 잡았습니다!")
                              print("플레이어 2 시작지점으로!")
                              loca2 = 0
                  else :
                        loca2 = loca
                        money2 = money
                        
                         # 잡기
                        if(loca1 == loca) :
                              print("플레이어 2가 플레이어 1를 잡았습니다!")
                              print("플레이어 1 시작지점으로!")
                              loca1 = 0

                  print("─────────────────")

            else :
                  print("게임 종료")
            
      
      def exit(self) :
            sel = int(input("\n────확인용────"))
            print("───────프로그램 종료─────────")

#main

n = input("아무 버튼이나 입력 : ")
n = int(n)

p1 = 1
p2 = 2

loca1 = 0
loca2 = 0


b = Board()

while(1) :
      b.dice(p1)
      if (loca1 > 35) :
            print("플레이어 1이 승리 했습니다!")   
            break
      b.dice(p2)
      if (loca2 > 35) :
            print("플레이어 2가 승리 했습니다!")
            break
b.exit()





