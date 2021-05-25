package baekjoon

import java.util.*
import java.io.*

private val dx = arrayOf(0,0,1,-1)
private val dy = arrayOf(1,-1,0,0)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    for(i in 0 until t){
        val str = StringTokenizer(br.readLine())
        val n = str.nextToken().toInt()
        val m = str.nextToken().toInt()
        val k = str.nextToken().toInt()
        val arr = MutableList<MutableList<Int>>(n){
            MutableList(m){0}
        }
        var cnt = 0
        val queue: Deque<Pair<Int, Int>> = ArrayDeque()
        val visited: MutableList<MutableList<Int>> = MutableList<MutableList<Int>>(n) {
            MutableList(m) { 0 }
        }
        for(j in 0 until k) {
            val str1 = StringTokenizer(br.readLine())
            val a = str1.nextToken().toInt()
            val b = str1.nextToken().toInt()
            arr[a][b] = 1

        }
        for(r in 0 until n){
            for(c in 0 until m){
                if(arr[r][c]==1 && visited[r][c]!=1){
                    queue.add(Pair(r,c))
                    visited[r][c] = 1
                    cnt += 1
                    while(!queue.isEmpty()) {
                        val q = queue.poll()

                        for (idx in 0..3) {
                            val x = q.first + dx[idx]
                            val y = q.second + dy[idx]
                            if (x < 0 || x >= n || y < 0 || y >= m) continue
                            if(arr[x][y]!=1 || visited[x][y]==1) continue
                            queue.add(Pair(x,y))
                            visited[x][y] = 1
                        }
                    }
                }
            }
        }
        println(cnt)
    }
}
