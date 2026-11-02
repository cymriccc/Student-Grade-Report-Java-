# Student Grade Report Generator in Java

[![Java Version](https://img.shields.io/badge/Java-11%2B-007396?style=flat-square&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)](LICENSE)
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-brightgreen.svg?style=flat-square)](https://github.com/cymriccc/Student-Grade-Report-Java-/graphs/commit-activity)

An object-oriented CLI utility written in Java designed to process, aggregate, and generate structured academic performance reports for students.

---

## Overview

`Student-Grade-Report-Java-` demonstrates clean object-oriented design patterns (OOP) in Java to manage student records, compute GPA/weighted grade averages, and output formatted academic summary reports directly to the console.

---

## Key Features

* **Object-Oriented Architecture**: Encapsulates student data, subject scores, and report generation into clean, maintainable Java classes.
* **Automated Grade Calculation**: Computes weighted cumulative averages and maps numeric scores to academic letter grades.
* **Console Table Rendering**: Outputs formatted textual summaries and performance breakdowns.
* **Defensive Input Handling**: Prevents application crashes from invalid numeric or out-of-range user inputs.

---

## Repository Structure

```text
Student-Grade-Report-Java-/
├── src/
│   └── Main.java       # Application entry point & report orchestration
├── README.md           # Technical documentation
└── .gitignore          # Java build artifact exclusions (.class, target/)
```

---

## Getting Started

### Prerequisites

* **Java Development Kit (JDK) 11 or higher** installed.

### Build & Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/cymriccc/Student-Grade-Report-Java-.git
   cd Student-Grade-Report-Java-
   ```

2. **Compile the Java source code:**
   ```bash
   javac src/Main.java -d bin/
   ```

3. **Execute the application:**
   ```bash
   java -cp bin Main
   ```

---

## Usage Example

```text
=====================================================
               STUDENT GRADE REPORT                  
=====================================================
Student Name : Carlo Dingle
Student ID   : STU-2026-001
-----------------------------------------------------
Subject                Score    Grade
-----------------------------------------------------
Data Structures        92.0     A
Computer Networks      88.5     B+
Software Engineering   95.0     A
-----------------------------------------------------
Overall Average : 91.83%
Academic Status : PASSED (Honors)
=====================================================
```

---

## License

Distributed under the **MIT License**. See `LICENSE` for more information.

---

**Author**: [@cymriccc](https://github.com/cymriccc)
