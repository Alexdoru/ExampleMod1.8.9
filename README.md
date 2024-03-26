# Example Mod 1.8.9

This is an example mod for minecraft forge 1.8.9 to create your first mod. It is directly taken from the official [forge mod development kit](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.8.9.html).

## How to get started
- Install the code editor [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/?section=windows)
- Start IntelliJ, click `get from VCS` and paste the git URL of this repository : https://github.com/Alexdoru/ExampleMod1.8.9.git and create a new project from that
- (Optional) Open settings `Ctrl+Alt+S`, search `Plugins` and in the plugins marketplace search and install the [Minecraft Development](https://plugins.jetbrains.com/plugin/8327-minecraft-development) plugin, restart IntelliJ to complete installation
- Once you are in the code editor, top left click `File>Project Structure` or do `Ctrl+Alt+Maj+s` and set the project SDK to a java version 8 JDK, Intellij should give you the option to download one
- Open the gradle window on the right, click the wrench to open the `Build Tool Settings>Gradle settings` and set the `Gradle JVM` to the same java 8 JDK you used above
- In the gradle window under `Tasks>forgegradle` run the `setupDecompWorkspace` task, once it is done restart Intellij
- Running the task `Tasks>forgegradle>runClient` will start a minecraft client to test your mod
- Running the task `Tasks>build>build` will compile your mod into a usable `.jar` file that will be found in the folder `ExampleMod>build>libs`
- Running the task `Tasks>build>clean` will clean a bunch of cached files allowing you to make a clean build afterward in case you have issues building

Congratulations! You built your first mod!

The source code of you mod in found under `src>java`. To make the mod your own, you need to edit the following files :
- in `ExampleMod.java` edit the `MODID`, `MODNAME`, `VERSION`
- in `build.gradle` edit the `version`, `group`, and `archivesBaseName`
- in `mcmod.info` edit `"modid"`, `"name"`, but don't touch `"version"` and `"mcversion"`
- in the package explorer select the package `com.example.examplemod` hit `Shift+F6` to rename it

The `modid` and `modname` should be the same in all these files. I added a bunch of comments in all the files to guide you

Have fun!

### Useful IntelliJ keybinds

- `Shift + Shift` open the search everything box
- `Ctrl+N` open search box to browse java files
- `Alt+Enter` Shows code suggestions/fixes on the selected element
- `Ctrl+Shift+F` open search box to search text in all the files
- `Ctrl+Alt+S` open IntelliJ settings
- `Ctrl+Click` or `Ctrl+B` to navigate to declaration of selected element
- `Alt+F7` search usages of the selected element
- `Shift+F6` rename the selected element
- `Ctrl+Alt+L` Reformat the code of the current file according to your code formatting settings
- `Ctrl+Alt+O` reorganizes imports statements of your current java file
- `Ctrl+/` comment/uncomment to selected line(s) of code
- `Alt+Inser` show suggestions of code generation