import axios from "axios";

const host = "api/v1/"

export const OurSchoolLifeAxios = async (method, path, data) => {
  const apiData = axios({
    method : method,
    url : host+path,
    data : data
  })

  return apiData;
}