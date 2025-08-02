import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Navbar from './Navbar';
import UserPage from './UserPage';
import GuestPage from './GuestPage';
import FlightDetails from './FlightDetails';  
function App() {
  const[isLoggedIn, setIsLoggedIn] = React.useState(false);

  return (
    <Router>
      <Routes>
        <Route path="/" element={<Navbar isLoggedIn={isLoggedIn} setIsLoggedIn={setIsLoggedIn} />} />
        <Route path="/user" element={isLoggedIn ? <UserPage /> : <GuestPage />} />
      </Routes>
    </Router>
  );
}

export default App;
