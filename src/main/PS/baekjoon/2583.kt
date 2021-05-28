package baekjoon

import java.io.*
import java.util.*

private val dx = arrayOf(-1,1,0,0)
private val dy = arrayOf(0,0,-1,1)
private val arr = mutableListOf<MutableList<Int>>()
private val visited1 = mutableListOf<MutableList<Int>>()
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = StringTokenizer(br.readLine())

    val m = str.nextToken().toInt()
    val n = str.nextToken().toInt()
    val k = str.nextToken().toInt()

    for(i in 0 until m){
        arr.add(MutableList(n){0})
    }
    for(i in 0 until m){
        visited1.add(MutableList(n){0})
    }

    for(i in 0 until k){
        val str1 = StringTokenizer(br.readLine())
        val y1 = str1.nextToken().toInt()
        val x1 = str1.nextToken().toInt()
        val y2 = str1.nextToken().toInt()
        val x2 = str1.nextToken().toInt()

        for(j in x1 until x2){
            for(l in y1 until y2){
                arr[j][l] = 1
            }
        }
    }
    val result = mutableListOf<Int>()
    for(i in 0 until m){
        for(j in 0 until n){
            if(arr[i][j]!=0 || visited1[i][j]==1) continue
            result.add(bfs2(m,n,Pair(i,j)))

        }
    }
    result.sort()
    println(result.size)
    result.map{
         print("$it ")
    }
}

fun bfs2(m : Int, n : Int, c: Pair<Int, Int>) :Int {
    val queue : Deque<Pair<Int,Int>> = ArrayDeque()
    queue.add(c)
    visited1[c.first][c.second] = 1
    var cnt = 1
    while(!queue.isEmpty()){
        val q = queue.poll()
        for(i in 0..3){
            val x = q.first + dx[i]
            val y = q.second + dy[i]
            if(x<0 || y<0 || x>=m || y>=n) continue
            if(visited1[x][y]==1 || arr[x][y]==1) continue
            queue.add(Pair(x,y))
            visited1[x][y] = 1
            cnt += 1
        }
    }
    return cnt
}
