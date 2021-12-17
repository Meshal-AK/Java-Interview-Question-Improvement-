/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.openjdk.jmh.annotations.Benchmark;

public class MyBenchmark {

    private static int[] A = new Random().ints(10000, 10, 100).toArray();

    @Benchmark
    public static int solution() {
        int[] tempA = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            tempA[i] = get(A[i]);
        }

        int max = 0;
        int maxCount = 0;

        for (int i = 0; i < tempA.length; i++) {
            for (int j = 1; j < tempA.length; j++) {
                if (tempA[j] == tempA[i] && i != j) {
                    max = A[j] + A[i];
                }
            }
            maxCount = Math.max(maxCount, max);
        }
        return maxCount;
    }

    public static int get(int number) {
        int sum = 0;

        LinkedList<Integer> stack = new LinkedList<>();
        while (number > 0) {
            stack.push(number % 10);
            number = number / 10;
        }

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    @Benchmark
    public static int solution2() {
        int Alength = A.length;
        int[] tempA = new int[Alength];
        int arrLlength = 19;
        int max = 0;

        for (int i = 0; i < Alength; i++) {
            arrLlength = Math.max(arrLlength, (9 * stringSize(A[i])) + 1);
            tempA[i] = get(A[i]);
        }

        ArrayList<Integer>[] arrL = new ArrayList[arrLlength];

        for (int i = 0; i < arrLlength; i++) {
            arrL[i] = new ArrayList<>();
        }

        for (int i = 0; i < Alength; i++) {
            arrL[tempA[i]].add(A[i]);
        }

        for (int i = 0; i < arrLlength; i++) {
            int arrLSize = arrL[i].size();

            if (arrLSize > 1) {
                max = Math.max(max, largestPairSum(arrL[i], arrLSize));
            }

        }
        return max;
    }

    private static int largestPairSum(ArrayList<Integer> arr, int n) {
        int j = 1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i != j) {
                int sum = arr.get(j) + arr.get(i);
                if (sum > max) {
                    max = sum;
                    if (arr.get(j) < arr.get(i)) {
                        j = i;
                    }
                }
            }

        }
        return max;
    }

    static final int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };

    // Requires positive x
    private static int stringSize(int x) {
        for (int i = 0;; i++)
            if (x <= sizeTable[i])
                return i + 1;
    }
}
