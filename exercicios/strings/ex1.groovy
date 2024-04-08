import java.util.Scanner


def countMatches(word) {
    def matchesList = []
    def pattern = /[aeiou]/

    (word =~ pattern).each {match -> 
        matchesList << match
    }

    return matchesList.size()
}


def getWord() {
    Scanner scan = new Scanner(System.in)

    println "Digite uma frase aleatória: "
    def word = scan.nextLine()

    return word
}


def main() {
    def word = getWord()
    println "Total vogais: ${countMatches(word)}"
}


main()