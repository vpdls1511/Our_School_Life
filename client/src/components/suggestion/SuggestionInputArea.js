import SuggestionTitleText from "./SuggestionTitleText";
import {useState} from "react";
import {OurSchoolLifeAxios} from "../../utils/OurSchoolLifeAxios";

const SuggestionInputArea = () => {

  const [text, setText] = useState({
    desc: "",
    cnt: 0
  })
  const [submitData, setSubmitData] = useState({
    USER_ID : 1,
    POST_DESC : ""
  })

  const handleTypingText = (e) => {
    setText({
      desc: e.target.value,
      cnt: e.target.value.length
    })
  }

  const handleSubmitData = () => {
    const path = "POST";
    const url = "suggest-posts/create-suggest"
    const data = {
      userId : 1,
      postDesc : text.desc
    }
    OurSchoolLifeAxios(path, url, data)
      .then(body => {
        console.log(body.data)
      })
  }

  return <div className={"suggestionAreaWrap"}>
    <SuggestionTitleText/>

    <div className={"inputArea"}>
      <textarea className={"inputBox"} value={text.desc} placeholder={"불만 사항을 작성해 주세요."}
                maxLength={200}
                onChange={handleTypingText}
                onBlur={handleTypingText}
      />
      <p className={text.cnt >= 200 ? "textMax" : ""}>{text.cnt}/200</p>
      <button onClick={handleSubmitData}> 제출하기</button>
    </div>

    <div className={"suggestionInfo"}>
      학우 여러분들의 의견을 자유롭게 남겨주세요!
    </div>
  </div>
}

export default SuggestionInputArea;