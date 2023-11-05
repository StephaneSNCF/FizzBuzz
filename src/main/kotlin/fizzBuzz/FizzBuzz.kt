package fizzBuzz

class FizzBuzz {

    fun printNumber() {
        for (i in 1..100){
            when {
                i % 3 == 0 -> println("Fizz")
                else -> println(i)
            }
        }
    }
}