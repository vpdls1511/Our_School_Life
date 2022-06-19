import SuggestionItem from "./SuggestionItem";
import axios from "axios";
import {useEffect, useState} from "react";
import {OurSchoolLifeAxios} from "../../utils/OurSchoolLifeAxios";

const SuggestionItems = () => {

  const [layoutList, setLayoutList] = useState([]);

  useEffect(() => {
    const path = "GET";
    const url = "suggest-posts/recently"
    OurSchoolLifeAxios(path, url)
      .then(body => {
        setLayoutList(body.data);
      })
  },[]);

  return <>
    {
      layoutList.map((item, key) => {
        console.log(item)
        return <SuggestionItem
          addText={item[0]["postDesc"]}
          like = {item[0]["postLike"]}
          date = {item[0]["created_at"]}
        />
      })
    }
  </>
}
export default SuggestionItems;