import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = StringTokenizer(br.readLine()).nextToken().toInt()
    for(i in 0 until n) {
        val st1 = StringTokenizer(br.readLine())
        val a =  st1.nextToken()
        val b =  st1.nextToken()
        bw.write(strfry(a,b)+"\n")
    }


    bw.flush()
    bw.close()
}

fun strfry(a : String, b : String) : String {
    val arr1 = Array('z'-'a'+1){0}
    val arr2 = Array('z'-'a'+1){0}
    for(i in a){
        arr1[i-'a'] += 1
    }
    for(i in b){
        arr2[i-'a'] += 1
    }
    for(i in 0 until ('z'-'a'+1)){
        if(arr1[i] != arr2[i]) return "Impossible"
    }
    return "Possible"
}