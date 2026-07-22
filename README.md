# MWE Addon Mod

## Why make an addon ?

If you want to add stuff to MWE consider making an addon using this template instead of modifying MWE directly.
By making an addon mod, users can install latest version of official MWE and multiple addons of their liking.
Whereas if you modify MWE and distribute it, users are stuck with your modified MWE at whatever version it was made.
So they can't install latest version of MWE, and they can't install other modified MWE that have different features.

If you are a developer and need more things exposed in the MWE api let me know.

## Getting started

1. Install [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/?section=windows).
2. Download the source code of this branch as a zip : [mwe-addon](https://github.com/Alexdoru/ExampleMod1.8.9/archive/refs/heads/mwe-addon.zip).
3. Create a folder that will contain your project and extract the contents of the zip in it.
4. In IntelliJ, click **New project from existing sources** and select the `build.gradle` file.
5. *(Optional)* Install the [Minecraft Development](https://plugins.jetbrains.com/plugin/8327-minecraft-development) plugin via `Ctrl+Alt+S > Plugins`, then restart IntelliJ.
6. Set the project SDK to Java 8 via `File > Project Structure` (`Ctrl+Alt+Shift+S`). IntelliJ can download one for you.
7. In the Gradle panel, open `Build Tool Settings > Gradle Settings` (wrench icon) and set **Gradle JVM** to the same Java 8 JDK.
8. Download the latest version of MWE from the [release page](https://github.com/Alexdoru/MWE/releases)
9. Create a `libs` folder and place the `MWE.jar` inside
10. In the `build.gradle` under `dependencies` replace with the actual name of the MWE jar file
11. Under `Tasks > forgegradle`, run `setupDecompWorkspace`, then restart IntelliJ.

**Common tasks:**
- `forgegradle > runClient` – launch a Minecraft client to test your mod
- `build > build` – compile your mod into a usable `.jar` found into `ExampleMod/build/libs`
- `build > clean` – clear cached build files if you run into issues

## Making it your own

To make the addon your own you need to update these files:

| File                             | Edit                  |
|----------------------------------|-----------------------|
| `gradle.properties`              | Edit all the fields   |
| Package `com.example.examplemod` | Rename via `Shift+F6` |
| `ExampleAddon`, `AddonBootstrap` | Complete TODO         |

### To be sure your addon will be compatible with any future version of MWE, you should only use classes from the [mwe/api](https://github.com/Alexdoru/MWE/tree/master/src/main/java/fr/alexdoru/mwe/api) and [configlib/api](https://github.com/Alexdoru/MWE/tree/master/src/configlib/java/fr/alexdoru/configlib/api)

## Useful IntelliJ keybinds

| Keybind | Action |
|---|---|
| `Shift Shift` | Search everything |
| `Ctrl+N` | Search Java files |
| `Ctrl+Shift+F` | Search text in all files |
| `Ctrl+Click` / `Ctrl+B` | Go to declaration |
| `Alt+Enter` | Show fixes/suggestions |
| `Alt+F7` | Find usages |
| `Shift+F6` | Rename element |
| `Ctrl+Alt+L` | Reformat code |
| `Ctrl+Alt+O` | Optimize imports |
| `Ctrl+/` | Toggle comment |
| `Alt+Insert` | Generate code |
| `Ctrl+Alt+S` | Open settings |