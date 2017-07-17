rep = 1
contP = 0
while rep <= 6:
    Valor = float(raw_input())
    if Valor > 0:
        contP = contP + 1
    rep = rep + 1

print "%s valores positivos" % contP
