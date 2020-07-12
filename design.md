# Kernel Display Design

## Functional Requirements

### 3D View

- The 3D view must display the current state of the robot.
- The 3D view must support displaying CSGs returned from scripts.

### Data Logging

- The user may select data sources to display from a list of available data sources.
  - The user must select how to display a data source (e.g., line chart, 3D view, video feed).
  - Multiple data sources of compatible types (e.g., two number series) may be added to the same display (e.g., two number series on the same line chart).
- Data source displays are organized in a grid. The user may drag-and-drop individual displays to organize them.

### Settings

- The user must be able to open a modal settings window to configure various kernel display settings.

## Non-Functional Requirements

### Open Source

- All core components and their dependencies must be open-source under a compatible license. Some optional, non-core components may have closed-source dependencies.

### Portability

- x86_64 Windows, macOS, and Linux must be supported.
