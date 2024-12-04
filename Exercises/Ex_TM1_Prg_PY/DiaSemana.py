# dias de la semana 

# Lista de días de la semana en inglés
dias_sem = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]

innput = int(input("Tell me a number and i will tell you a day of the week: "))

if 1 <= innput <= 7: # --- ajuste del rango de 1 a 7
    print("The day of the week is: " + dias_sem[innput -1])
else:
    print("Por favor, ingresa un número válido entre 1 y 7.")

