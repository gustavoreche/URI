ent1 = raw_input('')
ent2 = raw_input('')

e1 = e2 = []

e1 = ent1.split(" ")
e2 = ent2.split(" ")

x1 = e1[0]
x1 = float(x1)
y1 = e1[1]
y1 = float(y1)

x2 = e2[0]
x2 = float(x2)
y2 = e2[1]
y2 = float(y2)

distancia = ((x2 - x1)*(x2 - x1))+((y2 - y1)*(y2 - y1))
from math import sqrt
total = sqrt(distancia)

print "%.4F" % (total)
