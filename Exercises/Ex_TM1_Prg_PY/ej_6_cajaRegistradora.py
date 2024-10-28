# #caja registradora

# #total_compra = float(input('Cuánto tienes que pagar?: ')) # ej. 6,46
# #pago_compra = float(input('Cuánto pagaste?: ')) #ej. 10


# devol= pago - compra #4.54

total = 5.46 
pago = 10

change = pago - total

caja = [500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01]
giveBack = []

for i in caja:
    while change - i >= 0:
        change -= i
        giveBack.append(i)

print(giveBack)


# for i in giveBack:
#     giveBack.count(i)