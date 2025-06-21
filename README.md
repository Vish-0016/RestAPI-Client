RestAPI Client – Cat Fact App

This project is a Java application that connects to a public REST API and displays data in a structured format. It uses `HttpClient` to send HTTP requests and the `org.json` library to parse JSON responses.

---

## 🛠 Features

- ✅ Connects to a public API: `https://catfact.ninja/fact`
- ✅ Parses JSON using the `org.json` library
- ✅ Displays random cat facts to the console

---

## 📁 File Structure

```
task2/
├── CatFactClient.java             # Main Java file
├── lib/json-20231013.jar          # External JSON parsing library
```

---

## ▶️ How to Run

### 1️⃣ Compile the file with the library
```bash
javac -cp ".;lib/json-20231013.jar" CatFactClient.java
```

### 2️⃣ Run the program
```bash
java -cp ".;lib/json-20231013.jar" CatFactClient
```

> For Linux/Mac users, replace `;` with `:` in the classpath.

---

## 📤 Sample Output

```
Fetching a cat fact...
Random Cat Fact: Cats sleep for 70% of their lives.
```

---

## ❗ Note

Make sure the `json` JAR file is present in the `lib/` directory and correctly linked in the classpath.

---

## 🧑‍💻 Author

Intern: Vishakha Kandrikar 
Task: Task 2 – Java Programming Internship

---

## 📜 License

This project is for educational purposes as part of a Java internship.


