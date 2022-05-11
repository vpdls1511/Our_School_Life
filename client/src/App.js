import {useRoutes} from 'react-router-dom';
//Layouts
import DefaultLayout from "./layout/DefaultLayout";
//Pages
import Home from "./page/Home";

function App() {
  return useRoutes([
    {
      path : '/',
      element : <DefaultLayout />,
      children : [
        {index : true , element: <Home />}
      ]
    }
  ]);
}

export default App;
