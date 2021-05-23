package baekjoon

import java.util.*
import java.io.*

data class Point(val x : Int, val y :Int)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = mutableListOf<MutableList<Char>>()
    val visited : MutableList<MutableList<Int>> = MutableList<MutableList<Int>>(n){
        MutableList(m){-1}
    }
    val visited1 : MutableList<MutableList<Int>> = MutableList<MutableList<Int>>(n){
        MutableList(m){-1}
    }
    for(i in 0 until n){
        val temp = mutableListOf<Char>()
        for(c in br.readLine().toString()) {
            temp.add(c)
        }
        arr.add(temp)
    }
    var jx = 0
    var jy = 0
    val dx = arrayOf(0,0,1,-1)
    val dy = arrayOf(1,-1,0,0)
    val queue : Deque<Point> = ArrayDeque()
    for(i in 0 until n){
        for(j in 0 until m){
            if(arr[i][j]=='F'){
                queue.add(Point(i,j))
                visited[i][j] = 0
            }
            if(arr[i][j]=='J') {
                jx = i
                jy = j
            }
        }
    }
    while(!queue.isEmpty()){
        val q = queue.poll()
        for(idx in 0..3){
            val x = q.x + dx[idx]
            val y = q.y + dy[idx]
            if(x<0 || x>=n || y<0 || y>=m) continue
            if(arr[x][y]=='#' || visited[x][y]>=0) continue
            queue.add(Point(x,y))
            visited[x][y]=visited[q.x][q.y]+1
        }
    }
    queue.add(Point(jx, jy))
    visited1[jx][jy] = 0
    while(!queue.isEmpty()){
        val q = queue.poll()
        for(idx in 0..3){
            val x = q.x + dx[idx]
            val y = q.y + dy[idx]
            if(x<0 || x>=n || y<0 || y>=m) {
                print(visited1[q.x][q.y]+1)
                return
            }
            if(arr[x][y]=='#' || visited1[x][y]>=0) continue
            if(visited[x][y] != -1 && visited[x][y]<=visited1[q.x][q.y]+1) continue
            queue.add(Point(x,y))
            visited1[x][y]=visited1[q.x][q.y]+1
        }
    }
    print("IMPOSSIBLE")
}