package baekjoon

import java.util.*

private var k = 0
private var n = 0
private var m = 0

private lateinit var arr : Array<IntArray>
private lateinit var visited : Array<Array<IntArray>>
private val dx = arrayOf(0,0,1,-1)
private val dy = arrayOf(1,-1,0,0)
private val hdx = arrayOf(2,2,1,-1,-2,-2,1,-1)
private val hdy = arrayOf(1,-1,2,2,1,-1,-2,-2)
fun main() {
    val br = System.`in`.bufferedReader()
    k = br.readLine().toInt()
    val tmp = br.readLine().split(" ").map { it.toInt() }
    n = tmp[1]
    m = tmp[0]
    arr = Array(n){ IntArray(m) }
    visited = Array(n){ Array(m){ IntArray(k+1){-1} } }
    repeat(n){
        val points = br.readLine().split(" ").map { it.toInt() }
        arr[it] = points.toIntArray()
    }
    bfs()
    var result = m * n
    var bool = false
    for(i in 0 .. k){
        if(visited[n-1][m-1][i] != -1) {
            bool = true
            result = Math.min(result, visited[n-1][m-1][i])
        }
    }
    if(bool) println(result)
    else println(-1)
}
private fun bfs(){
    val queue : Queue<Triple<Int,Int,Int>> = ArrayDeque()
    for(i in 0 ..k){
        visited[0][0][i] = 0
    }
    queue.offer(Triple(0,0,0))
    while(queue.isNotEmpty()){
        val q = queue.poll()
        val x = q.first
        val y = q.second
        val jumped = q.third
        if(x == n && y == m) return
        //나이트 점프 x
        for(i in 0 .. 3){
            val nx = x + dx[i]
            val ny = y + dy[i]
            if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue
            if(arr[nx][ny] == 1) continue
            if(visited[nx][ny][jumped] != -1) continue
            visited[nx][ny][jumped] =  visited[x][y][jumped]+1
            queue.offer(Triple(nx,ny,jumped))
        }
        if(jumped < k){
            for(i in 0 ..7){
                val nx = x + hdx[i]
                val ny = y + hdy[i]
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue
                if(arr[nx][ny] == 1) continue
                if(visited[nx][ny][jumped+1] != -1) continue
                visited[nx][ny][jumped+1] =  visited[x][y][jumped]+1
                queue.offer(Triple(nx,ny,jumped+1))
            }
        }
    }
}