import {Outlet} from "react-router-dom";

const AccountLayout = () => {
  return <>
    <div className={"accountBackground"}>
      <div className={"img"}/>
      <div className={"filter"}/>
    </div>
    <div className={"accountWrap"}>
      <Outlet/>
    </div>
  </>
}

export default AccountLayout