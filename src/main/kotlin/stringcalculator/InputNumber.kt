package stringcalculator

data class InputNumber(
    val value: Int
) {
    constructor(string: String) : this(
        try {
            string.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("$NOT_NUMBER_MESSAGE : $string ")
        }
    )

    init {
        require(value >= 0) {
            throw IllegalArgumentException("error : $value $NEGATIVE_NOT_ALLOWED_MESSAGE")
        }
    }

    companion object {
        const val NOT_NUMBER_MESSAGE = "숫자가 아닙니다."
        const val NEGATIVE_NOT_ALLOWED_MESSAGE = "0과 양의 정수 입력만 허용"
    }
}
