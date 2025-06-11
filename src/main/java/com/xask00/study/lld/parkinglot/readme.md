Here’s a **Low-Level Design (LLD)** challenge for today—perfect for showcasing your ability to model classes, apply design patterns, and think in an object-oriented way.

---

## 🚗 **Design a Parking Lot System**

### 🎯 **Problem Statement**

Design a parking lot with multiple floors, each containing multiple parking spots. Support functionality to:

* **Park** and **unpark** vehicles (cars, bikes, trucks).
* **Search** for a parked vehicle by registration number.
* **Query** the count of free spots by vehicle type on each floor.

### 💡 **Why It Matters**

* Commonly asked in interviews ([github.com][1], [medium.com][2])
* Demonstrates class modeling, inheritance (vehicle types), composition (floors and spots), and use of design patterns.
* Great chance to showcase best practices like SOLID principles, Strategy pattern, and clean architecture.

---

## 🔧 **Today's Task Breakdown**

| Step                              | Task                                                                                                                                                                               |
| --------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **1. Clarify Requirements**       | Multi-floor lot, multiple vehicle types, ability to track by license plate, count empty spots.                                                                                     |
| **2. Identify Major Classes**     | `ParkingLot`, `ParkingFloor`, `ParkingSpot`, `Vehicle`, `ParkingStrategy` (for spot assignment).                                                                                   |
| **3. Define Relationships**       | Composition: lot contains floors, floors contain spots; spot can hold a vehicle.                                                                                                   |
| **4. Choose Design Patterns**     | - **Strategy** for algorithms like nearest spot or even distribution.<br> - **Factory** for creating vehicles or spots.<br> - Optional: **Observer** to notify when floor is full. |
| **5. Specify Key APIs**           | - `parkVehicle(Vehicle v) → SlotID or failure`<br> - `unparkVehicle(String plateNumber)`<br> - `getAvailableSpots(VehicleType type, int floor)`                                    |
| **6. Detail Internal Mechanisms** | - **Mapping** from license plate to spot.<br> - **Spot allocation** via queue or priority per floor.<br> - **Type-based tracking** using counters or maps.                         |
| **7. Add Edge Cases**             | Lot full, invalid unpark, resetting state, concurrent parking if going multi-threaded.                                                                                             |
| **8. Extend & Optimize**          | - Add vehicle hourly fees.<br> - Implement **thread-safe** operations.<br> - Use **Factory Method** for spot types (compact, large, EV).                                           |

---

## 🧠 **Bonus: Pattern & Principles Checklist**

* **Single Responsibility**: Each class handles a specific concern.
* **Open/Closed**: New vehicle types or parking rules added without modifying existing code.
* **Strategy Pattern**: Define different `ParkingStrategy` implementations to place vehicles.
* **Factory Pattern**: Use a `VehicleFactory` or `SpotFactory` to encapsulate object creation.

---

## ✅ **What You Should Produce Today**

1. **UML Class Diagram**: Showing classes, their relationships, and major methods.
2. **Core Code Skeleton**: Interfaces and class stubs with key methods.
3. **Sample Implementation**: One strategy (e.g., nearest available spot), with parking/unparking support.
4. **Test Scenarios**: Use-cases such as parking, unparking, querying available slots.
5. **Write-Up**: Explain design choices, applied patterns, and any assumptions or trade-offs.

---

This exercise perfectly hits the mark for LLD interviews—complex enough to demonstrate your software architecture skills yet manageable to complete in one session. When you're done, I’d be glad to review your UML diagram, code structure, or discuss possible extensions!

[1]: https://github.com/topics/low-level-design-problems?utm_source=chatgpt.com "low-level-design-problems · GitHub Topics"
[2]: https://medium.com/%40prashant558908/solving-top-10-low-level-design-lld-interview-questions-in-2024-302b6177c869?utm_source=chatgpt.com "Solving Top 10 Low Level Design (LLD) Interview Questions - Medium"
