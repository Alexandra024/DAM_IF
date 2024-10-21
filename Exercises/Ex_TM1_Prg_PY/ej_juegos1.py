# importamos libreria random para hacer el numero random
import random

# generamos un numero aleatorio
num_random = random.randint(1,10)
print(num_random)

contador_intentos = 0

# numero de intentos 10
print("Adivina el numero: (tienes 10 intentos)") # --- pedir un numero hasta que se encuentre el indicado

while True :
    pedir_num = int(input())

    if pedir_num != num_random :  
        contador_intentos += 1 # --- aumentar el contador
    if contador_intentos == 10 : # --- finalizar a los 10 intentos
        break
    #decir si el numero es mayor o menor al introducido
    elif pedir_num > num_random :
        print("El numero buscado es menor")
    elif pedir_num < num_random :
        print("El numero buscado es mayor")
    elif pedir_num == num_random : # --- cuando el usuario acierta 
        print("Enhorabuena has ganado, eres muy listo." + "Tu numero de intentos hasta acertar ha sido: " + str(contador_intentos))
    elif pedir_num == 0:            # ------------------- exit the loop
        print("Fin de los intentos, tu numero de intentos" + str(contador_intentos) + "ha terminado")
        break


