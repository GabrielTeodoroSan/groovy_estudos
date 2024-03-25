import java.util.Scanner


def sumNumbers(val1, val2) {
    return val1 + val2
}

def getValue() {
    Scanner scanner = new Scanner(System.in)
    println "Number ::"
    return scanner.nextDouble()
}

println sumNumbers(
    getValue(), getValue()
)