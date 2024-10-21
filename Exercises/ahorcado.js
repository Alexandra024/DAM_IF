/*
Tema:paises

1- coleccion/diccionario paises
2-

*/

// hacemos un array de caracteres (con let)
let paises = ["España", "Argentina", "Rumanía"]

// elegimos un pais random

let nRandom = Math.floor(Math.random()* 3)
let pais = paises[nRandom] // eleccion del pais para el juego

console.log(pais)


console.log("Adivina que país es:")

let lengthPais = pais.length
console.log(lengthPais)

let lineas = ''

for (let i = 1; i <= lengthPais ; i++){
    lineas += '_ '
}

console.log(lineas)
    

console.log("cual es la longitud de la linea?:" );

// linea de asteriscos
let asteriscos = " " 

 for (let i = 0; i <= 6 ; i++){
    asteriscos += "* "
 }
    console.log(asteriscos)

// t1 de asteriscos__----------------------------------------------------
let t = "+" 

 for (let i = 0; i <= 6 ; i++){
    t = " "
 }
    console.log(t)

// cuadrado de asteriscos
let a = " " 

 for (let i = 0; i <= 6 ; i++){
    a += "* "
        for (let j = 0; i < 6; i++ ){
            a += "* "
        }
 }
    console.log(a)

