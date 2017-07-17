ent = raw_input().split()
entrada = [float(elem) for elem in ent]

A = entrada[0]
B = entrada[1]
C = entrada[2]

AB = A + B
BC = B + C
AC = A + C

if AB > C and BC > A and AC > B:
    AP = A + B + C
    print "Perimetro = %s" % AP
else:
    AT = ((A + B) * C) / 2
    print "Area = %s" % AT
