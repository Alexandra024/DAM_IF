#  juego 2

print("El juego trata de ir hacia la izquierda o a la derecha, el jugador deberá decidir. HISTORIA: Estás en una bifurcación del camino en un bosque encantado y debes elegir ir a la izquierda o a la derecha. A la izquierda, hay una casa misteriosa. A la derecha, hay un río con un puente colgante. \n ") 

saludo_de_bienvenida= input('Hola, estás a punto de entrar en una de las mejores experiencias de tu vida, dime tu nombre para poderme referir a ti el resto del juego: ')
print('Hola',saludo_de_bienvenida ,'!')
eleccion1= input('Estás en una bifurcación del camino en un bosque encantado y debes elegir ir a la izquierda o a la derecha ').lower()

izq= 'Tu elección ha sido la izquierda, estas seguro de que quieres continuar por aquí?  '
dcha='Tu elección ha sido la derecha, estas seguro de que quieres continuar por aquí?  '

termina_juego= 'Tu elección no ha sido ni izquierda ni derecha , no puedes continuar :)'

pregunta_casa= '¿Qué quieres hacer ahora? (entrar/explorar)'
pregunta_puente= '¿Vas a cruzar el puente o quieres explorar? (cruzar/explorar) '


if eleccion1 == 'izquierda':
  respuesta= input(izq).lower()
  if respuesta == 'si' :
    print('Perfecto! Podemos continuar... ')
    print('Oh! Te has encontrado con una casa de estilo gótico del Siglo XIX')
    respuesta2= input(pregunta_casa).lower()
    if respuesta2 == 'entrar':
      print('Oh! Has encontrado un tesoro')
    elif respuesta2 == 'explorar':
      print('Te pierdes en el bosque, te encontras con unos lobos y te terminas muriendo por desangrado, has perdido')
    else:
      print(termina_juego)
elif eleccion1 == 'derecha':
  print('Has llegado a un puente.')
  print('Perfecto! Podemos continuar... ')
  respuesta2 = input(pregunta_puente).lower()
  if respuesta2 == 'cruzar' :
    print('Mientras estás mirando el paisaje una tabla del puente se rompe porque el puente estaba mal construido y te has caido al río donde te has golpeado la cabeza en una roca y mueres, ha terminado el juego')
  elif  respuesta2 =='explorar':
    print('Has encontrado un bote y navegas por el mar, encuentras tierras prosperas con indigenas amables que te hospedan y te alimentan por el resto de tu vida. Has ganado')
  else:
    print(termina_juego)

else:
  print(termina_juego)