entrada = raw_input('')

x = []
x = entrada.split(" ")

A = x[0]
A = float(A)
B = x[1]
B = float(B)
C = x[2]
C = float(C)
pi = 3.14159

triangulo = (A * C) / 2
circulo = pi * (C * C)
trapezio = ((A + B) * C) / 2
quadrado = B * B
retangulo = A * B

print 'TRIANGULO: %.3F' % (triangulo)
print 'CIRCULO: %.3F' % (circulo)
print 'TRAPEZIO: %.3F' % (trapezio)
print 'QUADRADO: %.3F' % (quadrado)
print 'RETANGULO: %.3F' % (retangulo)
