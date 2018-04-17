package net.arccode.protocol.scalaremote

/**
  * 区域信息协议
  *
  * @author http://arccode.net
  * @since 2018-04-11
  */
object LocationProtocol {

  case class ExecuteSelectLocationsByParentCode(parentCode: String)
  case class Location(code: String,
                      name: String,
                      parentCode: String,
                      level: Int = 0)

  case class SelectLocationsByParentCodeMsg(subLocations: List[Location])

}
