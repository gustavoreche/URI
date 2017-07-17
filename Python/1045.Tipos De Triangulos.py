ent = raw_input().split()
entrada = [float(elem) for elem in ent]

entrada.sort()
entrada.sort(reverse=True)

A = float(entrada[0])
B = float(entrada[1])
C = float(entrada[2])

C1 = B + C
A2 = A * A
C2 = (B * B) + (C * C)

if A >= C1:
    print 'NAO FORMA TRIANGULO'
else:
    if A2 == C2:
        print 'TRIANGULO RETANGULO'
    if A2 > C2:
        print 'TRIANGULO OBTUSANGULO'
    if A2 < C2:
        print 'TRIANGULO ACUTANGULO'
    if A == B and B == C:
        print 'TRIANGULO EQUILATERO'
    else:
        if A == B or B == C or A == C:
            print 'TRIANGULO ISOSCELES'
