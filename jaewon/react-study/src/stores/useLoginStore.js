import { create } from "zustand";

export const useLoginStore = create((set)=>({
  isLogin:false,
  setLogin:(value) => set({
    isLogin:value
  }),
}));
