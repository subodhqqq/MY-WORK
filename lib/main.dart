import 'dart:math';

import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    home: Dice(),
  ));
}

class Dice extends StatefulWidget {
  @override
  _DiceState createState() => _DiceState();
}

class _DiceState extends State<Dice> {
  int firstDice = 0;
  int secondDice = 0;

  int diceRoll() {
    Random random = Random();
    return random.nextInt(6) + 1;

    // setState(() {});
  }

  String checkValue() {
    int sum = firstDice + secondDice;
    return "$sum";
  }

  bool isVisble() {
    if (firstDice != 0 && secondDice != 0) {
      return true;
    } else {
      return false;
    }
  }

  void restart() {
    setState(() {
      firstDice = 0;
      secondDice = 0;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('subodh'),
      ),
      backgroundColor: Colors.black,
      body: Center(
        child: Row(
          mainAxisAlignment: MainAxisAlignment.start,
          children: [
            Expanded(
                child: FlatButton(
                    onPressed: () {
                      setState(() {
                        firstDice = diceRoll();
                      });
                    },
                    child: Image(
                      image: AssetImage(
                        'images/dice$firstDice.png',
                      ),
                    ))),
            Expanded(
                child: FlatButton(
                    onPressed: () {
                      setState(() {
                        secondDice = diceRoll();
                      });
                    },
                    child: Image(
                      image: AssetImage(
                        'images/dice$secondDice.png',
                      ),
                    )))
          ],
        ),
      ),
      bottomSheet: Visibility(
        visible: isVisble(),
        child: Container(
          width: MediaQuery.of(context).size.width,
          height: 200,
          color: Colors.white,
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text(
                checkValue(),
                style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
              ),
              FlatButton(
                onPressed: () {
                  restart();
                },
                child: Text(
                  'RE_START',
                  style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
                ),
                color: Colors.green,
              ),
            ],
          ),
        ),
      ),
    );
  }
}
