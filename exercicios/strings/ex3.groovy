import java.util.Scanner


def clearWord(word) {
    return word.replaceAll(/[.,!?]/, '')
}


def countWordsSize(word) {
    def wordsSize = []
    def words = word.split(' ')

    word = words.max {a, b ->
        a.length() <=> b.length()
    }

    return word
}


def getWord(){
    Scanner scan = new Scanner(System.in)

    println "Palavra :: "
    def word = scan.nextLine()

    return word
}


def main() {
    def word = clearWord(getWord())
    println ":: ${countWordsSize(word)}"
}


main()