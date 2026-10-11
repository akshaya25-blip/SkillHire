# SkillHire — Freelance Marketplace

SkillHire connects clients who post projects with freelancers who can submit proposals based on their skills. This student project uses React, Spring Boot, and MySQL.

## Features
- Post a project with title, description, required skills, budget, and client name
- Browse and search projects
- Submit freelancer proposals with bid amount, delivery time, and cover letter
- Review submitted proposals
- Persist projects and proposals in MySQL

## Requirements
- Java 17 or newer
- Maven (or use the Maven wrapper/import Maven project in Eclipse/STS)
- MySQL Server
- Node.js LTS and npm
- VS Code and Eclipse/STS (or another Java IDE)

## 1. Set up MySQL
Start MySQL Server. Open `backend/src/main/resources/application.properties` and replace `CHANGE_ME` with your local MySQL root password. If your root account has no password, leave the value empty:

`spring.datasource.password=`

The connection URL creates the `skillhire` database if it does not exist. Hibernate creates/updates the tables automatically. Do not commit a real password to a public GitHub repository.

## 2. Start the backend
In Eclipse/STS: **File → Import → Maven → Existing Maven Projects**, select the `backend` folder, finish, and wait for Maven dependencies to download. Run `com.skillhire.SkillHireApplication` as a Java Application. Backend URL: `http://localhost:8081`.

API endpoints:
- `GET /api/projects`
- `POST /api/projects`
- `GET /api/projects/{id}`
- `DELETE /api/projects/{id}`
- `GET /api/proposals`
- `GET /api/proposals/project/{projectId}`
- `POST /api/proposals`

## 3. Start the frontend
Open the `frontend` folder in VS Code. Open Terminal → New Terminal, then run:

```bash
npm install
npm run dev
```

Open the local URL printed by Vite, normally `http://localhost:5173`.

## 4. Test
1. Make sure MySQL and the backend are running.
2. Open the frontend in the browser.
3. Choose **Post a Project** and create a sample project.
4. Return to **Find Work** and click **Apply** on the project.
5. Submit a proposal and open **Proposals** to view it.
6. Refresh the page; saved data should still appear because it is stored in MySQL.

## 5. Push to GitHub
Create an empty repository named `SkillHire` on GitHub (do not initialize it with a README). In a terminal opened at this project's root folder, run:

```bash
git init
git add .
git commit -m "Initial SkillHire project"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/SkillHire.git
git push -u origin main
```

Replace `YOUR-USERNAME` with your GitHub username. Never upload database passwords, API keys, or other secrets.
