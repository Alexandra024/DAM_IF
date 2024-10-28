# tabla multiplicar
num_multiplicar= 2
var= 0

while var <= 10:
  print(f'{num_multiplicar} x {var} = {num_multiplicar * var}')
  var += 1

#diez tablas de multiplicar 
for num in range(0,11):
    print(f'Tabla del numero {num} :')
    print('____________________')
    for n in range(0,11):
        print(f'{num} x {n} = {num * n}')
    print('---------------------')
