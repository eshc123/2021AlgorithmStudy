package baekjoon

import java.util.*
import java.io.*

//조건문 기본 문제
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st1 = StringTokenizer(br.readLine())
    var st2 = StringTokenizer(br.readLine())
    val a = Integer.parseInt(st1.nextToken())
    val b = Integer.parseInt(st2.nextToken())
    if(a>0 && b>0){
        println('1')
        return
    }
    else if(a>0 && b<0) {
        println('4')
        return
    }
    else if(a<0 && b>0) {
        println('2')
        return
    }
    else(
            println('3')
            )
}