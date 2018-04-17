## 背景

1. 封装akka分布式调用时公用的入参和出参协议


## 版本发布历史

### v0.0.1

1. 顶层按语言(java, scala)分包

## 协议命名规范

* 消息通道: 目前均采用点对点消息通道
* 消息: 三类消息
	* 命令消息: ExecuteXXX, 例如: ExecuteSelectLocationsByParentCode
	* 事件消息: XXXExecuted, 例如: SelectLocationsByParentCodeExecuted
	* 文档消息: XXXMsg, 例如: SelectLocationsByParentCodeMsg


	