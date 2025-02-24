import React, { useState } from 'react'
import { Link } from 'react-router-dom'

function SigninPage() {

  const [signinInput,setSigninInput] = useState({
    username: "",
    password: ""
  });

  const handleSignInoutOnChange = (e) => {
    setSigninInput(prev => ({
      ...prev,
      [e.target.name]: e.target.value,
    }));
  }

  const handleSigninSubmitOnClick = () =>{
    // axios.post 요청으로 로그인
    const authInfo={
      username:"test",
      password:"1234"
    }
    if(authInfo.username !== signinInput.username){
      alert("사용자 정보를 확인하세요.");
      return;
    }
    if(authInfo.password !== signinInput.password){
      alert("사용자 정보룰 확인하세요")
      return;
  }
  localStorage.setItem("UserAccessToken","abcd");
  window.location.replace("/");
}

  return<>
    <div><input type='text' name='username' 
    value={signinInput.username}
    onChange={handleSignInoutOnChange}/></div>
    <div><input type='password' name='password' 
    value={signinInput.password}
    onChange={handleSignInoutOnChange}/></div>
    <button onClick={handleSignInoutOnChange}>로그인</button>
    <Link to={"/user/auth/signup"}><button>회원가입</button></Link> 

  </>
}

export default SigninPage