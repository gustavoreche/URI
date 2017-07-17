num = int(raw_input())

rep = 1
while rep <= 6:
    div = num % 2
    if div == 0:
        div = 0
    else:
        print num
        rep = rep + 1
    num = num + 1
