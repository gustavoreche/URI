imposto = float(raw_input())

if imposto <= 2000.00:
    print "Isento"
else:
    imposto = imposto - 2000.00
    if imposto < 1000.00:
        taxa = (imposto * 8) / 100
        taxa = "%.2f" % taxa
        print "R$ %s" % taxa

    else:
        taxa1 = (1000 * 8) / 100
        imposto = imposto - 1000
        if imposto < 1500.00:
            taxa = (imposto * 18) / 100
            taxa = taxa + taxa1
            taxa = "%.2f" % taxa
            print "R$ %s" % taxa
            
        else:
            taxa2 = (1500 * 18) / 100
            imposto = imposto - 1500
            taxa = (imposto * 28) / 100
            taxa = taxa + taxa1 + taxa2
            taxa = "%.2f" % taxa
            print "R$ %s" % taxa
