rep = 1
contP = 0
while rep <= 5:
    Valor = int(raw_input())
    div = Valor % 2
    if div == 0:
        contP = contP + 1
    rep = rep + 1

print "%s valores pares" % contP
