class FindChars

    val s1 = "eeezetee"
    val char = 'e'

    val arr = ArrayList<Int>()

    fun findChars(string: String, char: Char, startIndex: Int) {
        if(string.indexOf(char, startIndex) != -1) {
            var i = string.indexOf(char, startIndex)
            arr.add(i)
            if(i < string.length) {
                findChars(string, char, ++i)
            }
        }
    }

    fun main() {
        println("Find \'$char\' in \"$s1\":")
        findChars(s1, char, 0)
        println("\'$char\' was found ${arr.size} times in \"$s1\"!")
        for(index in arr) {
            println("Index of \'$char\' => $index")
        }
    }