// zustand 파일명 권장
// : 전역상태관리할데이터명.store.ts
// ex) user.store.ts 

import { create } from "zustand";

//* interface
//# 인증 상태에 저장할 사용자 interface 정의 
interface User{
  id:number; 
  name:string;

}

//# 인증상태의 인터페이스 정의 // 
interface AuthStoreType{
  // 상태 필드 정의
  isAuthenticated:boolean; // 인증 여부를 나타냄
  user:User | null;

  // 상태 업데이트 함수
  login:(user:User) => void
  logout:()=> void;
}

const useAuthStore = create<AuthStoreType>((set)=>({
  // 상태 필드 초기화
  isAuthenticated:false,
  user:null,

  // 상태 업데이트 함수
  login:(user)=>set({isAuthenticated:true,user}),
  logout:()=>set({isAuthenticated:false,user:null}),
}));

export default useAuthStore;
