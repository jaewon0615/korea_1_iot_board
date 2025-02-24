class Test {
  then(fx){
    fx()
  }
}

function Promise1() {

  new Test().then(() => {
    

  });

  new Promise((rs,rj) => {
    console.log("프로미스 생성");
    rj();
  }).then(() => {
    console.log("then 실행");
  }).then(() => {
    console.log("then 실행1-1");
  }).catch(() => {
    console.log("catch 실행");
  });
    
  console.log("프로미스 외부에서 실행");

  new Promise((rs,rj) => {
    console.log("프로미스 생성2");
    rs(10);
  }).then((num) => {
    console.log("then 실행2");
    return 20;
  }).then(() => {
    console.log("then 실행2-2");
  });

  return <></>
}

export default Promise1;