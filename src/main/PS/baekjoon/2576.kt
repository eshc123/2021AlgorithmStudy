package baekjoon

import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var min = 99
    var sum = 0
    for(i in 0..6) {
        val a = StringTokenizer(br.readLine()).nextToken().toInt()
        if (a % 2 == 1 ) {
            sum += a
            if (min > a ) {
                min = a
            }
        }
    }
    if ( sum == 0 ) bw.write("-1")
    else bw.write("$sum\n$min")
    bw.flush()
    bw.close()
}