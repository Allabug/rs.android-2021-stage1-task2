package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {

        var newString = ""
        val aUpperCase = a.toUpperCase()

        for (i in aUpperCase.indices) {
            if (b.contains(aUpperCase[i])) {
                newString += aUpperCase[i]
            }
        }

        return if (newString.compareTo(b) == 0) {
            "YES"
        } else {
            "NO"
        }
    }
}