# Mixins Example Mod 1.8.9

## Getting started

1. Install [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/?section=windows).
2. Download the source code of this branch as a zip : [mixins](https://github.com/Alexdoru/ExampleMod1.8.9/archive/refs/heads/mixins.zip).
3. Create a folder that will contain your project and extract the contents of the zip in it.
4. In IntelliJ, click **New project from existing sources** and select the `build.gradle` file.
5. *(Optional)* Install the [Minecraft Development](https://plugins.jetbrains.com/plugin/8327-minecraft-development) plugin via `Ctrl+Alt+S > Plugins`, then restart IntelliJ.
6. Set the project SDK to Java 8 via `File > Project Structure` (`Ctrl+Alt+Shift+S`). IntelliJ can download one for you.
7. In the Gradle panel, open `Build Tool Settings > Gradle Settings` (wrench icon) and set **Gradle JVM** to the same Java 8 JDK.
8. Under `Tasks > forgegradle`, run `setupDecompWorkspace`, then restart IntelliJ.

**Common tasks:**
- `forgegradle > runClient` – launch a Minecraft client to test your mod
- `build > build` – compile your mod into a usable `.jar` found into `ExampleMod/build/libs`
- `build > clean` – clear cached build files if you run into issues

## Making it your own

To make the mod your own you need to update these files:

| File                             | Edit                                                                             |
|----------------------------------|----------------------------------------------------------------------------------|
| `gradle.properties`              | Edit all the fields                                                              |
| Package `com.example.examplemod` | Rename via `Shift+F6`                                                            |
| `mixins.examplemod.json`         | Change the name of the file, change the `package` to point to your mixins folder |

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