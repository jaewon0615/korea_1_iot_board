import React, { useEffect } from 'react'
import { Route, Routes } from 'react-router-dom';
import UserAuthRoute from './UserAuthRoute';
import UserSignInAndUp from './UserSignInAndUp';

function UserRoute() {

  const accessToken="test";

  useEffect(()=>{

  },[]);
  
  return <>
    <Routes>
      <Route path="/*" element={<UserAuthRoute />} />
      <Route path='/mypage/:username' element={<h1>USER MYPAGE</h1>}/>
      <Route path='/auth/*' element={<UserSignInAndUp/>}/>
    </Routes>
  </>
}

export default UserRoute