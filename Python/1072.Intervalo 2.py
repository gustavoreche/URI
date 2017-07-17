quant = int(raw_input())

dentro = fora = rep = 0
while quant > rep:
    num = int(raw_input())
    if num >= 10 and num <= 20:
        dentro = dentro + 1
    else:
        fora = fora + 1
    rep = rep + 1

print "%s in" % dentro
print "%s out" % fora
