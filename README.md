# Hasta Kala Shop

An offline Android application designed to help artisans and small business owners record sales, manage stock, and understand product performance.

**Live project website:** https://manasvishetty327.github.io/-hasta-kala-web/

## Overview

Small businesses often maintain sales and inventory records manually. Hasta Kala Shop provides a simple mobile workflow for recording sales, tracking available stock, monitoring income, and viewing product-level insights.

The application stores its data locally, so its core sales and inventory workflows do not depend on an internet connection.

## Key Features

- **Product and stock management** — maintain product details and stock levels.
- **Sales recording** — record sales by selecting a product and its colour/design, then entering the sale price.
- **Income tracking** — review income records and transaction details.
- **Analytics dashboard** — view sales and product insights through charts.
- **Stock alerts** — identify products with low available stock.
- **Product performance insights** — identify fast-selling and low-selling products.
- **Offline storage** — persist application data locally using Room Database.

## Technology Stack

| Area | Technologies |
|---|---|
| Language | Kotlin |
| UI | Jetpack Compose |
| Local database | Room |
| Architecture | MVVM |
| Charts | MPAndroidChart |
| Development environment | Android Studio |

## Application Workflow

1. Open the application.
2. Select a product and its colour/design when recording a sale.
3. Enter the sale price and save the transaction.
4. Store the transaction in the local Room database.
5. Update stock and refresh the dashboard insights.
6. Review income, stock alerts, and product performance.

## Main Modules

### Dashboard
- Total income
- Number of orders
- Best-selling products
- Low-stock alerts

### Add Sale
- Select a product
- Select colour/design
- Enter the sale price
- Save the sale record

### Insights
- Pie-chart analytics
- Fast-selling products
- Low-selling products

### Income
- Income records
- Transaction details
- Sales summaries

### Settings
- Basic application preferences

## Workflow

<img width="722" height="314" alt="Hasta Kala application workflow" src="https://github.com/user-attachments/assets/e4d6c77d-f287-4532-81cf-36f15fbd5457" />

## Screenshots

### Splash Screen
<img width="342" height="636" alt="Splash Screen" src="https://github.com/user-attachments/assets/37dc96c4-abd7-4983-a99f-7ed8810ef45f" />

### Home Screen
<img width="269" height="705" alt="Home Screen" src="https://github.com/user-attachments/assets/83fdd4c9-6e3b-41a8-b794-2b4fd5c7ddeb" />

### Add Sale
<img width="290" height="634" alt="Add Sale Screen" src="https://github.com/user-attachments/assets/5c79ffb8-6d51-44e1-9e24-4593f4e7b6dd" />
<img width="274" height="708" alt="Add Sale Details" src="https://github.com/user-attachments/assets/6d0b8388-221b-4a28-a1dc-46b81e8315db" />

### Insights
<img width="316" height="640" alt="Insights Screen" src="https://github.com/user-attachments/assets/dd177160-c380-4016-90c5-aecdb5c17b07" />

### Income
<img width="206" height="612" alt="Income Screen" src="https://github.com/user-attachments/assets/27a0d5f0-919f-4479-9b67-f1a47d7b56b9" />

### Settings
<img width="194" height="606" alt="Settings Screen" src="https://github.com/user-attachments/assets/08de53eb-c690-4e5b-b8b6-b2323f51dd08" />

## Setup and Run

### Prerequisites
- Android Studio
- Android SDK
- Kotlin plugin
- JDK 11 or a compatible version required by the project Gradle configuration

### Clone the repository

```bash
git clone https://github.com/manasvishetty327/HastaKala.git
```

### Open and run
1. Open the cloned project in Android Studio.
2. Allow Gradle sync to complete.
3. Install any SDK components requested by Android Studio.
4. Start an Android emulator or connect an Android device with USB debugging enabled.
5. Select the device and run the application.

## Future Enhancements

- Multi-language support
- Cloud synchronisation and backup
- Barcode scanning
- PDF and Excel report export
- User authentication

## Developer

**Manasvi Shetty**

Developed as an Android application project during the MindMatrix Android Development Internship.

## License

Developed for educational and internship purposes.
