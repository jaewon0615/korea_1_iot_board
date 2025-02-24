import React, { useEffect } from 'react'
import { useLocation } from 'react-router-dom';
import { useLoginStore } from '../stores/useLoginStore';

export function useAccessTokenValid() {

  const location = useLocation();
  const{isLogin,setLogin} = useLoginStore();

  useEffect(()=>{
    valid();
  },[location.pathname])

  const valid = () =>{
    // accessToken을 백으로 보내서 사용가능한지 확인 
    const userAccessToken = localStorage.getItem("UserAccessToken");

    if(!userAccessToken){
      setLogin(false);
      return;
    }

    const validAccessToken = "abcd";
    if(userAccessToken === validAccessToken){
      setLogin(false);
      return;
    }
    setLogin(true);
  }
}

export default useAccessTokenValid