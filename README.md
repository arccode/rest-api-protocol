## 背景

1. 封装akka分布式调用时公用的入参和出参协议


## 版本发布历史

### v0.0.1

1. 顶层按语言(java, scala)分包
2. 约定协议命名规则

### v0.0.2

1. 取消顶层按语言分包, 仅使用一个包

## 协议命名规范

* 消息通道: 目前均采用点对点消息通道
* 消息: 三类消息
	* 命令消息: ExecuteXXX, 例如: ExecuteSelectLocationsByParentCode
	* 事件消息: XXXExecuted, 例如: SelectLocationsByParentCodeExecuted
	* 文档消息: XXXMsg, 例如: SelectLocationsByParentCodeMsg


## 发布构件

详见: [发布Scala构件至Maven中央库](http://www.arccode.net/publish-scala-artifact-to-maven-central-repository.html)