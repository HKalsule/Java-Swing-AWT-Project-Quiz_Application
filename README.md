# 🧾 Java Swing Quiz Login System – Simple Minds 🧠

This project is a Java Swing-based **Login and Rules Interface** for a quiz application named **Simple Minds**. It includes full GUI integration for user name input, navigation buttons, and a rules display window, all built using `JFrame`, `JLabel`, `JTextField`, and `JButton`.

---

## ✅ Project Status: Functional and Working

> 🟢 The application now supports navigation between Login and Rules screens. The **"Rules"** button passes the entered name to the next screen. The **"Back"** button returns to the Login screen.

---

## ✨ Features

- 📋 **Login Interface**
  - Graphical UI with background image
  - Text input for user name
  - Buttons: **Rules**, **Back**
  - Custom fonts and layout
  
- 📜 **Rules Interface**
  - Displays 10 quiz instructions
  - Personalized greeting with user’s name
  - Buttons: **Start**, **Back**

---

## 🖼️ Interface Layout

### 🔐 Login Screen (`Login.java`)
| UI Element         | Description                               |
|--------------------|-------------------------------------------|
| `ImageIcon`        | Displays `img1.jpg` on the left            |
| `JLabel` Heading   | "Simple Minds" title                      |
| `JTextField`       | Enter your name                           |
| `JButton` Rules    | Proceeds to the rules screen              |
| `JButton` Back     | Closes or hides the login screen          |

### 📘 Rules Screen (`Rules.java`)
| UI Element         | Description                               |
|--------------------|-------------------------------------------|
| `JLabel` Heading   | Greets user with name                     |
| `JLabel` Body      | Shows 10 instructions (HTML formatted)    |
| `JButton` Start    | Placeholder for quiz start (to be linked) |
| `JButton` Back     | Returns to login screen                   |

---

## 📂 File Overview

| File         | Description                        |
|--------------|------------------------------------|
| `Login.java` | Main login screen                  |
| `Rules.java` | Shows rules with back/start flow   |
| `img1.jpg`   | Image for the left pane in Login   |

---

## 🧱 Components Used

| Swing Component | Purpose                                  |
|------------------|------------------------------------------|
| `JFrame`         | Main window container                    |
| `JLabel`         | Text/image display                       |
| `JTextField`     | Accepts user name                        |
| `JButton`        | Interactive buttons                      |
| `ImageIcon`      | Load image for GUI                       |
| `Font`           | Custom fonts for headings/texts          |
| `Color`          | Background color settings                |
| `ActionListener` | Enables button interactivity             |

---

## 🚀 How to Run

1. Ensure JDK is installed and set up in PATH.
2. Place `Login.java`, `Rules.java`, and `img1.jpg` in the same folder.
3. Compile both Java files:
   ```bash
   javac Login.java Rules.java
