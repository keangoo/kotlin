import java.util.*

/**
 * Created by Thuan Nguyen on 07-Jun-17.
 */
fun main(args: Array<String>) {
    Dog ( { text:String ->
        println(text)
    } , "Gau gau")

    Dog(::Bark, "Gâu gâu")

    Cat (::Moew)

    val dogsList: Array<String> = arrayOf("Milu", "Kiki")
    dogsList.map { item -> println(item) }

    val catsList: Array<String> = arrayOf("Kitty", "Mash")
    val all = catsList.flatMap { cat -> dogsList.map { dog -> "$cat$dog" } }
    println(all)

    val x = 5
    when (x) {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        else -> println("unknown")
    }

    val number:Int = try {
        Integer.parseInt("test")
    } catch(e:NumberFormatException) {
        -1
    }
    println(number)

    val ages = TreeMap<String,Int>()
    ages["kevin"] = 24
    ages["sam"] = 26
    ages["henry"] = 28
    ages["harry"] = 20

    for ((name, age) in ages) {
        println("$name is $age")
    }

    for (i in 1..10 step 1) {
        println(i)
    }

    for (i in 1 until 10 step 1) {
        println(i)
    }
}

fun Bark(text: String) {
    println(text)
}

fun Moew() {
    println("Moew moew")
}

fun Dog(fn: (String) -> Unit, text:String) {
    fn(text)
}

fun Cat(fn: () -> Unit) {
    fn()
}
