def count_substring(string, sub_string):
    total = 0
    len_sub = len(sub_string)
    for i in range(len(string) - len_sub + 1):
        if string[i:i + len_sub] == sub_string:
            total += 1
    return total


if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()

    count = count_substring(string, sub_string)
    print(count)