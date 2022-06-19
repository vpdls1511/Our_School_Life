const SuggestionItem = ({addText}) => {

  return <div className={"suggestionItemCard"}>
    <pre> {addText} </pre>
    <p className={"itemLike"}>LIKE : 9,999+</p>
    <p className={"itemDate"}>2022-06-21</p>
  </div>
}
export default SuggestionItem