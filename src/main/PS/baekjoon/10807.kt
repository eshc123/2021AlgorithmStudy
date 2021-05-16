import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = StringTokenizer(br.readLine()).nextToken().toInt()
    val arr = Array(201) { 0 }

    val st = StringTokenizer(br.readLine()).toList().map{ it -> it.toString().toInt() }
    val k = StringTokenizer(br.readLine()).nextToken().toInt()
    for(i in 0 until n){
        arr[st[i]+100] += 1
    }
    bw.write((arr[k+100]).toString())
    bw.flush()
    bw.close()
}