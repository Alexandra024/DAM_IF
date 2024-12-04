#caja registradora

total = float(input("Cuánto tienes que pagar?: ")) #la coma tiene que ponerse con un punto!!
pago = float(input("Cuánto pagaste?: "))

cambio = pago - total

caja = [500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01]
vueltas_camb = []

for i in caja:
    while cambio - i >= 0:
        cambio -= i
        vueltas_camb.append(i)

print(vueltas_camb)


