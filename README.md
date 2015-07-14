# worldengine-java

This library permits to open world generated using [WorldEngine](https://github.com/Mindwerks/worldengine), an open-source World generator. Worlds have to be saved in protocol buffer format (option `-b`).

Using this library is very simple. Include the jar (it is not currently available on Maven) and load a World file like this:

```java
WorldFile.World worldFile = WorldFileLoader.fromInputStream(is);
```
