import { dark } from '@mui/material/styles/createPalette';
import axios from 'axios';
import React from 'react'

/*
  ! === 1.Spring Boot의 응답 구조 ===

  RsponseEntity<ResponseDto<실제 응답 데이터>>

  1) RsponseEntityty 구조 
  - HttpStatus : 응답,성공,실패 상태를 나타냄(EX. 200 ok,404 Not found,500 internal server error)
  - HttpHeaders: 응답에 포함 할 추가 정보 (ex.Content-Type,Authorization 등)
  - Body(본문) : 클라이언트에게 전달할 실제 데이터
                  , 갹체나 문자열 또는 dto등 다양한 데이터 타입 설정이 가능 
                  >> ResponseDto 형식의 구조화된 본문을 전달(응답 데이터를 감싸는 형태의 응답 구조)

  2) ResponseDto 구조
    - result(boolean): 성공,실패에 대한 boolean 타입의 데이터
    - message(string): 성공,실패에 대한 구체적인 메시지 전달
    - data(D): 클라이언트에게 전달할 실제 데이터 

  ! === 2.프론트엔드의 Axios응답처리 ===

  Response.data.data

  1) response 구조
    : axios가 HTTP응답을 처리한 후 반환하는 객체 
    - response.status:HTTP 상태 코드(200,204)
    - response.statusText: 상태 텍스트("ok","not found"등)
    - response.headers: 응답 헤더 정보
    - response.config: 응답 설정 정보
    - rsponse.data: 서버에 전송한 응답 데이터 

  2) response.data 구조 
    : 백엔드의 전체 ResponseDto 객체를 가리킴 
    - 실제 데이터를 data 필드로 감싸고 있음
*/

export default function F_Response_Constructure() {
  //# function: 로그인 성공 시 실행되는 함수 //
  const SignInSuccessResponse = (data:any)=>{

  }

  //# event handler: 로그인 버튼 클릭 이벤트 처리 함수 //
  const handleSignIn = async ()=>{

    const credentials = {
      email:'devgiants75',
      password:'12341234'
    };
    if(!credentials.email || !credentials.password){
      console.error('아이디와 비밀번호를 모두 입력해주세요');
      return;
    }

    try{
      const response = await axios.post(`http://localhost:8080/api/v1/auth/signIn`,credentials);

      if(response.status === 200){
        // 응답에 대한 상태가 200(성공) 일 경우 
        SignInSuccessResponse(response.data.data)
      }
    } catch{
      console.error('로그인중 문제가 발생하였습니다');
    }
  }
  return (
    <div>F_Response_Constructure</div>
  )
}
