// EM groovy podemos declarar uma string com aspas simples ou duplas, a diferença entre elas é que as aspas duplas permitem al-
// gumas operções, como interpolação, que as aspas simples não permitem.

String palavra1 = 'Testando o uso de strings com aspas simples...'
String palavra2 = "$palavra1"

println palavra1 == palavra2 // true


// -----------------------------------------------


// Métodos para lidar com strings: 
// -> https://www.tutorialspoint.com/groovy/groovy_strings.htm

println palavra1.toUpperCase()
println palavra1.toLowerCase()
println palavra1.replaceAll('simples', "complexa")
println palavra1.plus(' Caramelo')


// -----------------------------------------------


// Em groovy existem dois tipos de string:
// -> Strings: strings simples que são extendidas da classe String de java.
// -> GStrings: strings especias de groovy que facilitam a execução de operações envolvendo strings.


def palavra = 'Tartaruga'.toUpperCase() // Posso executar operações diretamente na string.
def nomeContinuacao = 'kahira'

println palavra 
println "Izaga${nomeContinuacao}"


// -----------------------------------------------


// Groovy também suporta o uso de strings especiais:

def texto = """
Tente 
Acordar
O Mais
Tarde
Possível
"""

println texto // O texto será mostrado da mesma forma em que foi escrito...


// -----------------------------------------------


/*

Exercícios:
    -> 1- Escreva um programa que receba uma string como entrada e conte o número de vogais (a, e, i, o, u) na string. Em seguida, exiba o resultado.
    -> 2- Escreva um programa que receba uma frase como entrada e inverta a ordem das palavras na frase. Por exemplo, se a entrada for "O rato roeu a roupa",
          a saída deve ser "roupa a roeu rato O".
    -> 3- Escreva um programa que receba uma frase como entrada e encontre e exiba a palavra mais longa na frase. Se houver várias palavras com o mesmo comprimento
          máximo, exiba apenas uma delas.
    -> 4- Escreva um programa que receba uma frase como entrada, uma palavra para encontrar e outra palavra para substituir. Substitua todas as ocorrências da palavra a ser         
          encontrada pela palavra de substituição e exiba a frase resultante.
    -> 5- Escreva um programa que receba uma palavra como entrada e determine se é um palíndromo (ou seja, se ela é lida da mesma forma de trás para frente). Exiba "Sim" se for um    
          palíndromo e "Não" caso contrário.
*/

