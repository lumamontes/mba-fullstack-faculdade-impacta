import 'dart:convert';

import 'package:flutter_application_1/models/user.dart';
import 'package:http/http.dart' as http;
class AuthService {
  final String _baseUrl = 'http://localhost/auth/login';
  
  Future<User> login(String username, String password) async {
    http.post(
      Uri.parse(_baseUrl),
      headers: {
        'Content-type': 'application/json; charset=UTF-8'
      },
      body: jsonEncode({
        'username': username,
        'password': password
      })
    );
  }
}