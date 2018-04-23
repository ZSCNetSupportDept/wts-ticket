package love.sola.zscnsd.wts.ticket.domain

import love.sola.zscnsd.wts.ticket.domain.events.EventType
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob

@Entity
class TicketEvent(
    @Id val id: Long,
    val type: EventType,
    val actor: Long,
    @Lob
    val payload: String,
    val timestamp: LocalDateTime
) {

}
