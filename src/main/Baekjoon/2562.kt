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

//import java.util.*
//import java.io.*
//
//fun main() {
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//    val array = Array(100) { 0 }
//    var max = 0
//    for(i in 0..8) {
//        val a = StringTokenizer(br.readLine()).nextToken().toInt()
//        array[a] = i + 1
//        if (a > max) max = a
//    }
//    bw.write(max.toString()+"\n" + array[max].toString())
//    bw.flush()
//}
