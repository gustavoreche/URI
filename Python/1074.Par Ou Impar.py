quant = int(raw_input())

rep = 0
while quant > rep:
    num = int(raw_input())
    conta = num % 2
    if num == 0:
        print "NULL"
    elif num < 0:
        if conta == 0:
            print "EVEN NEGATIVE"
        else:
            print "ODD NEGATIVE"
    else:
        if conta == 0:
            print "EVEN POSITIVE"
        else:
            print "ODD POSITIVE"
    rep = rep + 1
