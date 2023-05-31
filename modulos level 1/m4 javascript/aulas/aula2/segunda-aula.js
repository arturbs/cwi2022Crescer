//introdução a modulos em JS!

/* import { will, gus } from "./alunos.js"

console.log("Aula 2 de JS!")

console.log(will)
console.log(gus) */


/* import alunopadrao from "./alunos.js"

console.log(alunopadrao) */

/* import { willian as w } from "./alunos.js"

console.log(w) */


// callback

/* function imprimir() {
    console.log("estou repetindo")
}

function repetir(vezes) {
    for (let i=0; i<vezes; i++) {
        imprimir()
    }
}

repetir(5) */

const instrutores = ["artur", "brito", "souza"]

function escreverinstrutor(indice) {
    console.log(instrutores[indice])

}

function imprimir() {
    console.log("estou repetindo")
}

function dizeroi() {
    console.log("oi")
}

function escreverInteracao(iteracao) {
    console.log(iteracao)
}

function repetir(vezes, callback) {
    for (let i=0; i<vezes; i++) {
        callback(i)
    }
}

repetir(5, imprimir)
repetir(3, dizeroi)
repetir(4, escreverInteracao)
repetir(instrutores.length, escreverinstrutor)