# Winter-2026-CS-Training
《2026年寒假计算机进阶学习个人计划书（Java核心与ICPC双修版）》
这份计划的核心逻辑是：以 ICPC 国银为第一战略目标，同时以“底层原理”视角切入 Java，放弃速成框架，专攻阿里/美团校招最看重的 Java 基础（源码、并发、JVM）。
________________________________________
2026年寒假计算机进阶学习个人计划书
（Java 核心原理与 ICPC 双修版）
目标： 打造“ICPC 算法大脑” + “Java 扎实内功”，精准对标阿里/美团/国有银行的高门槛校招要求。
一、 核心发展愿景
本计划利用寒假 8 周时间，拒绝肤浅的“API 搬运工”式学习，将 Java 当作一门科学来研究。
•	第一战场（生存之本）： C++ 算法竞赛。保持 50% 以上精力投入，确保 Codeforces/AtCoder 训练强度，为大二冲银积累势能。
•	第二战场（就业护城河）： Java Core (核心)。跳过 Spring Boot 业务开发，直接攻克 集合源码、并发编程 (JUC)、JVM 内存模型。这是阿里 P5/P6 面试的必考题。
•	工具与辅助： Python + AI。作为算法对拍工具和效率提升助手。
•	寒假产出： 一套手写的 Java 核心数据结构源码注释库 + 一个多线程实战项目。
二、 每日高效作息表 (阿里向·硬核版)
时间段	阶段任务	关键产出与学习逻辑
08:30 - 11:30	Java 核心与源码剖析	产出： JDK 源码注释笔记 / 单元测试<br>重点： 像读算法题一样读 JDK 源码。<br>1. 集合： HashMap, ArrayList, LinkedList 底层实现（扩容、红黑树转换）。<br>2. 特性： 泛型擦除、反射机制（Reflection）、Lambda 与 Stream 流。
11:30 - 13:00	午休与放松	脑力重启。
13:00 - 16:30	ICPC 专项训练 (C++)	产出： Codeforces 补题记录<br>重点： 雷打不动的主线任务。<br>使用 C++ 进行训练，保持对指针和内存的极致敏感。这与上午学 Java 并不冲突，反而能让你更理解 Java 为什么“慢”以及它是如何封装内存管理的。
16:30 - 18:00	Java 并发编程 (JUC)	产出： 多线程 Demo<br>重点： 这是进阿里的入场券。<br>学习 Thread, Runnable, synchronized, volatile 关键字。尝试手写一个“生产者-消费者”模型。
18:00 - 20:30	Java 纯工程实战	产出： "High-Performance Crawler" (多线程爬虫)<br>重点： 不做网页，做工具。开发一个多线程文件下载器或网页爬虫。<br>目标：遇到死锁、线程安全问题并解决它。
21:00 - 23:00	JVM 与 理论复盘	产出： 技术博客<br>重点： 阅读《深入理解 Java 虚拟机》(周志明) 的前两章（内存区域、GC 算法）。理解“栈溢出”和“内存泄漏”的原理。
三、 阶段性里程碑规划
第一阶段：Java 语法迁移与对象思维（第 1 - 2 周）
•	目标： 从 C++ 过程式思维切换到 Java 面向对象思维。
•	重点：
o	彻底理解 Interface (接口) 与 Abstract Class 的设计哲学。
o	反射 (Reflection)： 这是 Java 框架的基石，写一个“通过类名字符串创建对象”的 Demo。
o	实战： 用 Java 重写 10 道你最熟悉的 LeetCode 简单题，熟悉语法糖。
第二阶段：攻克 JDK 源码与数据结构（第 3 - 5 周）
•	目标： 能在面试官面前手写 HashMap 核心逻辑。
•	重点 (阿里必问)：
o	HashMap： hash() 扰动函数的设计、负载因子 0.75 的含义、链表转红黑树的阈值(8)。
o	ArrayList vs LinkedList： 内存布局的区别（CPU 缓存友好性）。
o	并发容器： ConcurrentHashMap 如何实现分段锁（Java 7）或 CAS + Synchronized（Java 8）。
•	动作： 在 IDEA 里打开 JDK 源码，逐行打断点调试，写上中文注释。
第三阶段：多线程与工程落地（第 6 - 8 周）
•	目标： 掌握多线程编程，完成实战项目。
•	重点：
o	线程池： ThreadPoolExecutor 的 7 个参数详解（核心线程数、最大线程数、拒绝策略等）。
o	锁机制： 理解 CAS (Compare and Swap) 和 AQS (AbstractQueuedSynchronizer) 的基本概念。
•	项目交付： “极简版多线程网络爬虫/下载器”
o	功能：读取 URL 列表，启动 N 个线程并发下载，支持断点续传，将结果存入文件。
o	技术点：ExecutorService (线程池), BIO/NIO (IO流), BlockingQueue (阻塞队列)。
四、 核心学习原则 (Code of Conduct)
1.	源码至上 (Read the Fucking Source Code)：
o	遇到不懂的 Java API，不要百度，按住 Ctrl 点进去看源码。这是区分“码农”和“工程师”的分水岭。
2.	C++ 为体，Java 为用：
o	当学到 Java 的引用（Reference）时，回想 C++ 的指针。
o	当学到 JVM 垃圾回收时，回想 C++ 的析构函数和内存泄漏。
o	利用 C++ 的底层视角去降维打击 Java 的学习难度。
3.	不碰 GUI 和 Web：
o	严禁学习 Swing, JavaFX, JSP, Servlet。这些是时代的眼泪，浪费时间。
o	暂时不学 Spring Boot，先把 Java 语言本身学透。
五、 预期成果清单
1.	算法硬实力： Codeforces 题量增加 100+，保持手感。
2.	Java 内功： 输出一份包含 1000+ 行注释的 JDK 源码阅读笔记（HashMap, ArrayList, ThreadPool）。
3.	实战项目： 一个基于 Java SE 开发的 Multi-threaded Data Processor（多线程数据处理工具），上传 GitHub。
4.	面试准备： 能够自信回答：“为什么 HashMap 线程不安全？”、“Java 线程和 OS 线程是什么关系？”。
六、 常用资源推荐
•	书籍（电子版/纸质）：
o	《Java 核心技术 卷 I》 (Core Java) —— 也就是著名的“红皮书”，当字典查。
o	《深入理解 Java 虚拟机》 (周志明) —— 读第 2 章（Java 内存区域）和第 3 章（垃圾收集器）。
•	IDE： IntelliJ IDEA (Community 或 Ultimate 均可，学生可免费申请 Ultimate)。
•	AI 提示词 (Prompt)：
o	“我是 C++ 选手，请解释 Java 中的 Virtual Machine Stack 和 C++ 的栈有什么区别？”
o	“请解释 volatile 关键字在 CPU 缓存一致性协议（MESI）层面的作用。”


