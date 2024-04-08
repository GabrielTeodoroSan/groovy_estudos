import java.util.Scanner


def clearWord(word) {
    def newWord = word.replaceAll(/[,.!?]/, '')
    return newWord
}


def reverseString(word) {
    return word.split(' ').reverse().join(' ')
}


def getWord() {
    Scanner scan = new Scanner(System.in)

    println "Frase :: "
    def word = scan.nextLine()
    
    return word
}


def main() {
    def word = getWord()
    println reverseString(clearWord(word))
}


main()