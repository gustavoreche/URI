num = int(raw_input())

rep = 1
while num >= rep:
    par = rep % 2
    if par == 0:
        conta = rep * rep
        print "%s" % rep + "^2 = %s" % conta
    rep = rep + 1
