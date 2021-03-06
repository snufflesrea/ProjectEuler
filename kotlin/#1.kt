import java.io.*
import java.util.*
import java.math.BigInteger

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val scan = Scanner(System.`in`)
    val t = scan.nextInt()

    for (i in 0 until t){
        val n = scan.nextInt()

        var sum : BigInteger
        val nr : BigInteger  = (n-1).toBigInteger()
        val x3 = nr/(3.toBigInteger())
        val x5 = nr/(5.toBigInteger())
        val x15 = nr/(15.toBigInteger())

        var sum1 : BigInteger = x3+(1.toBigInteger())
        sum1 = sum1*(3.toBigInteger())*x3
        var sum2 : BigInteger = x5+(1.toBigInteger())
        sum2 = sum2*(5.toBigInteger())*x5
        var sum3 : BigInteger = x15+(1.toBigInteger())
        sum3 = sum3*(15.toBigInteger())*x15

        sum = (sum1 + sum2 - sum3)/(2.toBigInteger())
        println(sum)
    }
}
