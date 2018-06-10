# chapter1
### Kotlin是什么
- Android官方开发语言
- 100%兼容Java
- Kotlin-Js前端开发
- Kotlin-Jvm服务端开发
- Kotlin-Native本地执行程序
- Kotlin是一门全栈语言
### 如何系统学习Kotlin
- 语言特性
- 案例演示
- 对比Java
- 字节码分析
### 课程安排
1.课程介绍:<br>
- Kotlin介绍
- 开发环境搭建

2.基本语法:<br>
- 基本类型
- 空安全类型
- 智能转换
- 类与对象初步
- 数组与区间

3.程序结构:<br>
- 常量与变量
- 函数
- Lambda
- 类成员
- 条件表达式
- 循环语句
- 运算符
- 异常捕获

4.面向对象:<br>
- 抽象类和接口
- object
- 伴生对象
- 扩展方法
- 属性代理
- 数据类
- 内部类
- 枚举与密封类

5.高阶函数:<br>
- 基本概念
- 常见高阶函数
- 尾递归优化
- 闭包
- 函数复合
- 科里化
- 偏函数

6.DSL:<br>
- 基本概念
- 案例开发
- Gradle脚本

7.协程:<br>
- 基本概念
- 协程的使用
- 封装协程库
- 协程原理分析

8.与Java混编:<br>
- 基本互操作
- 正则表达式
- 集合框架
- IO操作
- 装箱与拆箱
- NoArg插件
- AllOpen插件
- 注解处理器

9.应用与展望:<br>
- 前景与展望
- 编写脚本
- 服务端
- 前端
- Android
- Native

### 那么Kotlin究竟是What?
&emsp;&emsp;Kotlin就是一门可以运行在Java虚拟机、Android、浏览器上的
静态语言它与Java 100%兼容,如果你对Java非常熟悉,那么你就会发现Kotlin除了自己
的标准库之外,大多仍然使用经典的Java集合框架<br>
### Kotlin的发展历程
- 2010立项
- 2011.6对外公开
- 2012.2开源
- 2013.8支持Android Studio
- 2014.6全新的开源web站点和域名Kotlinlang.org
- 2016.2发布1.0
- 2016.9发布1.0.4,支持apt
### 学习目标
- 学会使用Kotlin
- 熟悉Java生态
- 了解一些特性的背后实现
### 必备知识
- 熟悉计算机基础,操作系统相关的知识
- 了解Java及其生态
- 了解Java工程组织的常用工具
- 熟悉Intellij idea
### 参考资料
- 官方文档:https://kotlinlang.org/docs/reference/
- Kotlin源码:https://github.com/JetBrains/kotlin
- Kotlin官博:https://blog.jetbrains.com/kotlin
- Kotlin微信公众号:Kotlin
- Gradle文档:https://docs.gradle.org/current/userguide/userguide.html
# chapter2 数据类型
- 认识基本类型
- 初步认识类及其相关概念
- 认识区间和数组

### Boolean数据类型
### Number数据类型
### 拆箱装箱与Char数据类型
### 基本数据类型与字符串
### Kotlin中类和对象初始
### 空类型和智能类型转换
### 包(package)
### 区间(range)
### 数组(array)

# chapter3 程序结构
### 常量与变量(val,var)
- val=value,值类型
- 类似Java的final
- 不可能重复赋值
- 举例 运行时常量:val x=getX() 编译期常量:const val x=2

- var=variable
- 举例: var x="HelloWorld"//定义变量 x="HiWorld"//再次赋值

- 编译器可以推导量的类型:`val string="Hello"`//推导出String类型 `val int=5`//Int类型 `var x=getString()+5` //String类型

### 函数(function)
1.以特定功能组织起来的代码块<br>
- `fun [函数名]([参数列表]):[返回值类型]{[函数体]}`
- `fun [函数名]([参数列表])=[表达式]`

2.举例<br>
- `fun sayHi(name:String){println("Hi,$name")}`
- `fun sayHi(name:String)=println("Hi,$name")`

3.匿名函数<br>
- 无名氏一直是神一样的存在
- `fun([参数列表])`
- 举例: `val sayHi=fun(name:String)=println("Hi,$name")`

4.编写函数的注意事项<br>
- 功能要单一
- 函数名要做到顾名思义
- 参数个数不要太多

### Lambda表达式
1.什么是Lambda表达式<br>
- 匿名函数
- 写法:`{[参数列表]->[函数体,最后一行是返回值]}`
- 举例:`var sum={a:Int,b:Int->a+b}`

