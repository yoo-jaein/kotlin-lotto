package lotto

import lotto.domain.Lotto
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class LottoTest {
    @Test
    fun `로또를 구입할 수 있다`() {
        TODO("Not yet implemented")
    }

    @ParameterizedTest
    @ValueSource(ints = [3000, 4000])
    fun `로또 구입 금액을 입력하면 구입 금액에 해당하는 로또가 발급된다`(budget: Int) {
        assertThat(Lotto.affordableLottoCount(budget)).isEqualTo(budget / Lotto.DEFAULT_PRICE)
    }

    @Test
    fun `로또 1장의 가격은 1000원이다`() {
        assertThat(Lotto.DEFAULT_PRICE).isEqualTo(1000)
    }

    @Test
    fun `지난 주 당첨 번호를 입력할 수 있다`() {
        TODO("Not yet implemented")
    }

    @Test
    fun `당첨 번호와 3개, 4개, 5개, 6개가 일치한 경우를 통계로 보여준다`() {
        TODO("Not yet implemented")
    }

    @Test
    fun `총 수익률을 보여준다`() {
        TODO("Not yet implemented")
    }
}
