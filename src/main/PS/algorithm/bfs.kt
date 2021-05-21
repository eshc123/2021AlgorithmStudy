package algorithm

import java.util.*
import java.io.*

fun main() {
    val arr : Array<Array<Int>> = Array<Array<Int>>(10){
        arrayOf(0,0,0,0,0,0,0,0,0,0) // 초기화시키는 방법 알아보기
    }
    val visited : Array<Array<Int>> = Array<Array<Int>>(10){
        arrayOf(0,0,0,0,0,0,0,0,0,0)
    }
    val dx = arrayOf(0,0,1,-1)
    val dy = arrayOf(1,-1,0,0)

    val queue : Deque<Pair<Int,Int>> = ArrayDeque()

    queue.add(Pair(0,0))
    visited[0][0] = 1
    while(!queue.isEmpty()){
        val q = queue.poll()
        visited[q.first][q.second] = 1
        print("$q ")
        for(i in 0..3){
            val x = q.first + dx[i]
            val y = q.second + dy[i]
            if(x<0 || x>9 || y<0 || y>9) continue
            if(visited[x][y]!=1 && arr[x][y]!=1) {
                queue.add(Pair(x, y))
                visited[x][y]=1
            }
        }
    }
}