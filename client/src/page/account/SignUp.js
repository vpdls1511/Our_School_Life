import {useState} from "react";
import {useNavigate} from "react-router-dom";

const SignUp = () => {

  const navigate = useNavigate();

  const [stepFragment, setStepFragment] = useState({
    stepNumber: 0,
    fragment: [<Step1/>, <Step2/>, <Step3/>]
  })

  return <section className={"signUpWrap"}>
    {stepFragment.fragment[stepFragment.stepNumber]}
    <br/>
    {
      stepFragment.stepNumber === stepFragment.fragment.length - 1 ?
        <button onClick={() => navigate("/")}> FINISH </button>
        : <button onClick={() => setStepFragment({
          ...stepFragment,
          stepNumber: stepFragment.stepNumber + 1
        })}> NEXT </button>
    }
  </section>
}

const Step1 = () => {
  return <>
    <input type={"text"} placeholder={"당신의 학번은 무엇 인가요?"}/>
  </>
}

const Step2 = () => {
  return <>
    <input type={"password"} placeholder={"비밀번호는 작성 해 주세요"}/>
    <br/>
    <input type={"password"} placeholder={"비밀번호를 확인 해 주세요"}/>
  </>
}

const Step3 = () => {

  return <>
    회원가입이 완료되었습니다 :)<br/>
    관리자의 승인을 기다려 주세요 !
  </>
}

export default SignUp;