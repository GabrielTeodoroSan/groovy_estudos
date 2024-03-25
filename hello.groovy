import java.util.Scanner


def saudacoes(nome) {
    println "Hello, $nome !!!"
}


def coletarNome() {
    Scanner scanner = new Scanner(System.in)
    println "Name ::"
    return scanner.nextLine()
}


saudacoes({ ->
    Scanner scanner = new Scanner(System.in)
    println "Name ::"
    return scanner.nextLine()
}())