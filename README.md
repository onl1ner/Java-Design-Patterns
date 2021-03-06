# Java Design Patterns

Creational design patterns implementation: `Singleton`, `Factory Method`, `Builder` written in Java.

## Getting Started

No additional steps required. Just compile and run the project.

## Folder Structure

The workspace structure is:

```bash
├── README.md
└── src
    ├── App.java                           # entry point of an application
    └── patterns                           # the folder to maintain all patterns
        ├── builder                        # builder pattern implementation folder
        │   ├── HouseBuilder.java
        │   ├── HouseType.java
        │   ├── IBuilder.java
        │   ├── director
        │   │   └── HouseDirector.java
        │   └── product
        │       └── House.java
        ├── factorymethod                  # factory method pattern implementation folder
        │   ├── creators
        │   │   ├── Factory.java
        │   │   ├── ShipFactory.java
        │   │   └── TruckFactory.java
        │   └── products
        │       ├── ITransport.java
        │       ├── Ship.java
        │       └── Truck.java
        └── singleton                      # singleton pattern implementation folder
            └── Database.java
```

## Author

Tamerlan Satualdypov. Group: SE-2018