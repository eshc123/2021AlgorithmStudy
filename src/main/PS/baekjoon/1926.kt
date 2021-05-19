package baekjoon

import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = mutableListOf<List<Int>>()
    val visited : Array<Array<Int>> = Array<Array<Int>>(n){
        Array(m) { 0 }
    }
    for(i in 0 until n){
        val temp =  (br.readLine().split(' ').map { it.toInt() })
        arr.add(temp)
    }
    val dx = arrayOf(0,0,1,-1)
    val dy = arrayOf(1,-1,0,0)

    val queue : Deque<Pair<Int,Int>> = ArrayDeque()
    var max = 0
    var cnt = 0
    for(i in 0 until n){
        for(j in 0 until m){
            if(arr[i][j]==1 && visited[i][j]==0){
                var result = 0
                cnt += 1
                queue.add(Pair(i,j))
                visited[i][j] = 1
                while(!queue.isEmpty()){
                    val q = queue.poll()
                    result += 1
                    for(idx in 0..3){
                        val x = q.first + dx[idx]
                        val y = q.second + dy[idx]
                        if(x<0 || x>=n || y<0 || y>=m) continue
                        if(visited[x][y]!=1 && arr[x][y]==1) {
                            queue.add(Pair(x, y))
                            visited[x][y]=1

                        }
                    }
                }
                max = if(max<result) result else max
             }
        }
    }
    println(cnt)
    println(max)
}