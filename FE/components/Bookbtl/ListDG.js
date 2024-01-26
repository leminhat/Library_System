import React from "react";
import { useState } from "react";
import { useEffect } from "react";

import { Link, useNavigate, useParams } from "react-router-dom";


import axios from "axios";
const ListDG = () => {
    const navigate = useNavigate();
    const[bookDG,setBookDG] =useState([]);
    const data = useParams();
  
  useEffect(() => {
    init();
  }, []);

  const init = () => {

        axios.get("http://localhost:8080/danhgia/" + data.id)
      .then((res) => {
        
        setBookDG(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

   
   
  if(!localStorage.getItem("accessToken")){
    navigate('/homelogin')
} 
else{
   

    
    
  return (  
    <div className="container">
      <h1 className="text-centermt-3">Danh Sach Danh Gia</h1>
      
      <table className="table mt-5">
        <thead className="bg-light">
          <tr>
            
            <th scope="col">Tai Khoan</th>
            <th scope="col">Danh Gia</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody>
          { bookDG.length &&
          bookDG.map((e, num) => (

            <tr key={e.id}>
             
              <td>{e.login_tk}</td>
              <td>{e.star}</td>
              
             
              <td>
                 
                 
                  <Link to={"/editbook/" + e.book_id} className="btn btn-sm btn-primary">
                  View
                 </Link>
                
               
                {/* <a
                  onClick={() => deleteGioHang(e.id)}
                  className="btn btn-sm btn-danger ms-2"
                >
                  Delete
                </a> */}
                
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );}
          
};

export default ListDG;