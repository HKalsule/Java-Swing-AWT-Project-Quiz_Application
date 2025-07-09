# 🧾 Java Swing Quiz Login System – Simple Minds 🧠

This project is a Java Swing-based **Login, Rules, and Quiz Interface** for a quiz application named **Simple Minds**. It includes full GUI integration for user input, quiz rules, and a dynamic quiz panel, all built using `JFrame`, `JLabel`, `JTextField`, and `JButton`.

---

## ✅ Project Status: Functional and Working

> 🟢 The application now supports:
> - Navigation between **Login** and **Rules** screens.
> - Personalized quiz rules.
> - Quiz Interface with 10 dynamic questions, options, and timer.

---

## ✨ Features

- 🔐 **Login Interface**
  - Graphical UI with background image
  - Text input for user name
  - Buttons: **Rules**, **Back**

- 📜 **Rules Interface**
  - Displays 10 quiz instructions
  - Personalized greeting with user’s name
  - Buttons: **Start**, **Back**

- 🧠 **Quiz Interface**
  - 10 Multiple-choice questions
  - 4 options per question (radio buttons)
  - Dynamic navigation buttons (`Next`, `Submit`, `50-50`)
  - Visual countdown timer per question using `paint()` method
  - Auto-switch to next question after timeout
  - Tracks user-selected answers with `ActionCommand`

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

---

### 📘 Rules Screen (`Rules.java`)
| UI Element         | Description                               |
|--------------------|-------------------------------------------|
| `JLabel` Heading   | Greets user with name                     |
| `JLabel` Body      | Shows 10 instructions (HTML formatted)    |
| `JButton` Start    | Placeholder for quiz start (to be linked) |
| `JButton` Back     | Returns to login screen                   |

---

### 🧠 Quiz Screen (`quiz.java`)
| UI Element           | Description                                                |
|----------------------|------------------------------------------------------------|
| `JLabel`             | Displays question number and text                          |
| `JRadioButton`       | 4 options per question (part of `ButtonGroup`)             |
| `JButton` Next       | Navigate to next question (logic TBD)                      |
| `JButton` Submit     | Submits answers (UI only, no scoring logic yet)            |
| `JButton` 50-50      | Lifeline feature (not implemented yet)                     |
| `Graphics`           | Renders red timer using `paint()` method                   |
| `useranswers[][]`    | Stores the user's selected answers                         |
| `ActionCommand`      | Helps store selected option from radio buttons             |
| Auto-Timer Switch    | Automatically goes to next question after 15 seconds       |

---

## 📂 File Overview

| File         | Description                        |
|--------------|------------------------------------|
| `Login.java` | Main login screen                  |
| `Rules.java` | Shows rules with back/start flow   |
| `quiz.java`  | Main quiz interface                |
| `img1.jpg`   | Image for login panel              |
| `img3.jpg`   | Banner for original quiz UI        |
| `img4.jpg`   | Updated banner for quiz interface  |

---

## 🧱 Components Used

| Swing Component | Purpose                                  |
|------------------|------------------------------------------|
| `JFrame`         | Main window container                    |
| `JLabel`         | Text/image display                       |
| `JTextField`     | Accepts user name                        |
| `JButton`        | Interactive buttons                      |
| `JRadioButton`   | Option selections                        |
| `ButtonGroup`    | Ensures single selection per question    |
| `ImageIcon`      | Load image for GUI                       |
| `Font`           | Custom fonts for headings/texts          |
| `Color`          | Background color settings                |
| `ActionListener` | Enables button interactivity             |
| `Graphics`       | Renders timer countdown                  |

---
