#factorial

n_factorial= int(input("escribe un numero para hacer su factorial: "))
var= 1

for i in range (1,n_factorial +1):
                # --- pasa por los numeros al de mayor a menor incluyendo el propio num ecrito
    var *= i

print(f'El factorial de {n_factorial} es {var} ')
