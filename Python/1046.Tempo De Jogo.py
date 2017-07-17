ent = raw_input().split()
entrada = [int(elem) for elem in ent]

ini = entrada[0]
fim = entrada[1]

if ini >= fim:
    tempo = (24 - ini) + fim
else:
    tempo = ((24 - ini) + fim) - 24

print "O JOGO DUROU %s HORA(S)" % tempo
