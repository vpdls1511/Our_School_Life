import SuggestionInputArea from "../components/suggestion/SuggestionInputArea";
import SuggestionItems from "../components/suggestion/SuggestionItems";
import {useState} from "react";

const Suggestion = () => {

  const [isWidth, setWidth] = useState(false);

  return <article className={"suggestionWrap"}>
    <button className={"leftSideViewBtn"} onClick={() => setWidth(!isWidth)}> open / hide</button>
    <div className={"leftSide"} style={{
      maxWidth: isWidth ? "0px" : "1000px"
    }}>
      <SuggestionInputArea/>
    </div>
    <section className={"rightSide"}>
      <div className={"suggestionItemsWrap"}>
        <SuggestionItems/>
      </div>
    </section>
  </article>
}

export default Suggestion;