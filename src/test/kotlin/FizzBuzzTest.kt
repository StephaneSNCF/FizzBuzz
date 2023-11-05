import fizzBuzz.FizzBuzz
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class FizzBuzzTest {

    @Test
    fun given_100_numbers_then_it_returns_all_the_numbers (){
        val fizzBuzz = FizzBuzz()
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        fizzBuzz.printNumber()

        val expectedOutput = buildString {
            for(i in 1..100){
                when {
                    i % 3 == 0 && i % 5 == 0 -> appendLine("FizzBuzz")
                    i % 3 == 0 -> appendLine("Fizz")
                    i % 5 == 0 -> appendLine("Buzz")
                    else -> appendLine(i)
                }
            }
        }

        assertEquals(expectedOutput, outputStream.toString())
    }
}