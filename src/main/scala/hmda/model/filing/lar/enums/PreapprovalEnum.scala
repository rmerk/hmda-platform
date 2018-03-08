package hmda.model.filing.lar.enums

sealed trait PreapprovalEnum extends LarEnum

object PreapprovalEnum extends LarCodeEnum[PreapprovalEnum] {
  override val values = List(1, 2)

  override def valueOf(code: Int): PreapprovalEnum = {
    code match {
      case 1 => PreapprovalRequested
      case 2 => PreapprovalNotRequested
      case _ => throw new Exception("Invalid Preapproval Code")
    }
  }
}

case object PreapprovalRequested extends PreapprovalEnum {
  override val code: Int = 1
  override val description: String = "Preapproval requested"
}

case object PreapprovalNotRequested extends PreapprovalEnum {
  override val code: Int = 2
  override val description: String = "Preapproval not requested"
}
