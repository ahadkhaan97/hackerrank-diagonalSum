
fun main() {
    print(diagonalDifference(arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(9, 8, 9))))
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var sumLeft = 0
    var sumRight = 0
    for (i in arr.indices) {
        sumLeft += arr[i][i]
        sumRight += arr[i][arr.size - 1 - i]
    }

    return kotlin.math.abs(sumLeft - sumRight)
}