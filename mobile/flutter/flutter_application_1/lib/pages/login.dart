import 'package:flutter/material.dart';

class LoginPage extends StatefulWidget {
  const LoginPage({super.key});

  @override
  State<LoginPage> createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {

  String _username = '';
  String _password = '';


  void alert(String text){
showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: Text(text),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('OK')
          )
        ],
      )
    );
  }

  void signIn(){
    alert('$_username - $_password');
  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Acesso'),),
      body: Column(
        children: [
          TextFormField(
            autocorrect: false,
            enableSuggestions: false,
            decoration:const InputDecoration(
              border: UnderlineInputBorder(),
              labelText: 'Login'
            ),
            onChanged: (value) => _username = value,
          ),
          TextFormField(
            obscureText: true,
            autocorrect: false,
            enableSuggestions: false,
            decoration: const InputDecoration(
              border: UnderlineInputBorder(),
              labelText: 'Senha'
            ),
            onChanged: (value) => _password = value,
          ),
          Padding(
            padding:const EdgeInsets.all(20),
            child: SizedBox(
              width: double.infinity,
              child:
              ElevatedButton.icon(
                onPressed: signIn, 
                icon: const Icon(Icons.login),
                label: const Text('Entrar'),
                )
            )
          )
        ],
      ),
    );
  }
}