# Dynamic Profile API (Java/Spring Boot)

This project is a RESTful microservice built with **Java** and **Spring Boot** designed to retrieve and display a user's profile information along with dynamic external data.

The application serves a single, protected profile endpoint that combines static user data with real-time API results.

## Key Features

* **Profile Endpoint:** Provides a `/me` endpoint accessible via HTTP GET.
* **Structured JSON Output:** Returns a validated JSON response with `status`, nested `user` object, `timestamp`, and a `fact`.
* **Configuration:** User profile details (Name, Email, Stack) are securely loaded from **Environment Variables**.
* **Dynamic Data:** Fetches a unique, random **Cat Fact** from the `https://catfact.ninja/fact` external API on every request, meeting the dynamic data requirement.
* **Robustness:** Includes a fallback mechanism and error handling for the external API call.

## Technologies Used

* **Language:** Java 17+
* **Framework:** Spring Boot 3
* **Build Tool:** Maven
* **Libraries:** Project Lombok, RestTemplate (for API calls)

## Deployment

This application is designed for cloud deployment, utilizing environment variables for configuration.

| Environment Variable | Description | Example Value |
| :--- | :--- | :--- |
| `USER_NAME` | Full name of the user | `Nsikak Bassey Okon` |
| `USER_EMAIL` | User's contact email | `nsikakabasiinam7@gmail.com` |
| `USER_STACK` | Primary technology stack | `Java/Spring Boot` |
| `CAT_FACT_URL` | External fact API endpoint | `https://catfact.ninja/fact` |
