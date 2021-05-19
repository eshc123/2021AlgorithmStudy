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
        val temp = mutableListOf<Int>()
        for(c in br.readLine().toString()) {
            temp.add(Character.getNumericValue(c))
        }
        arr.add(temp)
    }
    val dx = arrayOf(0,0,1,-1)
    val dy = arrayOf(1,-1,0,0)

    val queue : Deque<Pair<Int,Int>> = ArrayDeque()
    queue.add(Pair(0,0))
    visited[0][0] = 1
    while(!queue.isEmpty()){
        val q = queue.poll()
        for(idx in 0..3){
            val x = q.first + dx[idx]
            val y = q.second + dy[idx]
            if(x<0 || x>=n || y<0 || y>=m) continue
            if(arr[x][y]==1 && visited[x][y] == 0 ) {
                queue.add(Pair(x, y))
                visited[x][y] = visited[q.first][q.second]+1
            }
        }
    }
    println(visited[n-1][m-1])
}