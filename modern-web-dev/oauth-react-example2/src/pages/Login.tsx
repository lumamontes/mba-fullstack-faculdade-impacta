

const githubid = process.env.REACT_APP_CLIENT_ID
const githubUrl = `https://github.com/login/oauth/authorize?client_id=${githubid}&scope=user`

export default function Login(){
  function signInGithub(){
    window.open(githubUrl, '_self')
  }
  return (
    <div>
      <h1>Login</h1>
      <button onClick={signInGithub}>Entrar com github</button>
    </div>
  )
}