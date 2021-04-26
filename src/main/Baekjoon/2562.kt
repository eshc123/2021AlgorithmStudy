import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var index = 0
    var max = 0
    for(i in 0..8) {
        val a = StringTokenizer(br.readLine()).nextToken().toInt()
        if (a > max) {
            max = a
            index = i+1
        }
    }
    bw.write("$max\n$index")
    bw.flush()
    bw.close()
}