# MWE Addon Mod

This is an example for making an addon mod for MWE.

## Why make an addon ?

If you want to add stuff to MWE consider making an addon using this template instead of modifying MWE directly.
By making an addon mod, users can install latest version of official MWE and multiple addons of their liking.
Whereas if you modify MWE and distribute it, users are stuck with your modified MWE at whatever version it was made.
So they can't install latest version of MWE, and they can't install other modified MWE that have different features.

If you are a developer and need more things exposed in the MWE api let me know.

## How to get started
1. Download this project [as a zip](https://github.com/Alexdoru/ExampleMod1.8.9/archive/refs/heads/mwe-addon.zip) by clicking the `<> Code` button and `Download Zip`
2. Unzip the project in a directory of your liking
3. Open your code editor and create a `new project from existing sources`
4. Download the latest version of MWE from the [release page](https://github.com/Alexdoru/MWE/releases)
5. Create a `libs` folder and place the `MWE.jar` inside
6. In the `build.gradle` under `dependencies` replace with the actual name of the MWE jar file
7. In the code editor, top left click `File>Project Structure` or do `Ctrl+Alt+Maj+s` and set the project SDK to a java version 8 JDK, Intellij should give you the option to download one
8. Open the gradle window on the right, click the wrench to open the `Build Tool Settings>Gradle settings` and set the `Gradle JVM` to the same java 8 JDK you used above
9. In the gradle window under `Tasks>forgegradle` run the `setupDecompWorkspace` task, once it is done restart Intellij

**Common tasks:**
- `forgegradle > runClient` – launch a Minecraft client to test your mod
- `build > build` – compile a `.jar` into `ExampleMod/build/libs`
- `build > clean` – clear cached build files if you run into issues


The source code of you mod is found under `src>main>java`. To make the addon your own, you need to edit the following files :
1. in the package explorer select the package `com.exampleaddon` hit `Shift+F6` to rename it, it should a unique name, if two addons have the same names it won't work properly
2. in `build.gradle` complete the TODO
3. in `AddonBoostrap` complete the TODO
4. in `ExampleAddon` you can start coding like a normal mod

### To be sure your addon will be compatible with any future version of MWE, you should only use classes from the [mwe/api](https://github.com/Alexdoru/MWE/tree/master/src/main/java/fr/alexdoru/mwe/api) and [configlib/api](https://github.com/Alexdoru/MWE/tree/master/src/configlib/java/fr/alexdoru/configlib/api)

