import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = StringTokenizer(br.readLine()).nextToken()
    val arr = Array(10){ 0 }
    for(i in n) {
        val idx = Character.getNumericValue(i)
        if(idx == 9)
            arr[6] += 1
        else
            arr[idx] += 1
    }
    arr[6] = if(arr[6]%2 > 0) arr[6]/2 + 1 else arr[6]/2
    var max = 0
    for(i in arr){
        max = if(max < i) i else max
    }
    bw.write(max.toString())
    bw.flush()
    bw.close()
}