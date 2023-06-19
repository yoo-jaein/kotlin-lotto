package lotto

import lotto.domain.Lotto
import lotto.domain.LottoNumber
import lotto.domain.WinningLotto
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class WinningLottoTest {
    @Test
    fun `지난 주 당첨 번호와 몇 개가 일치하는지 확인할 수 있다`() {
        val lottoNumbers1 = LottoNumber.createList(listOf(1, 2, 3, 4, 5, 6))
        val myLotto1 = Lotto(lottoNumbers1)
        val winningLotto = WinningLotto(myLotto1, LottoNumber.create(7))

        val lottoNumbers2 = LottoNumber.createList(listOf(10, 11, 12, 13, 14, 15))
        val myLotto2 = Lotto(lottoNumbers2)
        Assertions.assertThat(myLotto1.checkEqualCount(winningLotto)).isEqualTo(6)
        Assertions.assertThat(myLotto2.checkEqualCount(winningLotto)).isEqualTo(0)
    }
}
