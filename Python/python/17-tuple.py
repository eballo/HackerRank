
if __name__ == '__main__':
    n = int(input())
    tuple_value = tuple([int(x) for x in input().split()])
    result_hash = hash(tuple_value)
    print(result_hash)