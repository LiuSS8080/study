### 1、stream的基本应用

- 集合过滤条件

```java
list.stream().filter(ShortVideo :: isIllegal).collect(Collectors.toList())
```

- 求集合中各个对象的某个属性的和

```java
list.stream().mapToInt(ShortVideo :: getTotal).sum()
```

- 集合按对象的某个属性分组

```java
Map<String, List<ShortVideo>> collect = list.stream().collect(Collectors.groupingBy(ShortVideo::getAreaName))
```

### 2 、optional  

用来解决空指针的问题

```java
Optional<ShortVideo> first = list.stream().filter(ShortVideo::isIllegal).findFirst();

first.isPresent(); // 是否为空
first.get();       // 获得值
```

