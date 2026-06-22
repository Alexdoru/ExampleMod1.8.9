# MWE Addon Mod

This is an example for making an addon mod for MWE.

## How to get started
- Download this project [as a zip](https://github.com/Alexdoru/ExampleMod1.8.9/archive/refs/heads/mwe-addon.zip) by clicking the `<> Code` button and `Download Zip`
- Unzip the project in a directory of your liking
- Open your code editor and create a `new project from existing sources`
- Download the latest version of MWE from the [release page](https://github.com/Alexdoru/MWE/releases)
- Create a `libs` folder and place the `MWE.jar` inside
- In the `build.gradle` under `dependencies` replace with the actual name of the MWE jar file
- In the code editor, top left click `File>Project Structure` or do `Ctrl+Alt+Maj+s` and set the project SDK to a java version 8 JDK, Intellij should give you the option to download one
- Open the gradle window on the right, click the wrench to open the `Build Tool Settings>Gradle settings` and set the `Gradle JVM` to the same java 8 JDK you used above
- In the gradle window under `Tasks>forgegradle` run the `setupDecompWorkspace` task, once it is done restart Intellij
- Running the task `Tasks>forgegradle>runClient` will start a minecraft client to test your mod
- Running the task `Tasks>build>build` will compile your addon into a usable `.jar` file that will be found in the folder `ExampleMod>build>libs`
- Running the task `Tasks>build>clean` will clean a bunch of cached files allowing you to make a clean build afterward in case you have issues building


The source code of you mod is found under `src>main>java`. To make the addon your own, you need to edit the following files :
- in the package explorer select the package `com.exampleaddon` hit `Shift+F6` to rename it, it should a unique name, if two addons have the same names it won't work properly
- in `build.gradle` complete the TODO
- in `AddonBoostrap` complete the TODO
- in `ExampleAddon` you can start coding like a normal mod

### To be sure your addon will be compatible with any future version of MWE, you should only use classes from the [mwe/api](https://github.com/Alexdoru/MWE/tree/master/src/main/java/fr/alexdoru/mwe/api) and [configlib/api](https://github.com/Alexdoru/MWE/tree/master/src/configlib/java/fr/alexdoru/configlib/api)

