fun sayHello(languages:List<String>){
    languages.forEach{lang ->
        println("Hi $lang")
    }
}

fun main() {
    /*
    val data = arrayOf("PHP", "JavaScript", "Python")

    println(data.size)
    println(data[0])

    for(dat in data) {
        println("$dat - for")
    }

    data.forEach {
        println("$it - foreach")
    }

    data.forEach {custom ->
        println("$custom - foreach custom name")
    }

    data.forEachIndexed { index, lang ->
        println("$index - $lang")
    }
        */

    //val data = listOf("PHP", "JavaScript", "Python")
    val data = mutableListOf("PHP", "JavaScript", "Python")
    data.add("Java")

    println(data[0])

    data.forEach{lang ->
        println(lang)
    }

    //val map = mapOf("lang" to "PHP", "Framework" to "Laravel", "database" to "MySQL")
    val map = mutableMapOf("lang" to "PHP", "Framework" to "Laravel", "database" to "MySQL")
    map.put("JS", "Vue")

    map.forEach { (key, value) ->
        println("$key - $value")
    }

    sayHello(data)
}