import {useNavigate} from 'react-router-dom';

const SignIn = () => {
  const navigate = useNavigate();

  return <section className={"signInWrap"}>
    <p><b>안녕하세요,</b> 학우님!</p>
    <form>
      <input type={"text"} placeholder={"학번을 입력해 주세요."}/>
      <br/>
      <input type={"password"} placeholder={"비밀번호를 입력해 주세요."}/>
      <input type={"submit"}/>
    </form>
    <p className={"goSignUp"}>아직 회원이 아니신가요? <b onClick={() => navigate("/account/signup")}>회원가입</b>을 해주세요</p>
  </section>
}

export default SignIn;