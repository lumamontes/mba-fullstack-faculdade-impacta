import React from 'react';
import logo from './logo.svg';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';

import LoginPage from './pages/Login';
import CallbackPage from './pages/Callback';
import HomePage from './pages/Home';

const router = createBrowserRouter([
  {
    path: '/',
    element: <LoginPage />,
  },
  {
    path: '/api/callback',
    element: <CallbackPage />,
  },
  {
    path: '/home',
    element: <HomePage />,
  },
]);

function App() {
  return (
    <div className="App">
      <RouterProvider router={router} />
    </div>
  );
}

export default App;
