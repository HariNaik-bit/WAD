import React from "react";
import {BrowserRouter, Routes, Route, Link} from "react-router-dom";

function Home() {
    return <h2>Student Management System</h2>;
}

function Register() {
    return <h2>Registration Page</h2>;
}

function Login() {
    return <h2>Login Page</h2>;
}

function Contact() {
    return <h2>Contact Page</h2>;
}

function About() {
    return <h2>About Page</h2>;
}

function App() {
    return (
        <BrowserRouter>
            <h1>Student Management</h1>

            <nav>
                <Link to="/">Home</Link> |
                <Link to="/register">Register</Link> |
                <Link to="/login">Login</Link> |
                <Link to="/contact">Contact</Link> |
                <Link to="/about">About</Link>
            </nav>

            <Routes>
                <Route path="/" element={<Home/>}/>
                <Route path="/register" element={<Register/>}/>
                <Route path="/login" element={<Login/>}/>
                <Route path="/contact" element={<Contact/>}/>
                <Route path="/about" element={<About/>}/>
            </Routes>
        </BrowserRouter>
    );
}

export default App;