const SuggestionItem = ({addText, like, date}) => {

  const formatDate = (targetTime) => {
    const now = new Date(targetTime);
    const year = now.getFullYear();
    const month = now.getMonth()+1;
    const ndate = now.getDate();

    return year + "-" + month + "-" + ndate
  }

  return <div className={"suggestionItemCard"}>
    <pre> {addText} </pre>
    <p className={"itemLike"}>LIKE : {like}</p>
    <p className={"itemDate"}>{formatDate(date)}</p>
  </div>
}
export default SuggestionItem