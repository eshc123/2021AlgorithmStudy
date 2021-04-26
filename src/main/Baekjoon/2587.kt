import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Int>()
    for(i in 0..4) {
        val a = StringTokenizer(br.readLine()).nextToken().toInt()
        list.add(a)
    }
    list.sort()
    bw.write((list.sum()/5).toString()+"\n"+list[2])
    bw.flush()
    bw.close()
}