num1 = int(raw_input())
num2 = int(raw_input())

lista = []

conta = num1 % 2
if conta == 0:
    div = 0
else:
    if num1 < 0:
        num1 = num1 + 1
    else:
        num1 = num1 - 1
conta1 = num2 % 2
if conta1 == 0:
    div = 0
else:
    if num2 < 0:
        num2 = num2 + 1
    else:
        num2 = num2 - 1

if num1 > num2:
    men = num2
    maior = num1
elif num1 == num2:
    men = num1
    maior = num2
else:
    men = num1
    maior = num2
    
while men <= maior:
    rep = men
    div = rep % 2
    if div == 0:
        div = 0
    else:
        lista.append(rep)
    men = men + 1

tamanho = len(lista)
rep = soma = 0
while rep < tamanho:
    soma = soma + lista[rep]
    rep = rep + 1

print soma
