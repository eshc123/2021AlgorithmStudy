import java.util.*
import java.io.*

//배열 문제
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st1 = StringTokenizer(br.readLine())

    val array = Array(3){ st1.nextToken().toInt()}
    array.sort()
    array.forEach {
        bw.write("$it ")
    }
    bw.flush()
}