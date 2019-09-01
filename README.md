# JavaFX Starter Project with Gradle and Jlink (Java 11+)

This is a starter project to help Java developers get started with building cross-platform graphical applications using JavaFX and Java 11 modules.

Simply clone this project and start coding. Adjust parameters like project name, package name and so on.

[![Build Status](https://dev.azure.com/brunoborges-github/javafx-jlink-starter-gradle/_apis/build/status/brunoborges.javafx-jlink-starter-gradle?branchName=master&label=Build)](https://dev.azure.com/brunoborges-github/javafx-jlink-starter-gradle/_build/latest?definitionId=1&branchName=master)

## Building and running

You will need [OpenJDK 11](http://jdk.java.net/11/) (or newer).

```bash
./gradlew dist run
```

## Adding modules and dependencies

You can add modules and dependencies using Gradle. Here's an example with icon packs from [Ikonli](https://aalmiray.github.io/ikonli/) project, by [Andres Almiray](http://andresalmiray.com/).

1. Clone this repository.
1. Add `ikonli-javafx` and an icon pack as dependencies.

    ```
    repositories {
        jcenter()
    }
    dependencies {
         implementation 'org.kordamp.ikonli:ikonli-javafx:11.1.0'
         implementation 'org.kordamp.ikonli:ikonli-fontawesome-pack:11.1.0'
    }
    ```

1. Modify `module-info.java` to require ikonli modules.

    ```
    module fxapp {
        ...
        // add icon pack modules
        requires org.kordamp.iconli.core;
        requires org.kordamp.ikonli.javafx;
        requires org.kordamp.ikonli.fontawesome;
    }
    ```

1. Invoke the `dist` target.
1. Run the generated image.

## Distribution images

Once you run `gradle dist`, a ZIP file with a specific, optimized JVM for your local platform (Windows, Mac, Linux) will be generated inside `build/distributions`.

## CI/CD for Windows, Mac, and Linux

This project comes with an [Azure Pipelines](https://azure.microsoft.com/en-us/services/devops/pipelines/) setup. It is ready to produce binaries for Windows, Mac, and Linux. Visit the service to set up your account, and [integrate with GitHub](https://medium.com/microsoftazure/build-pipelines-for-github-projects-59dd9229a758).

### Looking for a Maven archetype ?

Check the [maven-javafx-archetype](https://github.com/brunoborges/maven-javafx-archetype) project. No jlink support.

## License

The project is licensed under Apache License. See [LICENSE](https://raw.githubusercontent.com/brunoborges/javafx-jlink-starter-gradle/master/LICENSE) file for the full license.
