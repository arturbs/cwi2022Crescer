// INCORRETO
/* const heroi = {
    nome: 'capitao america',
    grupo: 'vingadores'
}
console.log(heroi)

//codigo
heroi.nome = 'pantera negra'
console.log(heroi) */

// CORRETO

const heroi = {
    nome: 'capitao america',
    grupo: 'vingadores',
    trabalhaPara: "SHIELD"
}

const outroHeroi = {
    ...heroi,
    nome: 'Pantera Negra'
}

console.log(heroi)
console.log(outroHeroi)