# RetrofitLoginApp

Goal: Create an Android app with a login screen that:

* Collects email and password from the user.

* Sends a POST request with JSON {"email": "", "password": ""} to https://mailmatebe-akg9fhe2fddfhrbt.canadacentral-01.azurewebsites.net/api/auth/login.

* Displays a toast notification (Snackbar for Toastify-like behavior) for success or failure.

* Shows the API response JSON {"token": "", "expiresIn": 3600, "user": {...}}.

MVVM Architecture:

Model: Represents data (login request/response JSON, API interaction).

View: UI components (login screen with input fields, buttons, and toast).

ViewModel: Mediates between View and Model, handling business logic (API calls, input validation).

Android Application Components:

Activity: Hosts the login UI (main screen).

View Binding: Connects UI elements to code.

Services/Receivers/Content Providers: Not needed for this simple app.

Dependencies:

Retrofit for API calls.
ViewModel and LiveData for MVVM.
Material Design for UI (input fields, buttons, toast).
