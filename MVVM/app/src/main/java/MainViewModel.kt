import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class notesRepo {
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        return if (num2 != 0) {
            num1 / num2
        } else {
            0
        }
    }
}