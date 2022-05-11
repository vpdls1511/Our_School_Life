import SuggestionInputArea from "../components/suggestion/SuggestionInputArea";
import SuggestionItems from "../components/suggestion/SuggestionItems";

const Suggestion = () => {

  return<article className={"suggestionWrap"}>
    <div className={"leftSide"}>
      <SuggestionInputArea />
    </div>
    <div className={"test"}>
      <SuggestionItems />
    </div>
  </article>
}

export default Suggestion;