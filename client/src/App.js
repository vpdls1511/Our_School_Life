import {useRoutes} from 'react-router-dom';
//Layouts
import Default from "./layout/Default";
//Pages
import Home from "./page/Home";

function App() {
  return useRoutes([
    {
      path : '/',
      element : <Default />,
      children : [
        {index : true , element: <Home />}
      ]
    }
  ]);
}

export default App;
