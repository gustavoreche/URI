salario = float(raw_input())

if salario <= 400.00:
    reajuste = 15
    valorAcres = (salario * 15) / 100
    SalFinal = valorAcres + salario
    
elif salario >= 400.01 and salario <= 800.00:
    reajuste = 12
    valorAcres = (salario * 12) / 100
    SalFinal = valorAcres + salario
    
elif salario >= 800.01 and salario <= 1200.00:
    reajuste = 10
    valorAcres = (salario * 10) / 100
    SalFinal = valorAcres + salario
    
elif salario >= 1200.01 and salario <= 2000.00:
    reajuste = 7
    valorAcres = (salario * 7) / 100
    SalFinal = valorAcres + salario
    
else:
    reajuste = 4
    valorAcres = (salario * 4) / 100
    SalFinal = valorAcres + salario

SalFinal = "%.2f" % SalFinal
valorAcres = "%.2f" % valorAcres

print "Novo salario: %s" % SalFinal
print "Reajuste ganho: %s" % valorAcres 
print "Em percentual: %s " % reajuste + "%"
