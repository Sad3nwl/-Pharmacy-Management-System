# 🏥 Pharmacy Management System

##    Project Overview

This project is a Java-based application designed to manage a pharmacy's inventory of medications and process patient prescriptions.
It utilizes object-oriented programming to dynamically track different types of medicine.

The project includes:
- Encapsulated Medication Data.
- Dynamic Inventory Tracking.
- Patient Prescription Mapping.
- Abstract and Polymorphic Data Structures.
- Console User Interface .

---

## 📝 Description

The **Pharmacy Management System** is a command-line application built to streamline how small-scale pharmacies manage their active medical stock and match treatments with inbound patients. 

At its core, the program handles data modeling for standard health items like **Tablets** and **Syrups** by using inheritance from a single, foundational `Medication` template..
This ensures that every entry maintains consistent properties like unique naming, custom dosages, price listings, and live stock counts.
The system also acts as a safeguard; it includes validation logic that alerts the operator immediately if an unavailable medication quantity is entered during stock management.
When a patient visits the pharmacy, the user can create a dynamic digital `Prescription` file right from the console terminal.
Multiple medical items can then be assigned directly to that specific patient record.
Finally, the central `Pharmacy` hub processes these records, offering simple print utilities to review overall store inventory or verify outstanding patient scripts in a structured, readable layout .

---
 languge used:
- Java (JDK 8+) 
---

# 📂 Project Structure

The project repository consists of the following source files within the `sadoo` package 
- `Medication.java` — Abstract base template for all medicine records .
- `Tablet.java` — Specific subclass representing tablet-form medicines .
- `Syrup.java` — Specific subclass representing syrup-form medicines .
- `Prescription.java` — Manages a list of medications prescribed to a specific patient .
- `Pharmacy.java` — Coordinates global inventory lists and records issued prescriptions.
- `Sadoo.java` — Main program class handling user inputs and application runtime execution .


---

# 📊 Object-Oriented Programming Concepts Used

- **Abstraction:** Implemented via abstract class structures and abstract display behaviors 
- **Inheritance:** Extends core medication characteristics down to tailored forms.
- **Polymorphism:** Method overriding used to present custom data details per form type.
- **Encapsulation:** Protects data state integrity using strict access controls and validation methods.

--- 
