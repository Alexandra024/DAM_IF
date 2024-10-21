# area + perimetro de un circulo
#pi *r2

import math 

pi = math.pi
r= float(input("Give a radium for the circle (, as . for floats) = "))
print(r)
resultado_area= pi*(r*r)
resultado_perimetro= 2*pi*r

print(resultado_area)
print(resultado_perimetro)
