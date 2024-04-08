import java.util.Random


def main() {
    def randomList = generateRandomList(100)
    showList(randomList)

    randomList = randomList.sort { 
        x, y -> x <=> y
    }
    showList(randomList)
}


def generateRandomList(limit){
    Random random = new Random()
    return (0..<10).collect { random.nextInt(limit) }
}


def showList(list) {
    println list
}


main()