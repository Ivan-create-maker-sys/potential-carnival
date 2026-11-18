# Bedrock UI

Client-side Fabric mod project for Minecraft Java Edition 26.3.

## Current status

This archive is the **initial development scaffold**, not a finished playable mod.
It contains the Fabric project structure, metadata, language files and a GitHub
Actions build workflow. The UI features listed below are planned and will be
implemented and tested incrementally.

## Target features

- Creative inventory: creative catalog and category/search area on the **left**,
  player inventory on the **right**.
- Inventory: optional Bedrock-style two-click swap mode, with normal Java
  cursor/drag behavior retained as a selectable alternative.
- Item tooltip: show the held item's name, count, durability, enchantments,
  effects and available modded tooltip lines near the cursor; keep it on-screen.
- Chat: clickable history navigation, completion and cursor movement controls.
- Controls panel: display available actions and key combinations.
- Settings: independent toggles, tooltip scale/transparency/offset, inventory
  interaction mode and UI scale.
- Russian and English localization.
- Compatibility goal: JEI and common container screens, subject to testing.

## Build

The project targets Java 25 and the Fabric toolchain for Minecraft 26.3.
The versions are set in `gradle.properties` and follow the official Fabric
development page at the time this project scaffold was prepared.

A Gradle 9.6 installation and JDK 25 are required. From the project root run:

```bash
gradle build
```

The resulting mod jar will be in `build/libs/` (choose the jar without a
`-sources` suffix).

## GitHub Actions

After the project files are uploaded to the repository, the workflow
`.github/workflows/build.yml` builds the project on each push. Open the
repository's **Actions** tab, select the latest successful workflow run, and
download the `bedrock-ui-build` artifact.

## Important

- This is a client-side mod project; it is not intended to require installation
  on a multiplayer server.
- Do not test experimental builds on your only copy of a world. Make a backup.
- JEI compatibility and support for third-party container screens must be
  tested separately; they are not guaranteed by this starter scaffold.
