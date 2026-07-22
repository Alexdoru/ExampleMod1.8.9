# Example Mod 1.8.9

An example mod for Minecraft Forge 1.8.9, based on the official [Forge Mod Development Kit](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.8.9.html).

This example mod comes in 3 flavors, each in a separate branch, change branch to see the other examples :

| Branch                                                                  | Description                                                |
|-------------------------------------------------------------------------|------------------------------------------------------------|
| [master](https://github.com/Alexdoru/ExampleMod1.8.9/tree/master)       | a basic example mod                                        |
| [mixins](https://github.com/Alexdoru/ExampleMod1.8.9/tree/mixins)       | an example mod with mixins ready                           |
| [mwe-addon](https://github.com/Alexdoru/ExampleMod1.8.9/tree/mwe-addon) | an addon for my mod [MWE](https://github.com/Alexdoru/MWE) |

## Getting started

1. Install [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/?section=windows).
2. In IntelliJ, click **Get from VCS** and paste this repo's URL: `https://github.com/Alexdoru/ExampleMod1.8.9.git`.
3. *(Optional)* Install the [Minecraft Development](https://plugins.jetbrains.com/plugin/8327-minecraft-development) plugin via `Ctrl+Alt+S > Plugins`, then restart IntelliJ.
4. Set the project SDK to Java 8 via `File > Project Structure` (`Ctrl+Alt+Shift+S`). IntelliJ can download one for you.
5. In the Gradle panel, open `Build Tool Settings > Gradle Settings` (wrench icon) and set **Gradle JVM** to the same Java 8 JDK.
6. Under `Tasks > forgegradle`, run `setupDecompWorkspace`, then restart IntelliJ.

**Common tasks:**
- `forgegradle > runClient` – launch a Minecraft client to test your mod
- `build > build` – compile your mod into a usable `.jar` found into `ExampleMod/build/libs`
- `build > clean` – clear cached build files if you run into issues

## Making it your own

To make the mod your own you need to update these files:

| File                             | Edit                          |
|----------------------------------|-------------------------------|
| `gradle.properties`              | Edit all the fields           |
| Package `com.example.examplemod` | Rename via `Shift+F6`         |

The `modid` should never change, it is used as a unique identifier by forge.

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