ent = raw_input().split()
entrada = [int(elem) for elem in ent]

ini = entrada[0]
ini_min = entrada[1]
fim = entrada[2]
fim_min = entrada[3]

minuto = 0
hora = fim - ini
if hora <= 0:
    if ini == fim:
            hora = 24
    else:
        hora = 24 + hora
        if ini_min > fim_min:
            minuto = (60 - ini_min) + fim_min

minuto = fim_min - ini_min
if minuto < 0:
    minuto = 60 + minuto
    hora = hora - 1

print "O JOGO DUROU %s HORA(S) E %s MINUTO(S)" % (hora,minuto)
