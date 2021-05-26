package baekjoon

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = StringTokenizer(br.readLine())
    val a = str.nextToken().toLong()
    val b = str.nextToken().toLong()
    val c= str.nextToken().toLong()

    print(j(a,b,c))
}

fun j(a : Long, b: Long, c: Long) : Long{
    if(b<=1)
        return a%c
    var temp = j(a,b/2,c)
    temp = temp * temp % c
    return if(b%2>0) temp*a % c else temp
}