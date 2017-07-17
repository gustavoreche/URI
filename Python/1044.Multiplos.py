ent = raw_input().split()
entrada = [int(elem) for elem in ent]

entrada.sort()

A = entrada[0]
B = entrada[1]

conta = B % A

if conta == 0:
    print "Sao Multiplos"
else:
    print "Nao sao Multiplos"
