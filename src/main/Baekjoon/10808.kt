import java.util.*
import java.io.*

//배열 문제
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st1 = StringTokenizer(br.readLine())
    val map : MutableMap<Char,Int> = mutableMapOf()
    val array = Array(26) {0}
    for(i in 'a'..'z'){
        map[i] = i-'a'
    }

    st1.nextToken().forEach {
        array[map[it]!!] += 1
    }
    array.forEach {
        print("$it ")
    }
}