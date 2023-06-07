fun main() {
    averageArrayTester()
    println(arrayContains(arrayOf(1, 2, 3), 2)) // expect: true
    val intArray = arrayOf(1, 2, 3, 4, 5)
    val reversedIntArray = reverseArray(intArray)
    println("Reversed Int Array: ${reversedIntArray.joinToString()}")

    val inputString = "Hello, World!"
    val reversedString = reverseArray(inputString)
    println("Reversed String: $reversedString")
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
/**
 * Reverses the order of elements in an array and returns a new array with the reversed order.
 *
 * @param inputArray The array to be reversed.
 * @return A new array with the elements in reverse order.
 */
fun reverseArray(inputArray: Array<Int>): Array<Int> {
    val result = Array(inputArray.size) { 0 } // result is the same size as input with all elems = 0
    val stack = ArrayDeque<Int>()
    for (num in inputArray) {
        stack.addLast(num) // equivalent of push for a normal stack
    }
    var index = 0
    while (stack.isNotEmpty()) {
        result[index++] = stack.removeLast()
    }
    return result
}
/**
 * Reverses the order of characters in a string and returns a new string with the reversed order.
 *
 * @param input The string to be reversed.
 * @return A new string with the characters in reverse order.
 */
fun reverseArray(input: String): String {
    var result = ""
    val stack = ArrayDeque<Char>()
    for (char in input) {
        stack.addLast(char) // equivalent of push for a normal stack
    }
    while (stack.isNotEmpty()) {
        result = "$result${stack.removeLast()}"
    }
    return result
}