基于你**“ICPC 银牌目标”** + “讨厌死记硬背/培训班味” + “追求底层逻辑” 的特质，我为你重新清洗了一遍 B 站关注列表。
这份名单里的 UP 主，都是**“学院派”或“硬核工程派”**，讲究逻辑推导，不说废话。
最后建议：
学习不是刷视频。 视频是当你卡住时的“解说员”，真正的进步发生在你关掉视频、打开 IDE 自己敲代码的那一刻。
《2026年寒假计算机进阶“精湛版”个人计划书》
核心哲学： 扎牢 CS61B 数据结构地基，保持 ICPC 竞技手感。拒绝 API 搬运，死磕内存模型。
一、 核心战场定义
第一战场（内功心法）：Java - CS61B (Berkeley SP21)
目标：彻底理解 Java 内存机制、多态与接口的设计哲学、手动实现所有标准数据结构。
要求：完成所有 Lab 和 Project（尤其是 Project 1a/1b/2），必须通过全部测试用例（Autograder/Unit Tests）。
第二战场（招式演练）：C++ - ICPC 专项训练
目标：CF Rating 稳定在 1400-1600 区间，冲刺银牌所需的思维构造能力。
要求：坚持 Google 风格 C++（无 using namespace std;），每日攻克 1-2 道进阶题。
二、 每日高能执行表（办公室/图书馆版）
时间段	模块	具体任务与学习逻辑
08:30 - 11:30	CS61B 深度学习	看 Lecture + 做 Lab。画 Box-and-Pointer 图，理解引用（Reference）在堆栈中的流转。
11:30 - 13:00	脑力重启	午餐、午休，严禁看电子屏幕。
13:00 - 16:30	CS61B 编码实战	攻克 Project。手写 Deque (双端队列)、实现接口、学习 JUnit 单元测试。这是大厂最看重的工程素养。
16:30 - 18:30	ICPC C++ 训练	CF 进阶刷题（1300-1500 分段）。主攻：二分答案、前缀和、贪心构造。保持 C++ 极致性能感。
19:30 - 21:30	归纳与存档	复盘与 GitHub 管理。整理当日笔记，把 CS61B 的实现代码 Push 到私有/公有库，写 README 总结。
21:30 - 22:30	预习与放松	浏览下一节 Lecture 的题目，或者看一眼《深入理解计算机系统》（CSAPP）。
三、 阶段性里程碑（7周规划）
第一阶段：Java 内存与链式逻辑（第 1 - 2 周）
CS61B 进度：完成 Lecture 1-6。
核心攻坚：SLList, DLList (哨兵节点), 数组（AList）。
关键交付：Project 1A (LinkedListDeque & ArrayDeque)。
ICPC 进度：掌握排序、二分、双指针。
第二阶段：继承、多态与泛型（第 3 - 4 周）
CS61B 进度：完成 Lecture 7-12。
核心攻坚：接口（Interface）、类型检查（Casting）、高阶函数、泛型（Generics）。
关键交付：Project 1B (Hoops/Deque Tests)。理解代码的“复用性”与“测试覆盖率”。
ICPC 进度：掌握简单 DP、前缀和、差分、单调栈/队列。
第三阶段：树、哈希与进阶数据结构（第 5 - 7 周）
CS61B 进度：完成 Lecture 13-20。
核心攻坚：BST（二叉搜索树）、2-3 Tree (B-Tree)、Hash Tables、Heap (Priority Queue)。
关键交付：Project 2 (Gitlet - 简易版 Git)。这是 CS61B 的巅峰，能做出来，你的 Java 功底直接超越同龄人一个段位。
ICPC 进度：树形 DP、贪心进阶、简单图论（BFS/DFS）。
四、 核心原则 (Code of Conduct)
内存为王：遇到任何 Bug，先别改代码。先拿一张纸，画出内存中对象的指向。画不出来，就说明没理解。
不走捷径：绝对不看别人的作业源码（Skeleton 除外）。CS61B 的价值在于你被 Bug 虐的那 10 个小时。
大厂风格：
Java 严格遵循驼峰命名，写清晰的 Javadoc 注释。
C++ 严格禁用 using namespace std;，使用显式 std::。
所有代码必须通过单元测试（Unit Test），而不是简单的 print。
GitHub 轨迹：每天的 Commit 信息要有意义。例如 feat: implement resize logic for ArrayDeque。
