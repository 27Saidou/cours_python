import turtle
t=turtle.Turtle()
style=("Times",20,"bold")

style=input("combien de champs voulez-vous")
t.write("waiting for input from console",font=style,align="center")
t.right(-90)

num=int(input("enter your num"))
t.clear()
t.width(5)

for i in range(num):
    t.forward(100)
    t.left(45)
    t.backward(20)
    t.forward(20)
    t.right(90)
    t.backward(20)
    t.forward(20)