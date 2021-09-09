package extensoes

import java.math.BigDecimal
import java.text.NumberFormat

fun BigDecimal.formataPraReal(): String {
    return NumberFormat.getCurrencyInstance().format(this)
}