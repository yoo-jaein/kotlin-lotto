package lotto.view

import lotto.domain.Lotto

class InputView {
    fun inputPurchasePrice(): Int {
        println("구입금액을 입력해 주세요.")
        return readln().toInt()
    }

    fun inputLastWeekLottoNumbers(): Lotto {
        println("\n지난 주 당첨 번호를 입력해 주세요.")
        val numbers = readln().split(NUMBERS_DELIMITER).map { it.toInt() }
        return Lotto(numbers)
    }

    companion object {
        private const val NUMBERS_DELIMITER: String = ", "
    }
}
