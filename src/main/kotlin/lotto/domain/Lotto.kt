package lotto.domain

class Lotto(
    val numbers: List<LottoNumber>
) {
    init {
        require(numbers.size == NUMBER_OF_LOTTO_NUMBERS) { "로또 번호는 6개여야 합니다." }
    }

    fun checkEqualCount(winningLotto: WinningLotto): Int {
        val otherNumbers = winningLotto.lotto.numbers
        return otherNumbers.intersect(numbers.toSet()).count()
    }

    fun isCatchBonus(bonusNumber: LottoNumber): Boolean = numbers.contains(bonusNumber)

    companion object {
        const val NUMBER_OF_LOTTO_NUMBERS: Int = 6

        fun autoCreate(): Lotto {
            val lottoNumbers = LottoNumber.createRandom(NUMBER_OF_LOTTO_NUMBERS)
            return Lotto(lottoNumbers)
        }
    }
}
