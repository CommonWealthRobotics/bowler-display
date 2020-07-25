# Kernel Display Design

## Functional Requirements

### gRPC Server

#### 3D View Operations

- ! RFC: This design requires that the headless kernel can generate the CAD. Did we ever split JavaFX off of JCSG so that it can run headlessly?
- Set the 3D data using a list of CSGs.
  - Each CSG has a unique ID. ! RFC: I'm not sure if CSGs have unique IDs yet. We may need to add this to JCSG.
- Update the frame transform of a CSG.

#### Data Logging Operations

- Add a data source using its ID, name, and type.
  - Once added, the user can see the data source in the data logging window.
  - ! RFC: How do we handle data sources of different types? Do we need a bunch of different gRPC calls?
- Remove a data source using its ID.
- Add data to a data source using its ID and a list of data points.
  - Use a list of data points here instead of forcing a single data point because data may come in to the kernel faster than we can send it to the display if we send each point separately. Sending a list of data points allows the kernel to buffer data more effectively.
  - ! RFC: How much room for compression do we have here?

### 3D View

- The 3D view must display the current state of the robot.
- The 3D view must support displaying CSGs returned from scripts.

### Data Logging

- The user may select data sources to display from a list of available data sources.
  - The user must select how to display a data source (e.g., line chart, 3D view, video feed).
  - Multiple data sources of compatible types (e.g., two number series) may be added to the same display (e.g., two number series on the same line chart).
- Data source displays are organized in a grid. The user may drag-and-drop individual displays to organize them.
- Data that has been logged must be able to be saved and exported to other formats (e.g., CSV) if the data type supports it (e.g., when exporting to a CSV you can export numerical data but not images or frame transforms).
- The number of data points to buffer per-data-source-type must be configurable via the settings.
  - E.g. 10k numerical data points
  - E.g. 1k frame transforms
  - E.g. 100 images

#### Plotting Methods

- Most of the plots types can be handled using [ChartFX](https://github.com/GSI-CS-CO/chart-fx).
- Use a 3D view to display a labeled cube to visualize frame transforms.
- Use the built-in `MediaPlayer` for video.

### Settings

- The user must be able to open a modal settings window to configure various kernel display settings.

## Non-Functional Requirements

### Open Source

- All core components and their dependencies must be open-source under a compatible license. Some optional, non-core components may have closed-source dependencies.

### Portability

- x86_64 Windows, macOS, and Linux must be supported.
