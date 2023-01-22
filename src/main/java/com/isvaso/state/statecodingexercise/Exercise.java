package com.isvaso.state.statecodingexercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum State {
    LOCKED("LOCKED"),
    OPEN("OPEN"),
    ERROR("ERROR");

    String value;

    State(String text) {
        this.value = text;
    }
}

class CombinationLock
{
    private int [] combination;
    public String status;
    private int count;

    public CombinationLock(int[] combination)
    {
        this.combination = combination;
        status = State.LOCKED.value;
        count = 0;
    }

    public void enterDigit(int digit)
    {
        count++;

        if (count == 1){
            status = "" + digit;
        } else if (count < combination.length){
            status = status + "" + digit;
        }

        if (count == combination.length) {
            status = status + "" + digit;
            StringBuilder pass = new StringBuilder("");

            for (int a : combination)
                pass.append(a);

            System.out.println(status + " " + pass.toString());
            if (status.equals(pass.toString()))
                status = State.OPEN.value;
            else
                status = State.ERROR.value;
        }
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        CombinationLock cl = new CombinationLock(new int[]{1, 2, 3, 4});

        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));

        boolean isAll = true;

        do {
            System.out.println("Status: "
                    + cl.status
                    + System.lineSeparator()
                    + "Enter number: ");
            cl.enterDigit(Integer.parseInt(bufferedReader.readLine()));
            if (cl.status.equals(State.ERROR.value)
                    || cl.status.equals(State.OPEN.value))
                isAll = false;
        } while (isAll);

        System.out.println(cl.status);
    }
}
