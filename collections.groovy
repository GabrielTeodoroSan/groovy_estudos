// Coleções em groovy são estruturas de dados que servem para armazenar e manipular grupos de dados. Veja os exemplos de 
// estruturas existentes em groovy:


//-----------------------------------------------------------------------------------------
// LISTAS: 

def lista = [1, 2, 3, 4, 5]
println lista 


/*
    1- Listas são estruturas simples que armazenam dados de todos os tipos.
    2- Com as listas é possível acessar os valores pelo índice, ou seja, pela posição do item na lista.
*/

def somar(x, y) {
    return x + y
}

println somar(lista[0], lista[-1]) // (-1) sempre será o último elemento da lista.


def dados_usuario = ['Usuario_xpto', 'coxinha123', 10] // Guardando dados de diferentes tipos na lista.

//-----------------------------------------------------------------------------------------
// MAPAS: 

def mapa = ['pedido': 'Pudim', 'cliente': 'Usuario_xpto']
println mapa['pedido']


/*
    1- Mapas são estruturas onde os dados são criados de forma que eles fiquem ligados a uma chave.
    2- Não há índices nesta estrutura, os dados só podem ser acessados através das chaves.
    3- As chaves são únicas, porém seus valores não são.
*/

//-----------------------------------------------------------------------------------------
// CONJUNTOS: 

def conjunto = ['abacate', 'manga', 'maça', 'banana'].toSet()
println conjunto


/*
    1- Conjuntos são estruturas que não permitem duplicatas.
    2- São comumente utilizados para remover duplicações em outras estruturas.
    3- Para criar um set basta adicionar 'toSet()' ao final da lista.
*/

def lista_duplicada = ['banana', 'banana', 'pera'] as Set
println lista_duplicada


//-----------------------------------------------------------------------------------------
// MATRIZES:

def matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
println matriz


/*
    1- Matrizes são estruturas multidimencionais de dados.
    2- Para acessar um dado de uma matriz usa-se [][].
*/

println somar(matriz[0][0], matriz[1][1])

//-----------------------------------------------------------------------------------------
//Exercícios:

/*
    1- Ordene uma lista de números inteiros aleatória.
    2- Aplique o algoritmo de busca binária.
    3- Crie um sistema de cadastro de produtos usando mapas.
    4- Crie uma aplicação para mostrar a varição de preços dos produtos de uma loja.
*/