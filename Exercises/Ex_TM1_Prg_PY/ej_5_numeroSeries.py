# numeros del 0 al 100
a= 0

while a < 101:
    print(a)
    a += 1
else :
    print("Bucle terminado \n")


# muestra los numeros entre el 100 y el 200 los numeros pares
b= 99

while b < 201 :
    if b % 2 == 0:
        print(b)     
    b += 1
else:
    print("Bucle terminado\n")

# multiplos de 5
c= 0

while c <= 100:
    if c % 5 == 0 :
        print(c)
    c += 1    
else:
    print("no mas\n")

# factorial de un numero (8!)
n_factorial= int(input("escribe un numero para hacer su factorial: "))
var= 1

for i in range (1,n_factorial +1):
    var *= i

print(f'El factorial de {n_factorial} es {var}')