import React, { useEffect } from 'react';
import { useLocation } from 'react-router-dom';

const githubId = process.env.REACT_APP_CLIENT_ID
const githubSecret = process.env.REACT_APP_CLIENT_SECRET
const url = 'https://github.com/login/oauth/access_token'

export default function Callback(){

  const location = useLocation()
  const query = new URLSearchParams(location.search)
  const code = query.get('code')

  async function fetchToken(code: string){
    await fetch(url, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        'Accept': 'application/json'
      },
      body: JSON.stringify({
        client_id: githubId,
        client_secret: githubSecret,
        code: code
      })
    })
  }

  if(code){
    fetchToken(code)
  }
  return (
    <div>
      <h1>Retorno do código</h1>
      <button>{code}</button>
    </div>
  )
}