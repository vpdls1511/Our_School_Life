import {Outlet} from 'react-router-dom'
import {Link} from "react-router-dom";

const DefaultLayout = () => {
  return <>
    <header className={"defaultTopHeader"}>
      <a>우리들의 <p>학교생활</p></a>
      <nav>
        <ul>
          <li> <Link to={"/"}>불만사항</Link> </li>
          <li> <Link to={"/"}>개선</Link> </li>
          <li> <Link to={"/"}>스터디 모집</Link> </li>
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
    <Outlet />
  </>
}

export default DefaultLayout;