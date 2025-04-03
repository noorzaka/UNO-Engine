# Uno Game Engine

## Introduction

The **Uno Game Engine** is a modular and extensible framework designed to support various versions and custom rules of the popular Uno card game. This project provides a flexible foundation for developers to create their own variations of Uno while maintaining clean code, object-oriented design, and adherence to SOLID principles.

The engine enables developers to customize the deck, modify card behaviors, and implement unique game rules with minimal effort. By leveraging key design patterns and best coding practices, the Uno Game Engine ensures maintainability, scalability, and ease of extension.

## Objective

The primary objective of this project is to build a **robust and extensible Uno game engine** using Java and Object-Oriented Programming (OOP) principles. The framework allows developers to:
- Extend and customize the game effortlessly.
- Define and implement new card types.
- Modify game rules and flow.
- Ensure flexibility in deck management.
- Support multiple game variations.

## Core Components

- **Cards**: Includes traditional Uno cards and allows for the creation of custom card types with distinct behaviors.
- **Deck**: Manages card distribution, shuffling, and drawing, ensuring flexibility in deck configuration.
- **Game Rules**: Provides a structured way to define and modify game flow, ensuring a smooth gameplay experience.

## Object-Oriented Design

The Uno Game Engine employs several core OOP principles to ensure flexibility, reusability, and maintainability:
- **Encapsulation**: Card and Deck classes encapsulate attributes and behaviors while protecting internal state.
- **Inheritance**: The Card class serves as a base for specific card types (e.g., NumberedCard, SkipCard, WildCard).
- **Polymorphism**: The play method in the Card class is overridden in subclasses, ensuring varied behaviors per card type.
- **Abstraction**: The Game class provides an abstract base for different game variations, defining essential methods while allowing customization.

## Design Patterns

The Uno Game Engine follows key design patterns for better maintainability:
- **Template Method Pattern**: Defines the sequence of game operations in the Game class.
- **Factory Method Pattern**: Used for creating instances of different card types dynamically.
- **Singleton Pattern**: Ensures a single instance of the StandardDeck class for consistent game behavior.

## Clean Code & SOLID Principles

- **Single Responsibility Principle (SRP)**: Each class has a distinct responsibility, such as Card, Deck, and Game.
- **Open/Closed Principle (OCP)**: The system is open for extension (e.g., adding new cards) but closed for modification.
- **Liskov Substitution Principle (LSP)**: Subtypes of Card can be used interchangeably without breaking functionality.
- **Interface Segregation Principle (ISP)**: Avoids large, monolithic interfaces by keeping focused methods.
- **Dependency Inversion Principle (DIP)**: High-level modules depend on abstractions rather than concrete implementations.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 11+
- Git for version control

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/uno-game-engine.git
   ```
2. Navigate to the project directory:
   ```sh
   cd uno-game-engine
   ```
3. Compile and run the game:
   ```sh
   javac -d bin src/*.java
   java -cp bin Main
   ```


## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.



