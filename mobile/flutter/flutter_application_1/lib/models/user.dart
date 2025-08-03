class User {
  int? id;
  String name;
  String username;
  String? password;
  String? token;
  
  User(
      this.id,
      this.name,
      this.username,
      this.password,
      this.token
  );

  User.fromObject(dynamic obj) 
  : id = obj['id'],
    name = obj['name'],
    username = obj['username'],
    password = null,
    token = obj['token'];

  dynamic toObject()
  {
    return {
      'id': id,
      'name': name,
      'username': username,
      'password': password,
       'token': token
    };
  }
  
}