#if

x = input("a : ")
a = int(x)

y = input("b : ")
b = int(y)

z = input("c : ")
c = int(z)


# if ((a==b)&&(b==c))

if a == b == c :
    printf("a=b=c")
elif a == b :
    if a > c :
        print("a = b > c")
    else :
        print("a = b < c")
elif a == c :
    if a > b :
        print("a = c > b")
    else :
        print("a = c < b")
elif b == c :
    if a > b :
        print("b = a > c")
    else :
        print("b = c < a")
elif a < b :
    if b < c :
        print("a < b < c")
    else :
        print("a < c < b")
elif a < c :
    if a < b :
        print("a < b < c")
    else :
        print("b < a < c")
elif c < b :
    if a > b :
        print("c < b < a")
    else :
        print("c < a < b")
else :
    print("오류")

print("a = ",a)
print("b = ",b)
print("c = ",c)
        
    
