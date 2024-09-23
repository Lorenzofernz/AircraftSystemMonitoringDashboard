# Aircraft System Monitoring Dashboard

This project simulates real-time aircraft system monitoring using a Python Flask API for data simulation and a Java Spring Boot backend for fetching and displaying data.

## Project Structure

- **Backend (Java Spring Boot)**: Provides REST APIs to display aircraft system status.
- **Frontend (Angular)**: Displays aircraft data in a user-friendly dashboard (work in progress).
- **Data Simulation (Python Flask)**: Generates simulated aircraft data for fuel level, engine temperature, and altitude.

## How to Run

### Spring Boot Backend
1. Navigate to the `spring-boot-backend` directory.
2. Run `mvn spring-boot:run`.

### Python Data Simulation
1. Navigate to the `aircraft-data-simulation` directory.
2. Run `python data_simulation.py`.

### Angular Frontend (coming soon)

## Features
- Real-time aircraft system monitoring.
- REST API integration between Java Spring Boot and Python Flask.
