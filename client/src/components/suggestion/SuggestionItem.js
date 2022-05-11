const SuggestionItem = () => {

  const text = "국가원로자문회의의 의장은 직전대통령이 된다. 다만, 직전대통령이 없을 때에는 대통령이 지명한다.\n" +
    "\n" +
    "각급 선거관리위원회의 조직·직무범위 기타 필요한 사항은 법률로 정한다.\n" +
    "\n" +
    "국회의원은 국회에서 직무상 행한 발언과 표결에 관하여 국회외에서 책임을 지지 아니한다.\n" +
    "\n" +
    "국무총리는 국회의 동의를 얻어 대통령이 임명한다. 국회에서 의결된 법률안은 정부에 이송되어 15일"

  return <div className={"suggestionItemCard"}>
    <pre> {text} </pre>
    <p className={"itemLike"}>LIKE : 9,999+</p>
    <p className={"itemDate"}>2022-06-21</p>
  </div>
}
export default SuggestionItem