#20190917
#당첨  10개
# ex)luck=[1,7,77,11,111,777]

import random


drawing = []               # 뽑는 번호 목록
run = True
count=0
luck=[]

print("┌─────────────┐")
print("│      당첨 번호 방식      │");
print("├─────────────┤")
print("│  1. 지정값", end=" ")
print("  2. 랜덤값   │")
print("└─────────────┘")
sel = int(input("<선택> "))

if(sel == 1) :
    luck=[1,3,7,33,77,137,177,0]

else :
    # 당첨 번호 (중복 제거)
    while len(luck) != 7:
        num = random.randrange(1, 500)
        if num not in luck :
            luck.append(num)
    luck = sorted(luck)     # 배열 오름차순 정렬
    
print("┌────────────────────────┐")
print("│                   당첨 번호                    │")
print("├────────────────────────┤")
print("│   ",end="")
for i in range(0,7) :
    print("[%03d]" % luck[i],end=" ")
print("   │")
print("└────────────────────────┘")



while(run) :

    count += 1
    
    num = random.randrange(1,500)

    if (len(luck) > 1) :           # 당첨 번호 목록 여부

        for i in range(0,len(luck)-1) :    
            if (luck[i] == num) :       # 당첨 번호와 대조

                print("┌─────────────┬──────────┐")
                print("│    %04d 번째 손님께서    │   당첨번호[%03d]    │" % (count,luck[i]))
                print("└─────────────┴──────────┘")
                luck.remove(luck[i])   # 리스트의 해당 원소를 찾아서 삭제
                #del luck[i]             # 리스트의 인덱스 주소에 원소 삭제
    else :
        print("        ┌──────────────┐")
        print("        │     모든 당첨 번호 소진    │")
        print("        └──────────────┘")
        run = False

        
print("")
sel = int(input("<확인용 입력> "))
print("─────────프로그램 종료───────────")    



