# Exam-20191015.py

import random

class Game :
    
    def iniData(self) :
        self.Money = 500
        self.Dice = 0
        self.Loc = 0

    def rollDice(self) :
        self.Dice = random.randrange(0,6) + 1

    def eventCheck(self, num) :
        self.Event = None
        if num in [3, 6, 13] :           # 돈 100원 추가
            self.Money += 100
            return " 100원 획득!"
            
        elif num in [7, 10, 12, 15, 20, 23, 28, 31, 34]:         # 지옥
            self.Dice = 0
            return " 지옥으로..."

        elif num == 18 :        # 돈 500원 추가
            self.Money += 500
            return " 500원 획득!"

        elif num in [21, 32] :  # 돈 300원 추가
            self.Money += 300
            return " 300원 획득!"

        elif num == 21 :        # 돈 100원 감소
            self.Money -= 100
            return " 100원 뺏김..."

        elif num == 21 :        # 돈 200원 감소
            self.Money -= 200
            return " 200원 뺏김..."

        elif num == 33 :        # 돈 500원 감소
            self.Money -= 500
            return " 500원 뺏김..."

        if (self.Money < 0) :
            self.Money = 0


# 0 이 입력되면 1을 1 이 입력되면 0을 반환하는 함수
def other(num) :
    if (num != 0) :
        return 0
    else :
        return 1
    
# 말 변환
def horse(num) :
    if num == None :
        return "  "
    elif num == 0 : 
        return "●"
    elif num == 1 :
        return "○"
    
# Main
Player = [None] * 2
order = 1
run = True

Player[0] = Game()
Player[1] = Game()

Player[0].iniData()
Player[1].iniData()

while run :
    if (order != 0) :
        order = 0
    else :
        order = 1

    print("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓\n")
        
    print(order +1, "번 플레이어 ", end="")
    
    # 주사위 굴리기
    Player[order].rollDice()

    print("주사위", Player[order].Dice, "나옴\n")

    # 주사위를 굴려 나온 수만큼 진행했을때 해당위치에 이밴트 발생요소가 있는지 확인
    Player[order].Event = Player[order].eventCheck(Player[order].Loc + Player[order].Dice)

    # 나온 주사위 눈금만큼 Location 추가
    Player[order].Loc += Player[order].Dice
    
    # 상대 말과 같은 위치며 서로 기본 위치가 아닐때 상대 말위치를 초기화
    if (Player[order].Loc == Player[other(order)].Loc) :
        if (Player[order].Loc != 0 and Player[other(order)].Loc != 0) :
            Player[other(order)].Loc = 0
            Player[order].Event = "가 상대 말을 잡음!"

    # 플레이어의 위치가 35 이상이라면 승리로 판단, 게임을 종료
    if (Player[order].Loc > 35) :
        run = False
        Player[order].Loc = 0
        Player[order].Event = "승리!"
    else :

        # 보드 배열에 플레이어의 위치 갱신
        Board = [None] * 36

        Board[Player[order].Loc] = order
        Board[Player[other(order)].Loc] = other(order)


        

    # 보드 생성
    print("┌──┬──┬──┬──┬──┬──┬──┬──┬──┬──┐")
    shell_1 = 27
    for i in range(0, 10) :
        print("│ %s "% horse(Board[shell_1]), end = "")
        shell_1 -= 1
    print("│")
    print("├──┼──┴──┴──┴──┴──┴──┴──┴──┼──┤")

    shell_1 = 28
    shell_2 = 17
    for i in range(0, 8) :
        print("│ %s │                                              │ %s │" %(horse(Board[shell_1]), horse(Board[shell_2]) ) )
        if i < 7 :
            print("├──┤                                              ├──┤")
        else :
            print("├──┼──┬──┬──┬──┬──┬──┬──┬──┼──┤")
        shell_1 += 1
        shell_2 -= 1

    shell_1 = 1
    print("│시작│", end="")
    for i in range(0, 9) :
        print(" %s "% horse(Board[shell_1]), end = "│")
        shell_1 += 1
    print("\n└──┴──┴──┴──┴──┴──┴──┴──┴──┴──┘")
    if (Player[order].Event != None) :
        print("")
        print(order +1, "번 플레이어%s" %Player[order].Event)
        print("")
    else :
        print("\n\n")
    print("1 번 플레이어 돈 :", Player[0].Money)
    print("2 번 플레이어 돈 :", Player[1].Money)
    
    input()
    
            

    


    
        
