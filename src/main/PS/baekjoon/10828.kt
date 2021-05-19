package baekjoon

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = StringTokenizer(br.readLine()).nextToken().toInt()
    val stack = Stack<String>()
    for(i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        val cmd = st.nextToken()
        when (cmd) {
            "pop" -> {
                bw.write("${if(stack.empty()) -1 else stack.pop()}\n")
            }
            "push" -> {
                stack.push(st.nextToken())
            }
            "top" -> {
                bw.write("${if(stack.empty()) -1 else stack.peek()}\n")
            }
            "size" -> {
                bw.write("${stack.size}\n")
            }
            "empty" -> {
                bw.write("${if(stack.empty()) 1 else 0}\n")
            }
        }
    }
    bw.flush()
    bw.close()
}