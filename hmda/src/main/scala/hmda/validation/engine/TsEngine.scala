package hmda.validation.engine

import hmda.model.filing.ts.TransmittalSheet
import hmda.validation.context.ValidationContext
import hmda.validation.rules.ts.syntactical.{S300, S303}
import hmda.validation.rules.ts.validity._

object TsEngine extends ValidationEngine[TransmittalSheet] {

  override def syntacticalChecks(ctx: ValidationContext) = Vector(
    S300,
    S303.withContext(ctx)
  )

  override val validityChecks = Vector(
    V600,
    V601,
    V602,
    V603,
    V604,
    V605,
    V606,
    V607
  )

}
