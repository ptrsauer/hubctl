# Ein Tool zum Auslesen von GitHub-Issues

## Prerequisites
GraalVM 19.3.0 mit Java 11 Support

Native-Image für GraalVM installieren:
```shell script
$ gu install native-image
```

## Build
```shell script
$ mvn package
```

```shell script
$ ls -lha target
-> 8,7M 18 Nov 23:36 hubctl
```

## Run
```shell script
$ ./target/hubctl
```

## Help
```shell script
$ ./target/hubctl --help
```