# 🎬 The Backlot

> A movie and TV show discovery platform — browse titles, get personalized recommendations, and manage your watchlist.

---

## About

The Backlot is a full-stack movie and TV show discovery app built for people who love film. It pulls data from The Movie Database (TMDB) to give users access to a massive library of movies and shows — new releases, classics, trending titles, and everything in between.

Users can browse by category, filter by genre, get tailored recommendations, write reviews, build custom lists, and keep track of what they've watched or want to watch next.

---

## Features

- 🎥 Browse movies and TV shows — new, trending, upcoming, and top rated
- 🔍 Search across movies, shows, and cast in one query
- 🤖 Recommendation engine — personalized suggestions based on watch history
- 🎛️ Advanced filtering — by genre, rating, language, release year
- ⭐ Ratings and reviews — write your own or read from TMDB
- 📋 Custom lists — build and organize mixed movie and TV lists
- ❤️ Favorites and Watchlist management
- 🔞 Content filtering — age-based +18 control
- 🌍 Watch providers — see where a title is available to stream (region-aware)
- 👤 User profiles with watch stats and history
- 🌙 Dark mode (because of course)

---

## Tech Stack

| Layer | Technology |
|---|---|
| Frontend | React + TypeScript |
| Backend | Java + Spring Boot |
| Database | MongoDB |
| Auth | Spring Security + JWT |
| Data Source | TMDB API v3 |
| Caching | Redis *(planned)* |
| Build Tool | Maven |

---

## Project Status

🚧 **In active development — early stage**

- [x] Project planning and scope
- [x] Frontend page structure designed
- [x] Database schema designed
- [x] Spring Boot project initialized
- [x] MongoDB Atlas connected
- [ ] Backend API development
- [ ] TMDB integration service
- [ ] JWT Authentication
- [ ] React frontend
- [ ] Recommendation engine

---

## Getting Started

> Full setup instructions will be added as the project matures. For now, here's a rough overview.

### Prerequisites

- Java 21
- Node.js + npm
- MongoDB Atlas account
- TMDB API key — [get one here](https://www.themoviedb.org/settings/api)

### Backend

```bash
# Clone the repo
git clone https://github.com/yourusername/backlot.git
cd backlot

# Add your environment variables (see below)
# Run the Spring Boot application
./mvnw spring-boot:run
```

### Frontend

```bash
cd frontend
npm install
npm run dev
```

### Environment Variables

Create an `application.properties` or `.env` file with:

```
TMDB_API_KEY=your_tmdb_api_key
MONGODB_URI=your_mongodb_connection_string
JWT_SECRET=your_jwt_secret
```

---

## Data Source

This project uses the [TMDB API](https://www.themoviedb.org/) for movie and TV show data including posters, cast, trailers, ratings, and streaming availability.

> This product uses the TMDB API but is not endorsed or certified by TMDB.

---

## Out of Scope (for now)

- Streaming or video playback
- Friends and Community features *(planned for a future phase)*

---

## License

This project is for personal and educational use. See `LICENSE` for details.

---

<p align="center">
  Made with ☕ and too many late nights watching movies
</p>
