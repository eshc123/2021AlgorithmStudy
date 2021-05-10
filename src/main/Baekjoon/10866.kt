import java.util.*
import java.io.*
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st1 = StringTokenizer(br.readLine())
    val stringBuilder = StringBuilder()
    val n = st1.nextToken().toInt()
    val deq : Deque<String> = LinkedList<String>()
    for(i in 0 until n ){
        val st2 = StringTokenizer(br.readLine())
        when (st2.nextToken()) {
            "push_front" -> {
                val x = st2.nextToken()
                deq.addFirst(x)
            }
            "push_back" -> {
                val x = st2.nextToken()
                deq.addLast(x)
            }
            "pop_front" -> {
                if(!deq.isEmpty())
                    stringBuilder.append(deq.pollFirst()+"\n")
                else
                    stringBuilder.append("-1\n")
            }
            "pop_back" -> {
                if(!deq.isEmpty())
                    stringBuilder.append(deq.pollLast()+"\n")
                else
                    stringBuilder.append("-1\n")
            }
            "back" -> {
                if(!deq.isEmpty())
                    stringBuilder.append(deq.peekLast()+"\n")
                else
                    stringBuilder.append("-1\n")
            }
            "size" -> {
                stringBuilder.append(deq.size.toString()+"\n")
            }
            "empty" -> {
                if(deq.isEmpty())
                    stringBuilder.append("1\n")
                else
                    stringBuilder.append("0\n")
            }
            "front" -> {
                if(!deq.isEmpty())
                    stringBuilder.append(deq.peekFirst()+"\n")
                else
                    stringBuilder.append("-1\n")
            }

        }
    }

    bw.write(stringBuilder.toString())
    bw.flush()
    bw.close()
}