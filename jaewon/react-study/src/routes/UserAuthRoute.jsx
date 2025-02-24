import React, { useEffect, useState } from 'react'
import { Route,Routes,useLocation, useNavigate } from 'react-router-dom'
import {userLoginStore} from "../stores/useLoginStore"

function UserAuthRoute() {
  const location = useLocation();
  const navigate = useNavigate();

  const {isLogin} = userLoginStore();

  useEffect(()=>{
    if(accessToken !== "test"){
      navigate("/user/auth/signin");
    }
    console.log(accessToken+"검사");
  },[location.pathname]);

  return<>
  {
    isLogin &&
  
  <Routes>
      <Route path='/name' element={<h1>USER NAME</h1>}/>
      <Route path='/age' element={<h1>USER AGE</h1>}/>
      <Route path='/address' element={<h1>USER ADDRESS</h1>}/>
      <Route path='/*' element={<h1>404 NOT FOUND</h1>}/>

  </Routes>
  }
  </>
}

export default UserAuthRoute