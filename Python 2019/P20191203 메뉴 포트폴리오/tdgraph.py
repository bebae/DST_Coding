import turtle as t

def tdgraph():

    line_color=["green","red","blue"]
    # 그래프를 그릴 x좌표 범위
    x_min = -5
    x_max = +5

    # 그래프를 그릴 y좌표 범위
    y_min = -5
    y_max = +5

    # 그래프를 그릴 간격
    space = 0.01

    # 그릴 함수의 리스트
    func_list = ["3*x*x + 6*x + 9"]

    # 좌표 설정, 거북이 속도, 선 굵기
    t.setworldcoordinates(x_min, y_min, x_max, y_max)
    t.speed(0)
    t.pensize(2)

    # x축 그리기
    t.up()
    t.goto(x_min, 0)
    t.down()
    t.goto(x_max, 0)

    # y축 그리기
    t.up()
    t.goto(0, y_min)
    t.down()
    t.goto(0, y_max)

    # 그래프 그리기
    line=0
    # t.color("green")
    for func in func_list:
        t.color(line_color[line])
        line += 1
        x = x_min                
        y = eval(func)
        #t.up()
        #t.goto(x,y)
        #t.down()
        #while x <= x_max:
        #  x= x+space
        #  eval(func)
        #  t.goto(x,y)
