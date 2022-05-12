#0926-14.py
# 3명 3과목 점수 -> list(array) -> class(?)
# 함수 매개변수

def func_input() :
    
    #input
    for i in range(0,3) :
        kor.append(90)  # kor[0]=90,kor[1]=90,kor[2]=90
        eng.append(90)
        mat.append(90)

def func_tot() :
    
    #process and output
    for i in range(0,3) :

        #process
        tot.append(kor[i]+eng[i]+mat[i])
        ave.append(tot[i]/3)


        #output
        print("kor = %d" % kor[i])
        print("eng = %d" % eng[i])
        print("mat = %d" % mat[i])
        print("tot = %d" % tot[i])
        print("ave = %d" % ave[i])
        print("─────────")


#main
kor = []
eng = []
mat = []
tot = []
ave = []

func_input()
func_tot()


