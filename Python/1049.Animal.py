dica1 = raw_input()
dica2= raw_input()
dica3 = raw_input()

if dica1 == "vertebrado":
    if dica2 == "ave":
        if dica3 == "carnivoro":
            print "aguia"
        else:
            print "pomba"
    else:
        if dica3 == "onivoro":
            print "homem"
        else:
            print "vaca"
else:
    if dica2 == "inseto":
        if dica3 == "hematofago":
            print "pulga"
        else:
            print "lagarta"
    else:
        if dica3 == "hematofago":
            print "sanguessuga"
        else:
            print "minhoca"
