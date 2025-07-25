<img src="./public/image/atDeprecated_logo.png" alt="Logo" align="right" width="250">

# atDeprecated

atDeprecated is an experimental Minecraft server software fork based on [Luminol](https://github.com/LuminolMC/Luminol), which itself is a fork of [Folia](https://github.com/PaperMC/Folia).

> [!CAUTION]
> This is an **experimental fork**. Features may be unstable, incomplete, or break unexpectedly.  
> **Use at your own risk. Not recommended for production servers.**

## About

atDeprecated is a fun version of Luminol:

### Features
- Configurable beacon ranges
- Customizable inventory sizes (barrels and ender chests: 1-6 rows)
- Configurable anvil max repair costs
- Death loot configuration system
- Insomnia toggle commands
- Enhanced boat spawning controls
- Elytra boost leash check configuration

## Requirements

- **Java 21** or higher
- **Git** for cloning the repository

## How to Build

### Quick Build

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/MidnightTale/atDeprecated.git
    cd atDeprecated
    ```

2.  **Build the project:**
    ```bash
    ./gradlew applyAllPatches && ./gradlew createMojmapPaperclipJar
    ```

The final JAR will be located in the `atdeprecated-server\build\libs` directory.