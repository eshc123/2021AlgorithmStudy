package baekjoon

import java.util.*
import java.io.*

//기본 문제
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st1 = StringTokenizer(br.readLine())

    val array = Array(7){ 0 }
    var result = 0

    array[st1.nextToken().toInt()] ++
    array[st1.nextToken().toInt()] ++
    array[st1.nextToken().toInt()] ++

    for(i in 1..6) {
        when (array[i]) {
            3 ->  {
                result = 10000 + i * 1000
                bw.write(result.toString())
                bw.flush()
                return
            }
            2 -> {
                result = 1000 + i * 100
                bw.write(result.toString())
                bw.flush()
                return
            }
            1 -> {
                result = i * 100
            }
        }
    }
    bw.write(result.toString())
    bw.flush()
}