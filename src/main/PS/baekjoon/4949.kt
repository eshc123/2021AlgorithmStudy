package baekjoon

import java.io.*
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    var s: String
    while(true){
        s = br.readLine()
        val stack = Stack<Char>()
        if(s == ".")
            break
        for(c in s){
            when (c) {
                '(','[' -> {
                    stack.add(c)
                }
                ')' -> {
                    if(stack.isEmpty()){
                        sb.append("no\n")
                        break
                    }
                    else if(stack.pop()!='(') {
                        sb.append("no\n")
                        break
                    }
                }
                ']' -> {
                    if(stack.isEmpty()){
                        sb.append("no\n")
                        break
                    }
                    else if(stack.pop()!='[') {
                        sb.append("no\n")
                        break
                    }
                }
            }
            if(c=='.' && stack.isEmpty()){
                sb.append("yes\n")
            }
            else if (c=='.' && !stack.isEmpty()){
                sb.append("no\n")
            }
        }

    }
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}