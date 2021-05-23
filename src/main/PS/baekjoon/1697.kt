package baekjoon

import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val list = MutableList(100001){0}

    val queue : Deque<Int> = ArrayDeque()
    queue.add(n)
    while(!queue.isEmpty()) {
        val q = queue.poll()
        if(q==k) {
            print(list[q])
            return
        }
        if(q+1<100001 && list[q+1]==0){
            queue.add(q+1)
            list[q+1]=list[q]+1
        }
        if(q>0 && list[q-1]==0){
            queue.add(q-1)
            list[q-1]=list[q]+1
        }
        if(q*2<100001 && list[q*2]==0){
            queue.add(q*2)
            list[q*2]=list[q]+1
        }
    }
    print(list[k])
}
