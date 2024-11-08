# #caja registradora

# #total_compra = float(input('Cuánto tienes que pagar?: ')) # ej. 6,46
# #pago_compra = float(input('Cuánto pagaste?: ')) #ej. 10

total = 5.46 
pago = 10

cambio = pago - total

caja = [500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01]
vueltas_camb = []

for i in caja:
    while cambio - i >= 0:
        cambio -= i
        vueltas_camb.append(i)

print(vueltas_camb)


# for i in vueltas_camb:
#     vueltas_camb.count(i)