# JavaFX Starter Project with Gradle and Jlink (Java 11+)

This is a starter project to help Java developers get started with building cross-platform graphical applications.

Simply clone this project and start coding. Adjust parameters like project name, package name and so on.

[![Build Status](https://dev.azure.com/brunoborges-github/javafx-jlink-starter-gradle/_apis/build/status/brunoborges.javafx-jlink-starter-gradle?branchName=master&label=Build)](https://dev.azure.com/brunoborges-github/javafx-jlink-starter-gradle/_build/latest?definitionId=1&branchName=master)

## Building and running

You will need [OpenJDK 11](http://jdk.java.net/11/) (or newer).

```bash
./gradlew dist run
```

## Distribution images

Once you run `gradle dist`, a ZIP file with a specific, optimized JVM for your local platform (Windows, Mac, Linux) will be generated inside `build/distributions`.

## CI/CD for Windows, Mac, and Linux

This project comes with an [Azure Pipelines](https://azure.microsoft.com/en-us/services/devops/pipelines/) setup. It is ready to produce binaries for Windows, Mac, and Linux. Visit the service to set up your account, and [integrate with GitHub](https://medium.com/microsoftazure/build-pipelines-for-github-projects-59dd9229a758).

### Looking for a Maven archetype ?

Check the [maven-javafx-archetype](https://github.com/brunoborges/maven-javafx-archetype) project. No jlink support.

## License

The project is licensed under Apache License. See [LICENSE](https://raw.githubusercontent.com/brunoborges/javafx-jlink-starter-gradle/master/LICENSE) file for the full license.
