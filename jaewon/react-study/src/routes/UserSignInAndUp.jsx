import React, { useEffect, useState } from 'react'
import { Routes,Route, useLocation,useNavigate } from 'react-router-dom'
import { useLoginStore } from '../stores/useLoginStore';
import SigninPage from '../pages/signinPage/SigninPage';
import SignupPage from '../pages/signupPage/SignupPage';

function UserSignInAndUp() {
  const location = useLocation();
  const navigate = useNavigate();
  const [isLogin,setLogin] = useLoginStore();

  useEffect(()=>{
    if(isLogin){
      navigate("/")
    }
  },[location.pathname])

  return<>
  {
    !isLogin &&
  
    <Routes>
      <Route path='/signin' element={<SigninPage/>}/>
      <Route path='/signup' element={<SignupPage/>}/>
    </Routes>
  } 
  </>

}

export default UserSignInAndUp