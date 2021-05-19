package baekjoon

import java.util.*
import java.io.*

//배열 문제
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st1 = StringTokenizer(br.readLine())
    val array = Array(26) {0}

    st1.nextToken().forEach {
        array[it-'a'] += 1
    }
    array.forEach {
        print("$it ")
    }
}