def merge(list1, list2):
      """
  Merge two sorted lists.

  Args:
    list1: The first sorted list.
    list2: The second sorted list.

  Returns:
    A merged list of the two sorted lists.
  """

  merged_list = []
  i = 0
  j = 0
  while i < len(list1) and j < len(list2):
    if list1[i] < list2[j]:
      merged_list.append(list1[i])
      i += 1
    else:
      merged_list.append(list2[j])
      j += 1

  if i < len(list1):
    merged_list.extend(list1[i:])
  else:
    merged_list.extend(list2[j:])

  return merged_list


def main():
  list1 = [1, 3, 5, 7]
  list2 = [2, 4, 6, 8]
  merged_list = merge(list1, list2)
  print(merged_list)


if __name__ == "__main__":
  main()