public class Rainbow {
    private String k = "krasniy";
    private String o = "orange";
    private String zh = "zheltiy";
    private String z = "zeleniy";
    private String gl = "goluboi";
    private String s = "siniy";
    private String f = "fioletoviy";
    private String num;
    private float n;
    private int nom;

    public void setNum(String num) {
        this.num = num;
        n = Float.parseFloat(num + "F");
        nom = (int) (n * 10);
    }

    public float getNum() {
        if (nom % 10 == 0 && nom < 78 && nom > 0) {
            if (nom == 10) {
                System.out.println(k);
            } else if (nom == 20) {
                System.out.println(o);
            } else if (nom == 30) {
                System.out.println(zh);
            } else if (nom == 40) {
                System.out.println(z);
            } else if (nom == 50) {
                System.out.println(gl);
            } else if (nom == 60) {
                System.out.println(s);
            } else if (nom == 70) {
                System.out.println(f);
            }
        } else if (nom % 10 == 1 && nom < 78 && nom > 0) {
                if (nom < 10) {
                    System.out.println(k);
                } else if (nom < 20) {
                    System.out.println(k + k);
                } else if (nom < 30) {
                    System.out.println(o + k);
                } else if (nom < 40) {
                    System.out.println(zh + k);
                } else if (nom < 50) {
                    System.out.println(z + k);
                } else if (nom < 60) {
                    System.out.println(gl + k);
                } else if (nom < 70) {
                    System.out.println(s + k);
                } else if (nom < 80) {
                    System.out.println(f + k);
                }
            } else if (nom % 10 == 2 && nom < 78 && nom > 0) {
                    if (nom < 10) {
                        System.out.println(o);
                    } else if (nom < 20) {
                        System.out.println(k + o);
                    } else if (nom < 30) {
                        System.out.println(o + o);
                    } else if (nom < 40) {
                        System.out.println(zh + o);
                    } else if (nom < 50) {
                        System.out.println(z + o);
                    } else if (nom < 60) {
                        System.out.println(gl + o);
                    } else if (nom < 70) {
                        System.out.println(s + o);
                    } else if (nom < 80) {
                        System.out.println(f + o);
                    }
                } else if (nom % 10 == 3 && nom < 78 && nom > 0) {
            if (nom < 10) {
                System.out.println(zh);
            } else if (nom < 20) {
                System.out.println(k + zh);
            } else if (nom < 30) {
                System.out.println(o + zh);
            } else if (nom < 40) {
                System.out.println(zh + zh);
            } else if (nom < 50) {
                System.out.println(z + zh);
            } else if (nom < 60) {
                System.out.println(gl + zh);
            } else if (nom < 70) {
                System.out.println(s + zh);
            } else if (nom < 80) {
                System.out.println(f + zh);
            }

        } else if (nom % 10 == 4 && nom < 78 && nom > 0) {
            if (nom < 10) {
                System.out.println(z);
            } else if (nom < 20) {
                System.out.println(k + z);
            } else if (nom < 30) {
                System.out.println(o + z);
            } else if (nom < 40) {
                System.out.println(zh + z);
            } else if (nom < 50) {
                System.out.println(z + z);
            } else if (nom < 60) {
                System.out.println(gl + z);
            } else if (nom < 70) {
                System.out.println(s + z);
            } else if (nom < 80) {
                System.out.println(f + z);
            }

        }else if (nom % 10 == 5 && nom < 78 && nom > 0) {
            if (nom < 10) {
                System.out.println(gl);
            } else if (nom < 20) {
                System.out.println(k + gl);
            } else if (nom < 30) {
                System.out.println(o + gl);
            } else if (nom < 40) {
                System.out.println(zh + gl);
            } else if (nom < 50) {
                System.out.println(z + gl);
            } else if (nom < 60) {
                System.out.println(gl + gl);
            } else if (nom < 70) {
                System.out.println(s + gl);
            } else if (nom < 80) {
                System.out.println(f + gl);
            }
    }else if (nom % 10 == 6 && nom < 78 && nom > 0) {
            if (nom < 10) {
                System.out.println(s);
            } else if (nom < 20) {
                System.out.println(k + s);
            } else if (nom < 30) {
                System.out.println(o + s);
            } else if (nom < 40) {
                System.out.println(zh + s);
            } else if (nom < 50) {
                System.out.println(z + s);
            } else if (nom < 60) {
                System.out.println(gl + s);
            } else if (nom < 70) {
                System.out.println(s + s);
            } else if (nom < 80) {
                System.out.println(f + s);
            }
        }else if (nom % 10 == 7 && nom < 78 && nom > 0) {
            if (nom < 10) {
                System.out.println(f);
            } else if (nom < 20) {
                System.out.println(k + f);
            } else if (nom < 30) {
                System.out.println(o + f);
            } else if (nom < 40) {
                System.out.println(zh + f);
            } else if (nom < 50) {
                System.out.println(z + f);
            } else if (nom < 60) {
                System.out.println(gl + f);
            } else if (nom < 70) {
                System.out.println(s + f);
            } else if (nom < 80) {
                System.out.println(f + f);
            }
        } else {
            System.out.println("wrong");
        }
        return Float.valueOf(num);
    }
}