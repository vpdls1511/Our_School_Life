import {useRoutes} from 'react-router-dom';
//Layouts
import DefaultLayout from "./layout/DefaultLayout";
//Pages
import Home from "./page/Home";
import Suggestion from "./page/Suggestion";

function App() {
  return useRoutes([
    {
      path : '/',
      element : <DefaultLayout />,
      children : [
        {index : true , element: <Home />},
        {path : "suggestion" , element: <Suggestion />}
      ]
    }
  ]);
}

export default App;
