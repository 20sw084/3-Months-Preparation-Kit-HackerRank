#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'formingMagicSquare' function below.
#
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY s as parameter.
#

def rotate_by_90(mat):
    new_mat = [[0, 0, 0] for i in range(3)]
    i = 0
    while i < 3:
        j = 0
        while j < 3:
            new_mat[i][j] = mat[2 - j][i]
            j += 1
        i += 1
    return new_mat


def reflect_mat(mat):
    new_mat = [[0, 0, 0] for i in range(3)]
    i = 0
    while i < 3:
        j = 0
        while j < 3:
            new_mat[i][j] = mat[i][2 - j]
            j += 1
        i += 1
    return new_mat


def changes(mat1, mat2):
    i = 0
    change = 0
    while i < 3:
        j = 0
        while j < 3:
            change += abs(mat1[i][j] - mat2[i][j])
            j += 1
        i += 1
    return change


def formingMagicSquare(s):
    matrix = [[4, 3, 8], [9, 5, 1], [2, 7, 6]]
    change = []
    for i in range(4):
        change.append(changes(s, matrix))
        ref = reflect_mat(matrix)
        change.append(changes(s, ref))
        matrix = rotate_by_90(matrix)
    return min(change)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = []

    for _ in range(3):
        s.append(list(map(int, input().rstrip().split())))

    result = formingMagicSquare(s)

    fptr.write(str(result) + '\n')

    fptr.close()
