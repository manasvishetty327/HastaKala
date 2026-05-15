
# Hasta Kala Shop – Micro Sales Analytics App

## Overview
Hasta Kala Shop is an Android-based micro-sales analytics application developed to help artisans and small business owners manage daily sales, track stock, monitor income, and analyze product performance. The application provides a simple and user-friendly interface for recording sales and viewing business insights through charts and analytics.

## Features
- Product & Stock Management
- Sales Recording & Income Tracking
- Analytics Dashboard
- Low Stock Alerts
- Fast-Selling & Low-Selling Product Insights
- Offline Data Storage using Room Database
- Simple and User-Friendly UI

## Technologies Used
- Kotlin
- Jetpack Compose
- Room Database
- MPAndroidChart
- Android Studio
- MVVM Architecture

## Environment Setup

### Prerequisites
- Android Studio
- Android SDK
- Kotlin Plugin
- Git (optional)
- JDK 11 or higher

### Clone the Repository
git clone https://github.com/manasvishetty327/HastaKala.git

### Open Project
1. Open Android Studio
2. Click Open Project
3. Select the project folder

### Sync Gradle
- Allow Gradle to sync automatically
- Install missing SDK components if prompted

### Run the Application

Using Emulator:
1. Open Device Manager
2. Create or start an Android Virtual Device (AVD)
3. Click Run

Using Physical Device:
1. Enable Developer Options and USB Debugging
2. Connect the device via USB
3. Select the device and run the app

## Application Workflow
1. User opens the application
2. Add a sale by selecting product and color/design
3. Enter price and save the sale
4. Data is stored in Room Database
5. Stock updates automatically
6. Dashboard and analytics are updated in real-time

## Modules

### Dashboard
- Total income
- Number of orders
- Best-selling products
- Low stock alerts

### Add Sale
- Select product
- Select color/design
- Enter price
- Save sale data

### Insights
- Pie chart analytics
- Fast-selling products
- Low-selling products

### Income Tracking
- Income records
- Transaction details
- Sales summaries

### Settings
- Basic application configurations and preferences

## Architecture
UI (Jetpack Compose)
↓
ViewModel
↓
Repository
↓
Room Database

## Problem Statement
Artisans and small business owners often do not maintain proper sales records, making it difficult to track stock, monitor income, and identify best-selling products. This can lead to poor inventory management and financial loss.

## Objective
The objective of this project is to provide a lightweight and easy-to-use mobile application that helps users efficiently manage sales, stock, and business analytics through an offline Android solution.

## Screenshots
Splash Screen
<img width="342" height="636" alt="image" src="https://github.com/user-attachments/assets/37dc96c4-abd7-4983-a99f-7ed8810ef45f" />



          
Home Screen
<img width="269" height="705" alt="image" src="https://github.com/user-attachments/assets/83fdd4c9-6e3b-41a8-b794-2b4fd5c7ddeb" />



         
Add Sale Screen
<img width="290" height="634" alt="image" src="https://github.com/user-attachments/assets/5c79ffb8-6d51-44e1-9e24-4593f4e7b6dd" />   

<img width="274" height="708" alt="image" src="https://github.com/user-attachments/assets/6d0b8388-221b-4a28-a1dc-46b81e8315db" />


  
Insights Screen
<img width="316" height="640" alt="Screenshot 2026-05-09 072856" src="https://github.com/user-attachments/assets/dd177160-c380-4016-90c5-aecdb5c17b07" />     
  




Income Screen
<img width="206" height="612" alt="image" src="https://github.com/user-attachments/assets/27a0d5f0-919f-4479-9b67-f1a47d7b56b9" />



          
          
Settings Screen
<img width="194" height="606" alt="image" src="https://github.com/user-attachments/assets/08de53eb-c690-4e5b-b8b6-b2323f51dd08" />             


## Future Enhancements
- Multi-language support
- Cloud synchronization
- Barcode scanning
- Export reports as PDF/Excel
- User authentication and backup

## Developer
Manasvi Shetty
Android Development Intern – MindMatrix

## License
This project is developed for educational and internship purposes.
