import java.util.Date

fun main(args: Array<String>) {

}

fun avgEvenNums(nums: Array<Int>): Int{

    var result = 0
    var num = 0

    for(x in nums){
        if (x % 2 == 0){
            result +=x
            num++
        }
    }
    return result/num
}

fun isEqual(text: String): Boolean{

    if (text.reversed() == text){
        return true
    }
    return false
}