2.Lambda的类型表示举例<br>
- `()->Unit` 无参,返回值为Unit
- `(Int)->Int` 传入整形,返回一个整形
- `(String,(String)->String)->Boolean` 传入字符串、Lambda表达式,返回Boolean

3.Lambda表达式的调用<br>
- 用()进行调用
- 等价于invoke()
- 举例

```
val sum={a:Int,b:Int->a+b}
sum(2,3)
sum.invoke(2,3)
```

4.Lambda表达式的简化<br>
- 函数参数调用时最后一个Lambda可以移出去
- 函数参数只有一个Lambda,调用时小括号可省略
- Lambda只有一个参数可默认为it
- 入参、返回值与形参一致的函数可以用函数引用的方式作为实参传入

### 类成员(成员变量、成员方法)
1.什么是类成员<br>
- 属性:或者说成员变量,类范围内的变量
- 方法:或者说成员函数,类范围内的函数

2.函数和方法的区别<br>
- 函数强调功能本身,不考虑从属
- 方法的称呼通常是从类的角度出发
- 叫法不同,不要纠结

3.定义方法<br>
- 写法与普通函数完全一致
- 举例:

```
class Hello{
	fun sayHello(name:String)=println("Hello,$name")
}
```

4.定义属性<br>
- 构造方法参数中val/var修饰的都是属性
- 类内部也可以定义属性
- 举例

```
class Hello(val aField:Int,notAField:Int){
	var anotherField:Float=3f
}
```

5.属性访问控制<br>
- 属性可以定义getter/setter
- 举例:

```
val a:Int = 0
get()=field
var b:Float = 0f
set(value){field = value}
```

6.属性初始化<br>
- 属性的初始化尽量在构造方法中完成
- 无法在构造方法中初始化,尝试降级为局部变量
- var用lateinit延迟初始化,val用lazy
- 可空类型谨慎用null直接初始化

### 基本运算符
1.基本运算符<br>
- 任何类可以定义或者重载父类的基本运算符
- 通过运算符对应的具名函数来定义
- 对参数个数做要求,对参数和返回值类型不作要求
- 不能像Scala一样定义任意运算符

### 表达式(中缀表达式,分支表达式,when表达式)
1.中缀表达式<br>
- 只有一个参数,且用infix修饰的函数
- 举例

```
class Book{infix fun on(place:String){...}}
Book() on "My Desk"
```

2.分支表达式<br>
(1)if表达式:<br>
- if ... else 
```
if(a==b) ... else if(a==c) ... else ...
```

- 表达式与完备性
```
val x=if(b<0) 0 else b
val x=if(b<0) 0 //错误,赋值时,分支必须完备
```

3.When表达式<br>
- 加强版switch,支持任意类型
- 支持纯表达式条件分支(类似if)
- 表达式与完备性

### 循环语句(for,while,continue,break)
1.for循环<br>
- `for(element in elements) ...`
- 给任意类实现Iterator方法

2.While循环<br>
- 古董级语法
- do ... while(...) ...
- while(...) ...

3.跳过和终止循环<br>
- 跳过当前循环用continue
- 终止循环用break
- 多层循环嵌套的终止结合标签使用

``` 
Outter@for(...){
	Inner@while(i<0){ if(...) break@Outter}
}
```

### 异常捕获(try,catch,finally)
1.try...catch:<br>
- catch分支匹配异常类型
- 表达式,可以用来赋值

2.finally<br>
- finally无论代码是否抛出异常都会执行
- 注意下面的写法:

```
return try{x/y} catch(e:Exception){0} finally{...}
```

### 具名参数,变长参数,默认参数
1.具名参数<br>
- 给函数的实参附上形参
- 举例

```
fun sum(arg1:Int,arg2:Int)=arg1+arg2
sum(arg1=2,arg2=3)
```
2.变长参数<br>
- 某个参数可以接收多个值
- 可以不为最后一个参数
- 如果传参时有歧义,需要使用具名参数

3.Spread Operator<br>
- 只支持展开Array
- 只用于变长参数列表的实参
- 不能重载
- 不算一般意义上的运算符

4.默认参数<br>
- 为函数参数指定默认值
- 可以为任意位置的参数指定默认值
- 传参时,如果有歧义,需要使用具名参数

### 命令行计数器
### 导出可执行程序

