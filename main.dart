import 'dart:ffi';

import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    home: Businesscard(),
  ));
}

class Businesscard extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.teal,
      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          CircleAvatar(
            radius: 200,
            backgroundImage: AssetImage('assets/subodh.jpg'),
          ),
          SizedBox(
            height: 5,
          ),
          Text(
            'Subodh shrestha',
            style: TextStyle(color: Colors.black, fontSize: 40.0),
          ),
          Text(
            'flutter developer',
            style: TextStyle(color: Colors.black, fontSize: 40.0),
          ),
          Container(
            padding: EdgeInsets.all(10),
            child: Row(
              children: [
                Icon(
                  Icons.email,
                  color: Colors.black,
                  size: 30,
                ),
                Text('subodh31@gmail.com',
                    style: TextStyle(color: Colors.black, fontSize: 20.0)),
              ],
            ),
          ),
          Container(
            padding: EdgeInsets.all(10),
            child: Row(
              children: [
                Icon(
                  Icons.phone,
                  color: Colors.black,
                  size: 30,
                ),
                Text('+9779869123401',
                    style: TextStyle(color: Colors.black, fontSize: 20.0)),
              ],
            ),
          ),
          Container(
            padding: EdgeInsets.all(10),
            child: Row(
              children: [
                Icon(
                  Icons.gps_fixed,
                  color: Colors.black,
                  size: 30,
                ),
                Text('dhading,nepal',
                    style: TextStyle(color: Colors.black, fontSize: 20.0)),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
