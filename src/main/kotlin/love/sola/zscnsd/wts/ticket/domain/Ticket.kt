package love.sola.zscnsd.wts.ticket.domain

import love.sola.zscnsd.wts.common.domain.Address
import java.time.LocalDateTime
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob

@Entity
class Ticket(
    @Id val id: Int,
    val creator: Long,
    val createTime: LocalDateTime,
    val updateTime: LocalDateTime,
    @Embedded val address: Address,
    @Lob val description: String,
    val phone: String,
    val state: TicketState
) {

}
