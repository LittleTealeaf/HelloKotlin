fun main() {
    println("Please select a prompt:")
    println("1. Collatz Conjesture\n" +
            "2. Fibonacci Sequence\n")

    when(Integer.valueOf(readLine())) {
        1 -> collatzConjecture()
        2 -> fibonacciSequence()

        else -> println("Whoops, try again next time");
    }
}

fun collatzConjecture() {
    println("Give me a number");
    var i = Integer.valueOf(readLine());
    var count = 0;
    while(i > 1) {
       i = if(i%2==0) i / 2 else i * 3 + 1
        count++;
    }

    println("That took $count steps");
}

fun fibonacciSequence() {
    println("What number do you want in the fibonacci sequence?")
    var i = Integer.valueOf(readLine());

    var a = 0
    var b = 1
    for(i in 2..i) {
        b += a;
        a = b - a;
    }

    print("That is $b")

}