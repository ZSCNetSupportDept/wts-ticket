package love.sola.zscnsd.wts.ticket.domain

import love.sola.zscnsd.wts.ticket.domain.events.TicketEventType
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob

@Entity
class TicketEvent(
    @Id val id: Int,
    val type: TicketEventType,
    val ticketId: Int,
    val actor: Long,
    @Lob
    val payload: String,
    val timestamp: LocalDateTime
) {

}
