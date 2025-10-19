# Dynamic Profile API (Java/Spring Boot)

This project is a RESTful microservice built with **Java** and **Spring Boot**, designed to retrieve and display a user's profile information along with dynamic external data.

The application serves a single, protected profile endpoint that combines static user data with real-time API results.

---

## Key Features

- **Profile Endpoint:** Provides a `/me` endpoint accessible via HTTP GET.
- **Structured JSON Output:** Returns a validated JSON response with `status`, nested `user` object, `timestamp`, and a `fact`.
- **Configuration:** User profile details (Name, Email, Stack) are securely loaded from **Environment Variables**.
- **Dynamic Data:** Fetches a unique, random **Cat Fact** from the [Cat Facts API](https://catfact.ninja/fact) on every request, meeting the dynamic data requirement.
- **Robustness:** Includes a fallback mechanism and error handling for the external API call.
- **Cloud Ready:** Easily deployable using platforms like **Railway**, **Fly.io**, or **Heroku**.

---

## Technologies Used

- **Language:** Java 17+
- **Framework:** Spring Boot 3
- **Build Tool:** Maven
- **Libraries:** Project Lombok, RestTemplate (for API calls)
- **Deployment Platform:** Railway

---

## Live Endpoint

**Production URL:**  
[https://dynamicprofile-production-b256.up.railway.app/me](https://dynamicprofile-production-b256.up.railway.app/me)

---

## Example Response

```json
{
  "status": "success",
  "user": {
    "email": "nsikakabasiinam7@gmail.com",
    "name": "Nsikak Bassey Okon",
    "stack": "Java/Spring Boot"
  },
  "timestamp": "2025-10-17T12:34:56.789Z",
  "fact": "Cats have five toes on their front paws but only four toes on their back paws."
}
 ```

| Variable Name  | Description                     | Example Value                |
| -------------- | ------------------------------- | ---------------------------- |
| `USER_NAME`    | Full name of the user           | `Nsikak Bassey Okon`         |
| `USER_EMAIL`   | User's contact email            | `nsikakabasiinam7@gmail.com` |
| `USER_STACK`   | Backend technology stack        | `Java/Spring Boot`           |
| `CAT_FACT_URL` | External Cat Facts API endpoint | `https://catfact.ninja/fact  |



