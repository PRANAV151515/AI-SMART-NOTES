# AI Smart Notes

A full-stack notes app built with Spring Boot. Users can create, view and delete notes, and generate a short AI summary of any note with one click.

## Features
- Add, view and delete notes (REST API with CRUD operations)
- AI-generated note summaries using the Google Gemini API
- Data stored in an H2 database using Spring Data JPA
- Simple frontend built with HTML, CSS and JavaScript

## Tech Stack
Java 17, Spring Boot, Spring Data JPA, H2 Database, REST API, Google Gemini API, HTML/CSS/JavaScript, Git

## How to Run
1. Clone the repo and open it in VS Code
2. Get a free Gemini API key from aistudio.google.com
3. Set the key as an environment variable (Windows PowerShell):

```
$env:GEMINI_API_KEY="your_key_here"
./mvnw spring-boot:run
```

4. Open http://localhost:8080 in your browser

## Note
The API key is read from an environment variable and is never stored in the code.
