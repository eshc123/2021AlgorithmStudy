package baekjoon

import java.util.*

private var n = 0
private lateinit var arr : LongArray
private lateinit var stack: Stack<Long>

fun main() {
    val br = System.`in`.bufferedReader()
    n = br.readLine().toInt()
    arr = LongArray(n){0}
    stack = Stack()
    stack.push(Long.MAX_VALUE)
    var cnt :Long = 0
    repeat(n){
        val cur = br.readLine().toLong()
        while(stack.peek() <= cur)
            stack.pop()
        cnt += (stack.size -1)
        stack.push(cur)
    }
    println(cnt)
}