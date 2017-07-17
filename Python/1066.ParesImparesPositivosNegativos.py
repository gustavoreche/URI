rep = 1
contPar = contI = contPos = contN = 0
while rep <= 5:
    Valor = int(raw_input())
    if Valor >= 0:
        if Valor == 0:
            contPar = contPar + 1
        else:
            contPos = contPos + 1
            div = Valor % 2
            if div == 0:
                contPar = contPar + 1
            else:
                contI = contI + 1
    else:
        contN = contN + 1
        div = Valor % 2
        if div == 0:
            contPar = contPar + 1
        else:
            contI = contI + 1
    rep = rep + 1

print "%s valor(es) par(es)" % contPar
print "%s valor(es) impar(es)" % contI
print "%s valor(es) positivo(s)" % contPos
print "%s valor(es) negativo(s)" % contN
