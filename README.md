# 🧾 Java Swing Login Interface

This project creates a **Login Interface** using **Java Swing**, designed for a quiz application named **Simple Minds**. It features a stylish graphical layout with custom fonts, buttons, and an image.

---

## 🚧 This Project is Under Build

> ⚠️ The functionality for "Rules" and "Back" buttons is not yet implemented. This is a basic GUI layout and will be extended with full interactivity in future updates.

---

## 🧩 Features

- ✅ Graphical User Interface using `JFrame`
- ✅ Background Image using `ImageIcon`
- ✅ Custom font labels (`Mongolian Baiti`)
- ✅ Input field for user name
- ✅ Two functional buttons: **Rules** and **Back**
- ✅ Absolute positioning using `setBounds()`

---

## 🖼️ Interface Layout

- 📌 **Image** positioned on the left (`img1.jpg`)
- 🧠 **Heading:** *"Simple Minds"* prominently at the top right
- 👤 **Label and Input Field**: "Please Enter Your Name" with a text field below
- 🔘 **Buttons**:
  - **Rules** – To proceed to the next step (functionality to be added)
  - **Back** – To return or exit (functionality to be added)

---

## 📦 Components Used

| Component     | Purpose                          |
|---------------|----------------------------------|
| `JFrame`      | Main application window          |
| `JLabel`      | Displaying static text/image     |
| `JTextField`  | User name input                  |
| `JButton`     | Interactive buttons              |
| `ImageIcon`   | Loads and displays an image      |
| `Font`        | Custom font styling              |
| `Color`       | Sets background color            |

---

# 📜 Rules Screen – Java Swing

This component defines a **Rules** window for the **Simple Minds** quiz application using **Java Swing**. It serves as a dedicated space for displaying quiz rules or instructions to the user.

---

## 📂 File: `Rules.java`

### ✅ Features

- Displays a window titled **"Rules"**
- White background for a clean interface
- Custom heading with large, bold font (`Mongolian Baiti`)
- Fixed-size window with manual positioning using `setBounds()`
- Intended as a follow-up screen from the Login interface

---

## 🧱 GUI Components Used

| Component   | Purpose                                |
|-------------|----------------------------------------|
| `JFrame`    | Acts as the main container             |
| `JLabel`    | Displays the "Rules" heading           |
| `Font`      | Sets the font family, style, and size  |
| `Color`     | Sets background color to white         |
| `setBounds()` | Positions components manually       |

---

## 🚧 Planned Enhancements

- Add multiple lines of rules (via `JLabel` or `JTextArea`)
- Style text with HTML or rich formatting
- Include "Start Quiz" and "Back" buttons
- Connect this screen to the `Login.java` screen using button actions

---

## 🧪 How to Run

1. Ensure Java is installed and configured.
2. Place `img1.jpg` in the same directory as your `.java` file.
3. Compile:
   ```bash
   javac Login.java
