num = int(raw_input())

rep = 1
while rep <= num:
    div = rep % 2
    if div == 0:
        div = 0
    else:
        print rep
    rep = rep + 1
