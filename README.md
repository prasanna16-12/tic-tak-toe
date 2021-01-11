# **CLI tic tak toe game usinf java**
This game allows 2 players to play along with winner detection algorithm

***
## **start**
![g1](https://user-images.githubusercontent.com/57058371/104184670-d0ed1700-5439-11eb-8828-cb12fcfeb85d.jpg)
***
## **guide to play**
![g2](https://user-images.githubusercontent.com/57058371/104185092-7c966700-543a-11eb-8af3-6abb7b394986.jpg)
***
## **winner detection**
![g5](https://user-images.githubusercontent.com/57058371/104185239-b7989a80-543a-11eb-92d9-deaa98ab284c.jpg)
***
## **Winner detection algorithm**

```java
// OX is 2D array (3x3)
private char CheackWinner(){
        if(OX[0] == OX[1] && OX[1] == OX[2] && OX[0] != '-'){
            return OX[0];
        }
        else{
            if(OX[0] == OX[3] && OX[3] == OX[6] && OX[0] != '-'){
                return OX[0];
            }
            else{
                if(OX[6] == OX[7] && OX[7] == OX[8] && OX[6] != '-'){
                    return OX[6];
                }
                else{
                    if(OX[2] == OX[5] && OX[5] == OX[8] && OX[2] != '-'){
                        return OX[2];
                    }
                    else{
                        if(OX[0] == OX[4] && OX[4] == OX[8] && OX[0] != '-'){
                            return OX[0];
                        }
                        else{
                            if(OX[2] == OX[4] && OX[4] == OX[6] && OX[2] != '-'){
                                return OX[2];
                            }
                            else{
                                if(OX[1] == OX[4] && OX[4] == OX[7] && OX[1] != '-'){
                                    return OX[1];
                                }
                                else{
                                    if(OX[3] == OX[4] && OX[4] == OX[5] && OX[3] != '-'){
                                        return OX[3];
                                    }
                                    else{
                                        return '-'; 
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
```
