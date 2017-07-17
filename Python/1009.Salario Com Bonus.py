nome = raw_input('')
salario = float(raw_input(''))
vendas = float(raw_input(''))

comissao = (15 * vendas) / 100
Salariofinal = comissao + salario
Sfinal = "%.2f" % Salariofinal
Sfinal = float(Sfinal)

print 'TOTAL = R$ %.2F' % (Sfinal)
