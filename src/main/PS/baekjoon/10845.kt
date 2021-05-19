package baekjoon

import java.util.*
import java.io.*
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st1 = StringTokenizer(br.readLine())
    val stringBuilder = StringBuilder()
    val n = st1.nextToken().toInt()
    val queue : Queue<String> = LinkedList<String>()
    for(i in 0 until n ){
        val st2 = StringTokenizer(br.readLine())
        when (st2.nextToken()) {
            "push" -> {
                val x = st2.nextToken()
                queue.add(x)
            }
            "front" -> {
                if(queue.isNotEmpty())
                    stringBuilder.append(queue.element()+"\n")
                else
                    stringBuilder.append("-1\n")
            }
            "back" -> {
                if(queue.isNotEmpty())
                    stringBuilder.append(queue.last()+"\n")
                else
                    stringBuilder.append("-1\n")
            }
            "size" -> {
                stringBuilder.append(queue.size.toString()+"\n")
            }
            "empty" -> {
                if(queue.isEmpty())
                    stringBuilder.append("1\n")
                else
                    stringBuilder.append("0\n")
            }
            "pop" -> {
                if(queue.isNotEmpty())
                    stringBuilder.append(queue.poll()+"\n")
                else
                    stringBuilder.append("-1\n")
            }

        }
    }

    bw.write(stringBuilder.toString())
    bw.flush()
    bw.close()
}