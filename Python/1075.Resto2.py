num = int(raw_input())

rep = 1
while rep <= 10000:
    resto = rep % num
    if resto == 2:
        print rep
    rep = rep + 1
