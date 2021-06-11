package subtask3

import kotlin.reflect.KClass

import java.time.LocalDate
import java.time.format.DateTimeFormatter


class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {

            Int::class -> {
                return blockA.filterIsInstance<Int>().sum()
            }

            String::class -> {
                return blockA.filterIsInstance<String>().joinToString("")
            }

            LocalDate::class -> {
                return blockA.filterIsInstance<LocalDate>()
                    .maxBy { it }?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) ?: ""
            }
            else -> ""
        }
    }
}


