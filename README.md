# Post-Quantum Secure E-Commerce Pipeline

A minimalist microservices architecture demonstrating an Edge-Termination security model. This system handles NIST FIPS 203 finalized lattice-based cryptography (ML-KEM) at the network perimeter while maintaining standard, low-latency plaintext connections inside the internal cluster network.

## Prerequisites
* Docker and Docker Compose
* openquantumsafe/curl Docker image

## Deployment

docker-compose up -d --build
