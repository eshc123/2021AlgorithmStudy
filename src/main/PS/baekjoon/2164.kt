package baekjoon

import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val queue : Queue<Int> = LinkedList()
    for(i in 1..n ){
        queue.offer(i)
    }
    while(queue.size > 1 ){
        queue.poll()
        queue.offer(queue.poll())
    }
    println(queue.poll())
}