# two integer
import random

x = 20
y = 10
result = x+y

print(result)
print("%d + %d = %d" % (x,y,result))

if (x > y) :
    print("%d가 %d보다 크다" % (x,y))
elif(x==y) :
    print("%d가 %d와 같다" % (x,y))
else :
    print("%d가 %d와 같다" % (y,x))

    
# x = (int)(Math.random()*20);

x = random.randrange(0,20)
y = random.randrange(0,10)

result = x+y

print(result)
print("%d + %d = %d" % (x,y,result))

x = input("x : ")
x = int(x)  # int cast op. (int)
y = input("y : ")
y = int(y)

result = x+y

print(result)


