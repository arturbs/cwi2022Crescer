// INCORRETO
// const itens = []

// function adcionarAoCarrinho (item) {
//   itens.push(item)
// }

// adicionarAoCarrinho("feijão")
// console.log(itens)

// adicionarAoCarrinho("feijão")
// console.log(itens)


//CORRETO

const carrinhoInicial = []

function adicionarAoCarrinho(carrinho, item) {
    const novoCarrinho = [...carrinho, item]
    return novoCarrinho
}

let carrinhoAtualizado = adicionarAoCarrinho(carrinhoInicial, "Feijão")
carrinhoAtualizado = adicionarAoCarrinho(carrinhoInicial, "Feijão")
carrinhoAtualizado = adicionarAoCarrinho(carrinhoInicial, "Feijão")
carrinhoAtualizado = adicionarAoCarrinho(carrinhoInicial, "Feijão")
carrinhoAtualizado = adicionarAoCarrinho(carrinhoInicial, "Feijão")

console.log(carrinhoInicial)
console.log(carrinhoAtualizado)

let carrinhoAtualizado2 = adicionarAoCarrinho(carrinhoInicial, "Feijão")
carrinhoAtualizado2 = adicionarAoCarrinho(carrinhoAtualizado2, "Feijão")
carrinhoAtualizado2 = adicionarAoCarrinho(carrinhoAtualizado2, "Feijão")
carrinhoAtualizado2 = adicionarAoCarrinho(carrinhoAtualizado2, "Feijão")
carrinhoAtualizado2 = adicionarAoCarrinho(carrinhoAtualizado2, "Feijão")

console.log(carrinhoInicial)
console.log(carrinhoAtualizado2)
