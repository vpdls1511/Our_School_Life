const SignIn = () => {
  return<div className={"signInWrap"}>
    <p>안녕하세요, <b>학우님!</b></p>
    <input type={"text"} placeholder={"학번을 입력해 주세요."}/>
    <br/>
    <input type={"password"} placeholder={"비밀번호를 입력해 주세요."}/>
  </div>
}

export default SignIn;