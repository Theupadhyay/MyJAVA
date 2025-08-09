class Queue {
        private int front, rear, capacity;
        private int queue[];

        Queue(int c) {
            front = rear = 0;
            capacity = c;
            queue = new int[capacity];
        }

        void queueEnqueue(int data) {
            if (capacity == rear) {
                System.out.println("\nQueue is full");
                return;
            } else {
                queue[rear] = data;
                rear++;
            }
        }

        void queueDequeue() {
            if (front == rear) {
                System.out.println("\nQueue is empty");
                return;
            } else {
                for (int i = 0; i < rear - 1; i++) {
                    queue[i] = queue[i + 1];
                }
                rear--;
            }
        }

        void queueDisplay() {
            if (front == rear) {
                System.out.println("\nQueue is Empty");
                return;
            }

            for (int i = front; i < rear; i++) {
                System.out.printf(" %d <-- ", queue[i]);
            }
        }

        void queueFront() {
            if (front == rear) {
                System.out.println("\nQueue is Empty");
                return;
            }
            System.out.printf("\nFront Element is: %d", queue[front]);
        }
    }

     class StaticQueueinjava {
        public static void main(String[] args) {
            Queue q = new Queue(4);
            q.queueDisplay();
            q.queueEnqueue(20);
            q.queueEnqueue(30);
            q.queueEnqueue(40);
            q.queueEnqueue(50);
            q.queueDisplay();
            q.queueEnqueue(60);
            q.queueDisplay();
            q.queueDequeue();
            q.queueDequeue();
            System.out.println("\n\nAfter two node deletions\n");
            q.queueDisplay();
            q.queueFront();
        }
    }