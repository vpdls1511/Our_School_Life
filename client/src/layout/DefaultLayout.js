import {NavLink, Outlet} from 'react-router-dom'
import {Link} from "react-router-dom";

const DefaultLayout = () => {
  return <>
    <header className={"defaultTopHeader"}>
      <a>우리들의 <p>학교생활</p></a>
      <nav>
        <ul>
          <li> <NavLink to={"/suggestion"}>불만사항</NavLink> </li>
          <li> <NavLink to={"/"}>개선</NavLink> </li>
          <li> <NavLink to={"/"}>스터디 모집</NavLink> </li>
        </ul>
      </nav>
      <div className={"userIconArea"}>
        <div>
          <p> 김남규 </p>
          <p> 202062010 </p>
        </div>
        <img src={"userIcon.png"} />
      </div>
    </header>
    <div className={"defaultOutletWrap"}>
      <Outlet />
    </div>
  </>
}

export default DefaultLayout;