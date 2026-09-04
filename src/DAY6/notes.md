## Sliding Window
```int[] nums = {1, 3, -1, 3, 5, 3, 6, 7};```

```int k = 3;```
i=0 num[i]=1
currentwindow=1
DequeVaqlue=1

i=1
num[i]=3
currengtWindow=[1,3]
DequeValue=[3]
Result=[]


i=2
num[i]=-1
currengtWindow=[1,3,-1] max=3
DequeValue=[3,-1]
Result=[3]

i=3
num[i]=-3
currengtWindow=[1,3,-1,-3] max=3
DequeValue=[3,-1,-3]
Result=[3]


i=4
num[i]=5
currengtWindow=[-1,-3,5] max=5
DequeValue=[5]
Result=[3,]

i=5
num[i]=3
currengtWindow=[-3,5,3] max=5
DequeValue=[5,3]
Result[]

i=6
num[i]=6
currengtWindow=[5,3,6] max=6
DequeValue=[6]
Result=[]


i=7
num[i]=6
currengtWindow=[3,6,7] max=7
DequeValue=[6]
Result=[]
