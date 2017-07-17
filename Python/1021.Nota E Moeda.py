N = float(raw_input(''))

N100 = N50 = N20 = N10 = N5 = N2 = M1 = M050 = M025 = M010 = M005 = M001 = 0

rep = 1;
while(rep == 1):
    if N >= 100.00:
        N100 = N100 + 1
        N = N - 100;
    elif N >= 50:
        N50 = N50 + 1
        N = N - 50
    elif N >= 20:
        N20 = N20 + 1
        N = N - 20
    elif N >= 10:
        N10 = N10 + 1
        N = N - 10
    elif N >= 5:
        N5 = N5 + 1
        N = N - 5;
    elif N >= 2:
        N2 = N2 + 1
        N = N - 2
    elif N >= 1:
        M1 = M1 + 1
        N = N - 1
    elif N >= 0.50:
        M050 = M050 + 1
        N = N - 0.50
    elif N >= 0.25:
        M025 = M025 + 1
        N = N - 0.25
    elif N >= 0.10:
        M010 = M010 + 1
        N = N - 0.10
        N = "%.2f" % N
        N = float(N)
    elif N >= 0.05:
        M005 = M005 + 1
        N = N - 0.05
        N = "%.2f" % N
        N = float(N)
    elif N >= 0.01:
        M001 = M001 + 1
        N = N - 0.01
        N = "%.2f" % N
        N = float(N)
    elif N == 0.00:
        rep = 2;
        
print "NOTAS:"
print "%s nota(s) de R$ 100.00" % (N100)
print "%s nota(s) de R$ 50.00" % (N50)
print "%s nota(s) de R$ 20.00" % (N20)
print "%s nota(s) de R$ 10.00" % (N10)
print "%s nota(s) de R$ 5.00" % (N5)
print "%s nota(s) de R$ 2.00" % (N2)
print "MOEDAS:"
print "%s moeda(s) de R$ 1.00" % (M1)
print "%s moeda(s) de R$ 0.50" % (M050)
print "%s moeda(s) de R$ 0.25" % (M025)
print "%s moeda(s) de R$ 0.10" % (M010)
print "%s moeda(s) de R$ 0.05" % (M005)
print "%s moeda(s) de R$ 0.01" % (M001)
