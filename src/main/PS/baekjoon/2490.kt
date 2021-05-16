import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<List<Int>>()
    for(i in 0..2){
        list.add(StringTokenizer(br.readLine()).toList().map{ it.toString().toInt()})
        when (list[i].sum()) {
            0 -> bw.write("D\n")
            1 -> bw.write("C\n")
            2 -> bw.write("B\n")
            3 -> bw.write("A\n")
            4 -> bw.write("E\n")
        }
    }
    bw.flush()
}