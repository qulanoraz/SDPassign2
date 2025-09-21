## Assignment Report: Device Factory Design

### Overview
This project demonstrates the use of both the **Abstract Factory** and **Factory Method** design patterns in Java to create families of related device objects (keyboards, mice, headphones) for different user scenarios (Gaming and Office).

### Design Patterns Used
- **Abstract Factory:**
  - The `DeviceFactory` interface defines methods for creating abstract products: `createKeyboard()`, `createMouse()`, and `createHeadphones()`.
  - Concrete factories (`GamingDeviceFactory`, `OfficeDeviceFactory`) implement this interface and produce families of related devices, ensuring that all products in a set are compatible and share a common theme.[2][4][6]
- **Factory Method:**
  - Inside each concrete factory, the creation of each product is delegated to a protected factory method (e.g., `createGamingMouse()`), which can be overridden or extended for more flexible instantiation logic. This allows for easy addition of new device variants or customization of creation steps within a family.

### Implementation Details
- **Product Interfaces:**
  - `Keyboard`, `Mouse`, and `Headphones` interfaces define common methods (e.g., `getDescription()`, `getColor()`, etc.) for all device types.
- **Concrete Products:**
  - Each device family (Gaming, Office) has its own concrete implementations (e.g., `GamingMouse`, `OfficeKeyboard`), each with specific characteristics (such as color, wireless, backlight, DPI, etc.).
- **Factories:**
  - `GamingDeviceFactory` and `OfficeDeviceFactory` implement the `DeviceFactory` interface and use internal factory methods to instantiate the correct product variants.
- **Client Code:**
  - The main class demonstrates how to use the factories to create device sets for different scenarios, working only with abstract interfaces and not depending on concrete classes.

### Benefits
- **Extensibility:** New device families or product types can be added with minimal changes to existing code.
- **Separation of Concerns:** Client code is decoupled from concrete implementations, relying only on abstract interfaces.
- **Code Reuse:** Common logic for device descriptions and characteristics can be centralized in abstract base classes, reducing duplication.

### Conclusion
This project successfully applies both Abstract Factory and Factory Method patterns to organize the creation of related device objects, making the codebase flexible, maintainable, and easy to extend for future requirements.
