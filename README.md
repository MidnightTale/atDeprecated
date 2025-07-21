<img src="./public/image/atDeprecated_logo.png" alt="Logo" align="right" width="250">

# atDeprecated

atDeprecated is a fork of [Luminol](https://github.com/LuminolMC/Luminol), which is a fork of [Folia](https://github.com/PaperMC/Folia).
> [!CAUTION]
> This is an **experimental fork**. Features may be unstable, incomplete, or break unexpectedly.  
> **Use at your own risk. Not recommended for production servers.**

## How to Build

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/MidnightTale/atDeprecated.git
    cd atDeprecated
    ```

2.  **Build the project:**
    ```bash
    ./gradlew applyAllPatches && ./gradlew createMojmapPaperclipJar
    ```

3.  **Rebuild Patches (if needed):**
    ```bash
    ./gradlew rebuildAllServerPatches
    ```

4.  **Rebuild API Patches (if needed):**
    ```bash
    ./gradlew rebuildLuminolPatches
    ```
    This will rebuild all `foliaApi`, `luminolApi`, and `paperApi` patches.

    If you only need to rebuild patches for a specific API, you can use one of the following:
    * `./gradlew rebuildFoliaApiPatches`
    * `./gradlew rebuildLuminolApiPatches`
    * `./gradlew rebuildPaperApiPatches`

The final JAR will be located in the `atDeprecated-server\build\libs` directory.
