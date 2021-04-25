import java.util.*
import java.io.*

//기본 문제
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st1 = StringTokenizer(br.readLine())
    val st2 = StringTokenizer(br.readLine())

    val n = st1.nextToken().toInt()
    val x = st1.nextToken().toInt()
    for(i in 1 .. n){
        val a = st2.nextToken().toInt()
        if( x > a)
            bw.write("$a ")
    }
    bw.flush()
}