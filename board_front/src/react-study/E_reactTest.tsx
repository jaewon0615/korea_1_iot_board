import React from 'react'

const handleButtonClick=()=>{

}



export default function reactTest() {
  return (
    <div>
      <p>도서 카테고리</p>
      <div>
        <button 
          value='인문'
          onClick={handleButtonClick}
        >인문</button>
        <button 
          value='사회' 
          onClick={handleButtonClick}
        >사회</button>
        <button 
          value='과학기술' 
          onClick={handleButtonClick}
        >과학기술</button>
        <button 
          value='기타' 
          onClick={handleButtonClick}
        >기타</button>
      </div>
    </div>
  )
}
