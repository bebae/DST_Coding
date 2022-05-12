# oval repeating

import turtle as t

n = 500 #count
t.bgcolor("black")
t.speed(0)

t.left(90)
for x in range(n) :
    if x % 6 == 0:
        t.color("red")
    if x % 6 == 1:
        t.color("yellow")
    if x % 6 == 2:
        t.color("blue")
    if x % 6 == 3:
        t.color("green")
    if x % 6 == 4:
        t.color("white")
    if x % 6 == 5:
        t.color("orange")
    t.left(60)
    t.forward(x*0.5)
    
        
