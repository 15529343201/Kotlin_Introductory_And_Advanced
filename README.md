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

