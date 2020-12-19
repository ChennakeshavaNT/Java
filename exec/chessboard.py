#this code prints a chessboard using turtle graphics
#Input: No Input
#output: Chessboard representaion 
import turtle
ck = turtle.Turtle()
#Creation of a turtle named ck
ck.clear()
ck.pencolor("black")#Turtle Default color is "black", but you can change the color as per your needs in this statement
ck.forward(80)
ck.left(180)
ck.forward(80)
ck.right(180)
#iterative Approach is used
for a in range(4):
    ck.pendown()
    for i in range(5):
        ck.pendown()
        #prints (_ ) 4 times starting from towards the left
        for j in range(4):
            ck.forward(10)
            ck.penup()
            ck.forward(10)
            ck.pendown()
        #changes turtle direction 
        ck.left(90)
        ck.forward(1)
        ck.left(90)
        ck.penup()
        #prints (_ ) 4 times starting from towards the Right 
        for k in range(4):
            ck.forward(10)
            ck.pendown()
            ck.forward(10)
            ck.penup()
        ck.right(90)
        ck.forward(1)
        ck.right(90)
        ck.pendown()
        ck.penup()
    ck.pendown()
    for b in range(5):
        ##prints ( _) 4 times starting from towards the Right 
        for c in range(4):
            ck.forward(10)
            ck.pendown()
            ck.forward(10)
            ck.penup()
        ck.left(90)
        ck.forward(1)
        ck.left(90)
        ck.pendown()
        #prints ( _) 4 times starting from towards the left
        for k in range(4):
            ck.forward(10)
            ck.penup()
            ck.forward(10)
            ck.pendown()
        ck.right(90)
        ck.forward(1)
        ck.right(90)
        ck.penup()
    ck.pendown()
ck.forward(80)
ck.penup()
#moves the turtle away from the chessboard representation
ck.forward(30)
	    
            
    