![image](https://github.com/15529343201/Kotlin_Introductory_And_Advanced/blob/chapter3/image/8.PNG)<br>

# chapter4 面向对象
### 面向对象-抽象类与接口(abstract,interface)
1.面向对象的基本概念<br>
- 本质上就是解决如何用程序描述世界的的问题
- 讨论如何把实际存在的东西映射成程序的类和对象
- 一种程序设计的思路、思想、方法
- 程序设计层面的概念
- 设计模式:前人的程序设计经验

2.抽象类和接口<br>
(1)什么是接口<br>
- 接口,直观理解就是一种约定 Kotlin的接口与Objective-C的Protocol比较类似
- 举例,输入设备接口

```
interface InputDevice{
	fun input(event:Any)
}
```
(2)接口<br>
- 不能有状态
- 必须由类对其进行实现后使用

3.抽象类<br>
- 实现了一部分协议的半成品
- 可以有状态,可以有方法实现
- 必须由子类继承后使用

4.抽象类和接口的共性<br>
- 比较抽象,不能直接实例化
- 有需要子类(实现类)实现的方法
- 父类(接口)变量可以接受子类(实现类)的实例赋值

5.抽象类和接口的区别<br>
- 抽象类有状态,接口没有状态
- 抽象类有方法实现,接口只能有无状态的默认实现
- 抽象类只能单继承,接口可以多实现
- 抽象类反映本质,接口体现能力

### 继承
- 父类需要open才可以被继承
- 父类方法、属性需要open才可以被覆写
- 接口、接口方法、抽象类默认为open
- 覆写父类(接口)成员需要override关键字
- `class D:A(),B,C`
- 注意继承类时实际上调用了父类构造方法
- 类只能单继承,接口可以多实现
- 接口代理:`class Manager(driver:Driver):Driver by driver`
- 接口方法实现交给代理类实现
- 接口冲突:接口方法可以有默认实现
- 签名一致且返回值相同的冲突
- 子类(实现类)必须覆写冲突方法
- `super<[父类(接口)名]>.[方法名]([参数列表])`

### 类及其成员的可见性(private,protected,internal,public)
可见性对比:<br>
```
Kotlin                         Java
private                        private
protected                      protected
-                              default(包内可见)
internal(模块内可见)           -
public                         public
```

### object
- 只有一个实例的类
- 不能自定义构造方法
- 可以实现接口、继承父类
- 本质上就是单例模式最基本的实现

### 伴生对象与静态成员
- 每个类可以对应一个伴生对象
- 伴生对象的成员全局独一份
- 伴生对象的成员类似Java的静态成员
- 静态成员考虑用包级函数、变量替代
- JvmField和JvmStatic的使用

### 方法重载与默认参数
1.方法重载<br>
- Overloads
- 名称相同、参数不同的方法
- Jvm函数签名的概念:函数名、参数列表
- 跟返回值没有关系

2.默认参数<br>
- 为函数参数设定一个默认值
- 可以为任意位置的参数设置默认值
- 函数调用产生混淆时用具名参数
 
3.方法重载与默认参数<br>
- 二者的相关性以及`@JvmOverloads`
- 避免定义关系不大的重载
- 不好的设计:`List.remove(int)` `List.remove(Object)`

### 扩展成员
- 为现有类添加方法、属性

```
fun X.y():z{...}
val X.m注意扩展属性不能初始化,类似接口属性
```
- Java调用扩展成员类似调用静态方法

### 属性代理
- 定义方法:`val/var <property name>:<Type> by <expression>`
- 代理者需要实现相应的`setValue/getValue`方法
- lazy原理剖析

### 数据类(allOpen,noArg插件,再见,javaBean)
- 再见,JavaBean
- 默认实现的copy、toString等方法
- componentN方法
- allOpen和noArg插件

### 内部类(this@Outter,this@Inner)
1.内部类<br>
- 定义在类内部的类
- 与类成员有相似的访问控制
- 默认是静态内部类,非静态用inner关键字
- `this@Outter,this@Inner的用法`

2.匿名内部类<br>
- 没有定义名字的内部类
- 类名编译时生成,类似`Outter$1.class`
- 可继承父类、实现多个接口,与Java注意区别

### 枚举(enum)
- 实例可数的类,注意枚举也是类
- 可以修改构造,添加成员
- 可以提升代码的表现力,也有一定的性能开销

### 密封类(sealed Class)
- 子类可数

```
<v1.1,子类必须定义为密封类的内部类
v1.1,子类只需要与密封类在同一个文件中
```
- 仔细体会与枚举的不同

# chapter5 高阶函数
### 高阶函数的基本概念f(g(x))
- 传入或者返回函数的函数
- 函数引用:`::println`
- 带有Receiver的引用`pdfPrinter::println`

### 常见高阶函数
- `map/flatMap`
- `fold/reduce`
- `filter/takeWhile`
- `let/apply/with/use`

### 尾递归优化
- 递归的一种特殊形式
- 调用自身后无其他操作
- tailrec关键字提示编译器尾递归优化
- 尾递归与迭代的关系

### 闭包
- 函数运行的环境
- 持有函数运行状态
- 函数内部可以定义函数
- 函数内部也可以定义类

### 函数复合
- f(g(x))
- 如何实现函数复合
- 回顾:infix的使用

### 科理化(Currying)-函数调用链
- 理解Currying的概念:简单来说就是多元函数变换成一元函数调用链
- 了解Currying的实现方法

### 偏函数
- 理解偏函数的概念:传入部分参数得到的新函数
- 仔细体会与Currying的不同
- 了解偏函数的实现方法

# chapter6 领域特定语言DSL
### DSL的概念
- 只在特定领域使用的语言
- 例如:HTML,Gradle,SQL等等

### DSL的特点
- 计算机编程语言
- 具有语言的表达能力
- 有限的表达能力
- 关注某个特定领域

### 案例:HTML DSL

# chapter7 协程Coroutine
### 什么是协程
- 协作程序,解决异步问题
- 应用层完成调度
- 支持协程的语言例如:Lua,C#

### 协程要解决什么问题

```
现在开始我们要运行协程啦{
	//现在我们在协程里面了
	//花括号内的代码可以是一段运行在UI线程的代码,比如Android初始化UI
	
	val 视图=...//初始化视图
	//注意,异步加载图片 这个鬼东西看上去像个函数,它运行在其他线程
	val 图片=异步加载图片(图片的地址)
	视图.显示图片(图片)
}
```

### 协程要解决什么问题
- 异步代码像同步代码一样直观 
- 简化异步代码异常处理
- 轻量级的并发方案

### 概述
- 1.1开始支持
- 实验性质的API

### 如何支持协程
- 编译器对suspend函数的编译支持
- 标准库的基本API支持
- `kotlinx.coroutine`应用级支持

### 案例:异步下载图片
### 协程的基本API
- `createCoroutine:创建协程`
- `startCoroutine:启动协程`
- `suspendCoroutine:挂起协程`
- `Continuation接口` 运行控制类,负责结果和异常的返回
- `CoroutineContext接口` 运行上下文,资源持有,运行调度
- `ContinuationInterceptor接口` 协程控制拦截器 可用来处理协程调度

### 协程的原理剖析
1.执行流程<br>
- 协程被编译成状态机
- suspend函数即状态转移

![image](https://github.com/15529343201/Kotlin_Introductory_And_Advanced/blob/chapter7/image/9.PNG)<br>

2.运行结果<br>
- 正常的结果通过resume返回
- 异常通过resumeWithException抛出

![image](https://github.com/15529343201/Kotlin_Introductory_And_Advanced/blob/chapter7/image/10.PNG)<br>

### Kotlinx.coroutine框架介绍
1.框架简介<br>
- Kotlin官方协程应用框架
- 提供大量对协程API的封装

2.主要模块<br>
![image](https://github.com/15529343201/Kotlin_Introductory_And_Advanced/blob/chapter7/image/11.PNG)<br>
![image](https://github.com/15529343201/Kotlin_Introductory_And_Advanced/blob/chapter7/image/12.PNG)<br>
![image](https://github.com/15529343201/Kotlin_Introductory_And_Advanced/blob/chapter7/image/13.PNG)<br>

# chapter8 Kotlin与Java混合开发
### 基本互操作
1.属性读写<br>
- Kotlin自动识别Java Getter/Setter
- Java操作Kotlin属性通过Getter/Setter

2.空安全类型<br>
- Kotlin空安全类型的原理
- 平台类型Platform Type
- `@Nullable和@NotNull`

3.基类函数的调用<br>
- 包级函数:静态方法
- 扩展方法:带Receiver的静态方法
- 运算符重载:带Receiver的对应名称的静态方法

4.几个常用注解的使用<br>
- `@JvmField`:将属性编译为Java变量
- `@JvmStatic`:将对象的方法编译成Java静态方法
- `@JvmOverloads`:默认参数生成重载方法
- `@file:JvmName`:指定Kotlin文件编译后的类名

5.NoArg与AllOpen<br>
- NoArg为被标注的类生成无参构造 支持Jpa注解,如`@Entity`
- AllOpen为被标注的类去掉final,允许被继承 支持Spring注解,如`@Component`
- 支持自定义注解类型,例如`@PoKo`

6.泛型<br>
- `通配符Kotlin的*对应于Java的?`
- `协变和逆变out/in   - ArrayList<out String>`
- `没有Raw类型   - Java的List->Kotlin的List<*>`
