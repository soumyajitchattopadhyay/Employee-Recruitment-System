# Employee Recruitment System

## Overview
A web application developed using Java, JSP, and SQL to facilitate candidate registration and job application management. The system features an admin panel for managing candidate data and job postings. It also integrates JACo MP3 Player for sound effects to enhance the user experience. The project was developed using NetBeans 8.2.

## Technologies Used
- Java (Servlets and backend logic)
- JSP (JavaServer Pages for frontend)
- SQL (Database queries and management)
- JACo MP3 Player (Audio integration)
- NetBeans 8.2 (IDE)

## Features
- Candidate registration and job application submission  
- Admin dashboard to manage candidates and job listings  
- Sound effects integrated via JACo MP3 Player  
- Simple and intuitive UI with JSP templates  

## Build & Run Instructions

When you build the project in NetBeans, the IDE copies all the required JAR files on the classpath to the `dist/lib` folder. It also updates the application JAR's manifest file (`MANIFEST.MF`) with the correct Class-Path entries.

### To run the application from the command line:
1. Navigate to the `dist` folder.
2. Run the following command:
```bash
java -jar Employee.jar
```

### To distribute the project:
- Zip up the entire `dist` folder (including the `lib` folder).
- Share the zipped folder with the `Employee.jar` and all required libraries.

### Notes:
- If multiple JAR files have the same name on the classpath, only the first one is copied to the `lib` folder.
- Only JAR files are copied; other file types or folders on the classpath are not included.
- If a library's manifest includes a Class-Path element, ensure the referenced paths are available at runtime.
- To set or change the main class in NetBeans:
- Right-click the project in the Projects window.
- Select **Properties** → **Run**.
- Enter the fully qualified main class name in the **Main Class** field.

---

Feel free to let me know if you want me to add setup steps for the database, usage instructions, or anything else!
