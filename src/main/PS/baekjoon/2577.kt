package baekjoon

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()
    var result = a*b*c
    val arr = Array(10) { 0 }
    while(result > 0){
        arr[result%10] += 1
        result /= 10
    }
//    "$result".forEach {
//        arr[it.toInt()]
//    }
    arr.forEach {
        bw.write("$it\n")
    }
    bw.flush()
    bw.close()
}