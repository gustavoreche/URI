ent1 = raw_input('')

e1 = []
e1 = ent1.split(" ")

x = e1[0]
x = float(x)
y = e1[1]
y = float(y)

if x > 0:
    if y > 0:
        print "Q1"
    elif y == 0:
        print "Eixo X"
    else:
        print "Q4"
elif x < 0:
    if y > 0:
        print "Q2"
    elif y == 0:
        print "Eixo X"
    else:
        print "Q3"
else:
    if y == 0:
        print "Origem"
    else:
        print "Eixo Y"
