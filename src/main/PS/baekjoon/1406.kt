import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val str = StringTokenizer(br.readLine()).nextToken()
    val n = StringTokenizer(br.readLine()).nextToken().toInt()
    val linkedList : LinkedList<String> = LinkedList()
    // var cursor = str.length     cursor를 linkedList.listIterator() 로 대체
    for(s in str){
        linkedList.add(s.toString())
    }
    val iterator = linkedList.listIterator(str.length)
    for(i in 0 until n){
        val st = StringTokenizer(br.readLine())
        when (st.nextToken()) {
            "L" -> {
                if(iterator.hasPrevious())
                    iterator.previous()
                continue
            }
            "D" -> {
                if(iterator.hasNext())
                    iterator.next()
                continue
            }
            "B" -> {
                if(iterator.hasPrevious()){
                    iterator.previous()
                    iterator.remove()
                }
                continue
            }
            "P" -> {
                iterator.add(st.nextToken())
                continue
            }
        }
    }
    for(it in linkedList) {
        bw.write(it)
    }
    bw.flush()
    bw.close()
}