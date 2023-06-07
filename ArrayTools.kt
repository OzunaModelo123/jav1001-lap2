fun main() {
    averageArrayTester()
    println(arrayContains(arrayOf(1, 2, 3), 2)) // expect: true
}
/**
 * This function takes in an array of integers and calculates the average value of the numbers.
 *
 * @param inputArray
 * - Array of Integers
 * @return Double - Average value as a Double, or 0 if inputArray is empty
 */
fun arrayAverage(inputArray: Array<Int>): Double {
    if (inputArray.isEmpty()) { // Avoid divide by 0 in return
        return 0.0
    }
    var sum = 0.0
    for (number in inputArray) {
        sum += number
    }
    return sum / inputArray.size
}

fun averageArrayTester() {
    println(arrayAverage(arrayOf(1, 2, 3))) // Except: 2
    println(arrayAverage(arrayOf(-1, 2, -3))) // Expect: -2/3
    println(arrayAverage(arrayOf(-1909))) // Expect: -1909
    println(arrayAverage(arrayOf(-0))) // Expect: 0
    println(arrayAverage(arrayOf()))
}
/**
 * Determines if an array contains a specific value.
 *
 * @param inputArray The array to check.
 * @param target The value to search for.
 * @return True if the value is found in the array, false otherwise.
 */
fun arrayContains(inputArray: Array<Int>, target: Int): Boolean {
    for (element in inputArray) {
        if (element == target) {
            return true
        }
    }
    return false
}
