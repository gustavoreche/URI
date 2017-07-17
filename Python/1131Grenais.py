total = Vint = Vgre = emp = 0
rep = 1
while rep == 1:
    gol = raw_input().split()
    total = total + 1
    if gol[0] > gol[1]:
        Vint = Vint + 1
    elif gol[1] > gol[0]:
        Vgre = Vgre + 1
    else:
        emp = emp + 1
    print "Novo grenal (1-sim 2-nao)"
    rep = int(raw_input())

print "%s grenais" % total
print "Inter:" + "%s" % Vint
print "Gremio:" + "%s" % Vgre
print "Empates:" + "%s" % emp

if Vint > Vgre:
    print "Inter venceu mais"
elif Vgre > Vint:
    print "Gremio venceu mais"
else:
    print "Nao hoube vencedor"
