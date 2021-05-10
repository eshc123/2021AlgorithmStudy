import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st1 = StringTokenizer(br.readLine())
    val st2 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
   // val m = st1.nextToken().toInt()
    val queue = ArrayDeque<Int>()
    val deq = ArrayDeque<Int>()
    var cnt = 0
    for(i in 1..n){
        deq.addLast(i)
    }
    while (st2.hasMoreTokens()){
       queue.add(st2.nextToken().toInt())
    }
    while(!queue.isEmpty()){
        val i = queue.first
        if(deq.first==i) {
            deq.pollFirst()
            queue.remove()
        }
        else if(deq.indexOf(i)<=(deq.size/2)){
            deq.add(deq.pollFirst())
            cnt += 1
        }
        else{
            deq.addFirst(deq.pollLast())
            cnt +=1
        }
    }
    println(cnt)
}