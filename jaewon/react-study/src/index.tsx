import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Promise1 from './study/Promise1';
import AsyncAwait, {test1, test2} from './study/AsyncAwait';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import UserRoute from './routes/UserRoute';
import Main from './main';

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
  <BrowserRouter>
    

    <Main/>
  </BrowserRouter>
    
);
