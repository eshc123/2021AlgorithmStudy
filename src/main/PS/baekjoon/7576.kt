package baekjoon

import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = mutableListOf<MutableList<Int>>()
    val visited : Array<Array<Int>> = Array<Array<Int>>(m){
        Array(n) { -1 }
    }
    for(i in 0 until m){
        val temp =  (br.readLine().split(' ').map { it.toInt() }).toMutableList()
        arr.add(temp)
    }
    val dx = arrayOf(0,0,1,-1)
    val dy = arrayOf(1,-1,0,0)

    val queue : Deque<Pair<Int,Int>> = ArrayDeque()

    for(i in 0 until m) {
        for (j in 0 until n) {
            if (arr[i][j] == 1 && visited[i][j] == -1) {
                queue.add(Pair(i, j))
                visited[i][j] = 0
            }
        }
    }
    while (!queue.isEmpty()) {
        val q = queue.poll()
        for (idx in 0..3) {
            val x = q.first + dx[idx]
            val y = q.second + dy[idx]
            if (x < 0 || x >= m || y < 0 || y >= n) continue
            if (arr[x][y] == 0 && visited[x][y]==-1) {
                queue.add(Pair(x, y))
                visited[x][y] = visited[q.first][q.second] + 1
                arr[x][y] = 1
            }
        }
    }
    var max = 0

    loop@ for(i in 0 until m) {
        for (j in 0 until n) {
            if(arr[i][j]==0) {
                max = -1
                break@loop
            }
            max = if (visited[i][j] > max) visited[i][j] else max
        }
    }
    print(max)
}