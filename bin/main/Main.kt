fun main() {
    println("Please select a prompt:")
    println("1. Collatz Conjesture\n" +
            "2. Fibonacci Sequence\n" +
            "3. Is Prime Number\n" +
            "4. Prime Factors")

    when(Integer.valueOf(readLine())) {
        1 -> collatzConjecture()
        2 -> fibonacciSequence()
        3 -> isPrimePrompt()
        4 -> primeFactors()

        else -> println("Whoops, try again next time");
    }
}

fun isPrimePrompt() {
    println("Give me a number");
    val n = Integer.valueOf(readLine())
    print(if(isPrime(n)) "$n is prime!" else "$n is not prime")
}

fun collatzConjecture() {
    println("Give me a number");
    var i = Integer.valueOf(readLine())
    var count = 0;
    while(i > 1) {
       i = if(i%2==0) i / 2 else i * 3 + 1
        count++;
    }

    println("That took $count steps");
}

fun fibonacciSequence() {
    println("What number do you want in the fibonacci sequence?")
    var i = Integer.valueOf(readLine())

    var a = 0
    var b = 1
    for(k in 2..i) {
        b += a
        a = b - a
    }

    print("That is $b")
}

fun primeFactors() {
    println("Give me a number!")
    var n = Integer.valueOf(readLine())

    println("Its prime factors are...")
    for(i in 2 until n) {
        if(n%i == 0 && isPrime(i)) {
            print("$i, ")
        }
    }

}


fun isPrime(n: Int): Boolean {
    for(i in 2 until n-1) {
        if(n % i == 0) {
            return false
        }
    }
    return true
}