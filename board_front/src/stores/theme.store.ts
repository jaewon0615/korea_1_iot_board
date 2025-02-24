import { create } from "zustand";

// 전역 테마 관리 
interface ThemeStoreType{
  theme: 'light' | 'dark';
  toggleTheme:()=> void;
}

const useThemeStore = create<ThemeStoreType>((set)=>({
  theme:'light',
  toggleTheme:()=> set((state)=>({
    theme:state.theme === 'light' ? 'dark':'light',
  })),
}));

export default useThemeStore;