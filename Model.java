import java.util.ArrayList;
import java.util.Scanner;

public class Model {

    ArrayList<String> room1 = new ArrayList<String>();
    ArrayList<String> room2 = new ArrayList<String>();
    ArrayList<String> room3 = new ArrayList<String>();
    ArrayList<String> room4 = new ArrayList<String>();
    ArrayList<String> room5 = new ArrayList<String>();
    ArrayList<String> room6 = new ArrayList<String>();
    ArrayList<String> room7 = new ArrayList<String>();
    ArrayList<String> room8 = new ArrayList<String>();
    ArrayList<String> room9 = new ArrayList<String>();
    ArrayList<String> room10 = new ArrayList<String>();
    ArrayList<String> room11 = new ArrayList<String>();
    ArrayList<String> room12 = new ArrayList<String>();
    ArrayList<String> room13 = new ArrayList<String>();
    ArrayList<String> room14 = new ArrayList<String>();
    ArrayList<String> room15 = new ArrayList<String>();
    ArrayList<String> room16 = new ArrayList<String>();
    String[] room = new String[16];
    double l ;
    double n ;
    double rate = l/n;
    String code;

  

    public void insert() {
        boolean isTrue = true;
        int i = 1;
        // if(code.length()==6){}
        // else {}
        String re = code.substring(0, 2);
        if (room[15] == null) {
            while (isTrue == true && i <= 16) {
                if (room[i - 1] == null) {
                    room[i - 1] = re; n++;
                    if (i == 1) {
                        room1.add(code);
                        isTrue = false;
                    } else if (i == 2) {
                        room2.add(code);
                        isTrue = false;
                    } else if (i == 3) {
                        room3.add(code);
                        isTrue = false;
                    } else if (i == 4) {
                        room4.add(code);
                        isTrue = false;
                    } else if (i == 5) {
                        room5.add(code);
                        isTrue = false;
                    } else if (i == 6) {
                        room6.add(code);
                        isTrue = false;
                    } else if (i == 7) {
                        room7.add(code);
                        isTrue = false;
                    } else if (i == 8) {
                        room8.add(code);
                        isTrue = false;
                    } else if (i == 9) {
                        room9.add(code);
                        isTrue = false;
                    } else if (i == 10) {
                        room10.add(code);
                        isTrue = false;
                    } else if (i == 11) {
                        room11.add(code);
                        isTrue = false;
                    } else if (i == 12) {
                        room12.add(code);
                        isTrue = false;
                    } else if (i == 13) {
                        room13.add(code);
                        isTrue = false;
                    } else if (i == 14) {
                        room14.add(code);
                        isTrue = false;
                    } else if (i == 15) {
                        room15.add(code);
                        isTrue = false;
                    } else if (i == 16) {
                        room16.add(code);
                        isTrue = false;
                    }

                } else if (re.equals(room[i - 1])) { n++;
                    if (i == 1) {
                        room1.add(code);
                        isTrue = false;
                    } else if (i == 2) {
                        room2.add(code);
                        isTrue = false;
                    } else if (i == 3) {
                        room3.add(code);
                        isTrue = false;
                    } else if (i == 4) {
                        room4.add(code);
                        isTrue = false;
                    } else if (i == 5) {
                        room5.add(code);
                        isTrue = false;
                    } else if (i == 6) {
                        room6.add(code);
                        isTrue = false;
                    } else if (i == 7) {
                        room7.add(code);
                        isTrue = false;
                    } else if (i == 8) {
                        room8.add(code);
                        isTrue = false;
                    } else if (i == 9) {
                        room9.add(code);
                        isTrue = false;
                    } else if (i == 10) {
                        room10.add(code);
                        isTrue = false;
                    } else if (i == 11) {
                        room11.add(code);
                        isTrue = false;
                    } else if (i == 12) {
                        room12.add(code);
                        isTrue = false;
                    } else if (i == 13) {
                        room13.add(code);
                        isTrue = false;
                    } else if (i == 14) {
                        room14.add(code);
                        isTrue = false;
                    } else if (i == 15) {
                        room15.add(code);
                        isTrue = false;
                    } else if (i == 16) {
                        room16.add(code);
                        isTrue = false;
                    }
                }
                i++;
            }
        } else { n++;
            while (isTrue == true && i <= 16) {
                if (re.equals(room[i - 1])) {
                    if (i == 1) {
                        room1.add(code);
                        isTrue = false;
                    } else if (i == 2) {
                        room2.add(code);
                        isTrue = false;
                    } else if (i == 3) {
                        room3.add(code);
                        isTrue = false;
                    } else if (i == 4) {
                        room4.add(code);
                        isTrue = false;
                    } else if (i == 5) {
                        room5.add(code);
                        isTrue = false;
                    } else if (i == 6) {
                        room6.add(code);
                        isTrue = false;
                    } else if (i == 7) {
                        room7.add(code);
                        isTrue = false;
                    } else if (i == 8) {
                        room8.add(code);
                        isTrue = false;
                    } else if (i == 9) {
                        room9.add(code);
                        isTrue = false;
                    } else if (i == 10) {
                        room10.add(code);
                        isTrue = false;
                    } else if (i == 11) {
                        room11.add(code);
                        isTrue = false;
                    } else if (i == 12) {
                        room12.add(code);
                        isTrue = false;
                    } else if (i == 13) {
                        room13.add(code);
                        isTrue = false;
                    } else if (i == 14) {
                        room14.add(code);
                        isTrue = false;
                    } else if (i == 15) {
                        room15.add(code);
                        isTrue = false;
                    } else if (i == 16) {
                        room16.add(code);
                        isTrue = false;
                    }
                } else { n++;
                    room[i - 1] = re;
                    if (i == 1) {
                        l += room1.size();
                        room1.clear();
                        room1.add(code);
                        isTrue = false;
                    } else if (i == 2) {
                        l += room2.size();
                        room2.clear();
                        room2.add(code);
                        isTrue = false;
                    } else if (i == 3) {
                        l += room3.size();
                        room3.clear();
                        room3.add(code);
                        isTrue = false;
                    } else if (i == 4) {
                        l += room4.size();
                        room4.clear();
                        room4.add(code);
                        isTrue = false;
                    } else if (i == 5) {
                        l += room5.size();
                        room5.clear();
                        room5.add(code);
                        isTrue = false;
                    } else if (i == 6) {
                        l += room6.size();
                        room6.clear();
                        room6.add(code);
                        isTrue = false;
                    } else if (i == 7) {
                        l += room7.size();
                        room7.clear();
                        room7.add(code);
                        isTrue = false;
                    } else if (i == 8) {
                        l += room8.size();
                        room8.clear();
                        room8.add(code);
                        isTrue = false;
                    } else if (i == 9) {
                        l += room9.size();
                        room9.clear();
                        room9.add(code);
                        isTrue = false;
                    } else if (i == 10) {
                        l += room10.size();
                        room10.clear();
                        room10.add(code);
                        isTrue = false;
                    } else if (i == 11) {
                        l += room11.size();
                        room11.clear();
                        room11.add(code);
                        isTrue = false;
                    } else if (i == 12) {
                        l += room12.size();
                        room12.clear();
                        room12.add(code);
                        isTrue = false;
                    } else if (i == 13) {
                        l += room13.size();
                        room13.clear();
                        room13.add(code);
                        isTrue = false;
                    } else if (i == 14) {
                        l += room14.size();
                        room14.clear();
                        room14.add(code);
                        isTrue = false;
                    } else if (i == 15) {
                        l += room15.size();
                        room15.clear();
                        room15.add(code);
                        isTrue = false;
                    } else if (i == 16) {
                        l += room16.size();
                        room16.clear();
                        room16.add(code);
                        isTrue = false;
                    }

                }
                i++;
            }

        }

    }


