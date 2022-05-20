import {useRoutes} from 'react-router-dom';
//Layouts
import DefaultLayout from "./layout/DefaultLayout";
//Pages
import Home from "./page/Home";
import Suggestion from "./page/Suggestion";
import AccountLayout from "./layout/AccountLayout";
import SignIn from "./page/account/SignIn";
import SignUp from "./page/account/SignUp";

function App() {
  return useRoutes([
    {
      path: '/',
      element: <DefaultLayout/>,
      children: [
        {index: true, element: <Home/>},
        {path: "suggestion", element: <Suggestion/>}
      ]
    },
    {
      path: '/account',
      element: <AccountLayout/>,
      children: [
        {path: "signin", element: <SignIn/>},
        {path: "signup", element: <SignUp/>},
      ]
    }
  ]);
}

export default App;
