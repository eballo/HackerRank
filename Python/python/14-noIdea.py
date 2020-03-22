if __name__ == '__main__':

    (n, m) = map(int, input().split())

    # array = set(map(int, input().split())) -- not performing
    array = list(map(int, input().split()))
    assert len(array) == n

    a = set(map(int, input().split()))
    b = set(map(int, input().split()))
    assert len(a) == m
    assert len(b) == m

    # Old solution not performing:
    #intersection_a = (len(array.intersection(a)))
    #intersection_b = (len(array.intersection(b)))
    #result = intersection_a - intersection_b

    result = 0

    for i in array:
        if i in a:
            result += 1
        elif i in b:
            result -= 1

    print(result)
