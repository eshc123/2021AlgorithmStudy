package baekjoon

import java.io.*
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val s = br.readLine()
    val stack = Stack<Char>()
    var result = 0
    var cur = 0
    var b =' '
    for(c in s){
        when (c) {
            '(' -> {
                stack.add(c)
                cur+=1
            }
            ')' -> {
                val pop = stack.pop()
                cur -= 1
                if(b=='(') {
                    if (stack.isEmpty()) {
                        continue
                    } else {
                        result += cur
                    }
                }
                else {
                    result +=1
                }
            }
        }
        b = c
    }
    print(result)
    bw.flush()
    bw.close()
}