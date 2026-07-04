# Post-Quantum Secure E-Commerce Pipeline

A minimalist microservices architecture demonstrating an Edge-Termination security model. This system handles NIST FIPS 203 finalized lattice-based cryptography (ML-KEM) at the network perimeter while maintaining standard, low-latency plaintext connections inside the internal cluster network.

<img width="639" height="758" alt="Screenshot (182)" src="https://github.com/user-attachments/assets/46a967c1-65fb-42f0-99ac-5e9efe92bc37" />

## Prerequisites
* Docker and Docker Compose
* openquantumsafe/curl Docker image

## Deployment

docker-compose up -d --build
