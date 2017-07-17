rep = 1
lista = []
contP = 0
while rep <= 6:
    Valor = float(raw_input())
    if Valor > 0:
        lista.append(Valor)
        contP = contP + 1
    rep = rep + 1

tamanho = len(lista)
rep1 = 1
x = soma = 0
while rep1 <= tamanho:
    soma = soma + lista[x]
    x = x + 1
    rep1 = rep1 + 1

soma = soma / tamanho
soma = "%.1f" % soma
    
print "%s valores positivos" % contP
print soma

