# etrellitas en forma de triangulo
vueltas = int(input("ingrese el numero de lineas del triangulo: "))

for n in range (vueltas+1):
    print("* " * n)

# etrellitas en forma de triangulo al revés EXTRA
vueltas_reversa = int(input("ingrese el numero de lineas del triangulo al revés: "))

for n in range (vueltas_reversa,0,-1): # --- range(inicio,fin,paso*(cuanto incrementa o decrementa))
    print("* " * n)

# etrellitas en forma de cuadrado
lineas = int(input("ingrese el numero de lineas del cuadrado: "))

for n in range (lineas): 
    print("* " * lineas)


