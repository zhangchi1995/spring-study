学习spring框架的一些代码
# 2020.5.21 自动装配
## 常用依赖
```xml
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.6.RELEASE</version>
        </dependency>
```
## 使用注解的xml必要约束
```$xslt
xmlns:context="http://www.springframework.org/schema/context"
xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.0.xsd">
```
- 注解的支持
```$xslt
    <context:annotation-config />
```
#注解说明
- @AutoWired 自动装配，通过类型、名字，属于spring的注解
如果@AutoWired不能唯一自动装配上属性，则需要@Qualifier(value = 'xxx')
- @Nullable 字段标记了这个注解，则说明这个字段可以为null
- @Resource 自动装配通过名字、类型，是属于JAVA的注解
- @Component 组件,放在类上,说明这个类被spring管理了，就是bean
- @Service 将业务逻辑层的类注册到bean中
- @Repository 将数据访问层的类注册到bean中
- @Controller 将控制器层的类注册到bean中
- @Scope 作用域注解 例如：@Scope("singleton") 代表单例模式

#小结
##xml与注解
- xml更加万能，适用于任何场合，维护简单方便
- 注解 不是自己的类使用不了，维护相对复杂
##xml与注解的最佳实践
- xml用来管理bean
- 注解只负责完成属性的注入
- 我们在使用的过程中，只需要注意一个问题，必须让注解生效就需要开启注解支持，扫描指定的包

#使用Java的方式配置spring
我们现在要完全不使用spring的xml配置了，全权交给Java做

