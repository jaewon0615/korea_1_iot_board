import React from 'react'
import UseState from '../../react-study/A_useState';
import UseEffect from '../../react-study/B_useEffect';
import StateEffect from '../../react-study/C_stateEffect'
import ReactCookie from '../../react-study/D_react_cookie';
import ReactTest from '../../react-study/E_reactTest'
import Header from '../../layouts/Header';
import Zustand from '../../react-study/E_zustand'
import ZustandRender from '../../react-study/E_zustand_render'
import Emotion from '../../react-study/G_Emotion'
import Emotion2 from '../../react-study/H_Emotion2'

export default function ReactStudy() {
  return (
    <>
      <h2>UseState: 상태관리</h2>
      <UseState />

      <h2>UseEffect: 부수효과</h2>
      <UseEffect />

      <h2>State & Effect: 메뉴 검색 구현</h2>
      <StateEffect />

      <h2>react-cookie 상태관리</h2>
      <ReactCookie/>

      <hr />

      <Zustand/>
      <ZustandRender/>

      <h2>이모션</h2>
      <Emotion/>
      <Emotion2/>


    </>
  )
}