    public ArrayList<String> getRoom1() {
        return room1;
    }

    public void setRoom1(ArrayList<String> room1) {
        this.room1 = room1;
    }

    public ArrayList<String> getRoom2() {
        return room2;
    }

    public void setRoom2(ArrayList<String> room2) {
        this.room2 = room2;
    }

    public ArrayList<String> getRoom3() {
        return room3;
    }

    public void setRoom3(ArrayList<String> room3) {
        this.room3 = room3;
    }

    public ArrayList<String> getRoom4() {
        return room4;
    }

    public void setRoom4(ArrayList<String> room4) {
        this.room4 = room4;
    }

    public ArrayList<String> getRoom5() {
        return room5;
    }

    public void setRoom5(ArrayList<String> room5) {
        this.room5 = room5;
    }

    public ArrayList<String> getRoom6() {
        return room6;
    }

    public void setRoom6(ArrayList<String> room6) {
        this.room6 = room6;
    }

    public ArrayList<String> getRoom7() {
        return room7;
    }

    public void setRoom7(ArrayList<String> room7) {
        this.room7 = room7;
    }

    public ArrayList<String> getRoom8() {
        return room8;
    }

    public void setRoom8(ArrayList<String> room8) {
        this.room8 = room8;
    }

    public double getL() {
        return l;
    }


    public void setL(double l) {
        this.l = l;
    }


    public void setN(double n) {
        this.n = n;
    }


    public ArrayList<String> getRoom9() {
        return room9;
    }

    public void setRoom9(ArrayList<String> room9) {
        this.room9 = room9;
    }

    public ArrayList<String> getRoom10() {
        return room10;
    }

    public void setRoom10(ArrayList<String> room10) {
        this.room10 = room10;
    }

    public ArrayList<String> getRoom11() {
        return room11;
    }

    public void setRoom11(ArrayList<String> room11) {
        this.room11 = room11;
    }

    public ArrayList<String> getRoom12() {
        return room12;
    }

    public void setRoom12(ArrayList<String> room12) {
        this.room12 = room12;
    }

    public ArrayList<String> getRoom13() {
        return room13;
    }

    public void setRoom13(ArrayList<String> room13) {
        this.room13 = room13;
    }

    public ArrayList<String> getRoom14() {
        return room14;
    }

    public void setRoom14(ArrayList<String> room14) {
        this.room14 = room14;
    }

    public ArrayList<String> getRoom15() {
        return room15;
    }

    public void setRoom15(ArrayList<String> room15) {
        this.room15 = room15;
    }

    public ArrayList<String> getRoom16() {
        return room16;
    }

    public void setRoom16(ArrayList<String> room16) {
        this.room16 = room16;
    }

    public String[] getRoom() {
        return room;
    }

    public void setRoom(String[] room) {
        this.room = room;
    }

    public double getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
