class Main {
}

fun main(args: Array<String>) {
    var nickname: String = "basked"
    var a: Int = 1
    var b: Int = 5
// primitive types
    var v1: Byte = 12 //8
    var v2: Short = 12 //16
    var v3: Int = 12 //32
    var v4: Long = 12 //64
    var v5: Float = 1.12F //32
    var v6: Double = 1.12e2 //54
    var v7: String = "1.12"
    var v8: Char = 'a'
    var v9: Boolean = true
    var b1: Long = v1.toLong()

// print
    println(nickname)
    println("Nickname: " + nickname)
    println("Nickname: $nickname")
    println("Nickname: \$nickname")
    println("A+B=${a + b}")
// use java class
    val userJava = UserJava("basket.baza@gmail.com")
    println("Java example: ${userJava.email}")
// use kotlin class
    val userKotlin = UserKotlin("basket.baza@gmail.com")
    println("Kotlin example: ${userKotlin.email}")
// functions
    println(myFunction1())
    println(myFunction2(5444444444444444444))
    myFunction3(555)

    println(myFunction4(54444, 67.5))
    // npe and null
    val npe: String? = getNpe()
    val size: Int = npe!!.length
    println("Null $npe ; Size=$size")
}

// functions
fun myFunction1(): Int {
    var a: Int = 2
    var b: Int = 3
    return a + b
}

fun myFunction2(a: Long): Int {
    return a.toInt()
}

fun myFunction3(a: Int) {
    println("Analog void:  ${a + 5}")
}

fun myFunction4(a: Long, b: Double) = a + b

fun getNpe(): String? {
    return null
}