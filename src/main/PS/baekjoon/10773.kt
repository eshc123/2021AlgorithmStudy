import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val stack = Stack<Int>()
    for(i in 0 until n) {
        val cmd = br.readLine().toInt()
        if(cmd==0) stack.pop()
        else stack.push(cmd)
    }
    var sum = 0
    while(!stack.empty())
        sum += stack.pop()
    bw.write("$sum")
    bw.flush()
    bw.close()
}