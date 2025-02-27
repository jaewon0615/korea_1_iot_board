// 카운트값 전역 상태 관리 

import { create } from "zustand";

//* interface:스토어(전역 저장소)의 interface 정의 
interface CounterStoreType{
  // 상태 필드 정의
  count:number;

  // 상태 업데이트 함수
  increment:()=>void;
  decrement:()=>void;
}

// 저장소 생성 함수:create<저장소 구조 interface>();
const useCountStore =  create<CounterStoreType>((set)=>({
  // 상태필드 초가화
  count:0,
  increment:()=>set((state)=>({
    count:state.count+1
  })),
  decrement:()=>set((state)=>({
  count:state.count-1
  }))
}));

export default useCountStore;


