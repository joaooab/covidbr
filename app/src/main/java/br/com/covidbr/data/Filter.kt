package br.com.covidbr.data

data class Filter(
    val order: String = ORDER_NAME,
    val type: String = TYPE_ASC
) {
    companion object {
        const val ORDER_NAME = "ORDER_NAME"
        const val ORDER_INFECTED = "ORDER_INFECTED"
        const val ORDER_DECEASE = "ORDER_DECEASE"
        const val TYPE_ASC = "TYPE_ASC"
        const val TYPE_DESC = "TYPE_DESC"
    }
}