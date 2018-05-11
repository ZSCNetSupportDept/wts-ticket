package love.sola.zscnsd.wts.ticket.domain.events

import love.sola.zscnsd.wts.common.domain.Address

data class TicketOpenEvent(
    val address: Address,
    val description: String,
    val phone: String
) {

}
