# Pixel Online Coffee Shop

A full-stack web application simulating an online coffee shop, built with **Spring Boot**, **ReactJS**, and **MySQL**.
![image](https://github.com/user-attachments/assets/487a93a7-5363-4ebc-b095-db6de0c1e605)


## Overview

Pixel Online Coffee Shop allows users to:

- View the coffee shop menu and description
- Create an account and log in
- Add products to cart and place orders

Administrators have access to a special interface where they can:

- Manage products (add, update, delete)
- Manage orders (view, send, delete)
- Edit the homepage description

---

## Tech Stack

- **Backend**: Java + Spring Boot (IntelliJ)
- **Frontend**: ReactJS (WebStorm)
- **Database**: MySQL
- **API Testing**: Postman

---

## Project Structure

- `Coffee_Shop_back`: backend code + SQL script
- `Coffee_Shop_front`: React frontend app

> Both the frontend and backend must be running for the application to work.

---

## Running the App

1. Run the backend in IntelliJ
2. Run the frontend in WebStorm
3. Ensure MySQL is running and has the required tables
   - You can import the provided SQL script
4. Access the app in your browser at `http://localhost:3000`

---

## Features

### Client

- Login / Create account
- Add products to cart
- Search and filter products by name and price
- Place orders
- 20% discount for registered users
- Logout

### Administrator

> Access with username: `admin`, password: `admin`

- Edit homepage description
- Product management: add, update, delete
- Order management: view, send, delete
- View client information and order details

---

## Design Patterns Used

- **Hooks (React - `useContext`)**: for global state (auth & cart)
- **Template**: inheritance from `JPARepository` for shared CRUD logic
- **Autowired Singleton**: ensures single bean instances for Spring services
- 
---

## Resources

- [Udemy: React - The Complete Guide](https://www.udemy.com/course/react-the-complete-guide-incl-redux/)
- [Postman](https://www.postman.com/)
- [DigitalOcean - React Authentication](https://www.digitalocean.com/community/tutorials/how-to-add-login-authentication-to-react-applications)
- [UML and Design Patterns](https://www.visual-paradigm.com/)

---

## License

Educational project developed at the Faculty of Automation and Computer Science, academic year 2021-2022.
