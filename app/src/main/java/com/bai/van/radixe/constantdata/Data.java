package com.bai.van.radixe.constantdata;

import android.util.Log;

import com.bai.van.radixe.userdata.LoginData;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class Data {
    public static HashMap<String, String[]> PRIME_TYPE = new HashMap<>();

    private static String primeTypeJson = "{\"data\" : [\n" +
            "[\"中美文化面面观\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"初级德语\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"初级泰语\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"俄罗斯语言与文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"英美名诗鉴赏\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"通过电影学英语\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"基础德语\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"实用翻译技能\",\"人文科学类\",\"创新创业与能力提升\"],\n" +
            "[\"国际商务谈判\",\"人文科学类\",\"创新创业与能力提升\"],\n" +
            "[\"泰国语言与文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"实用日本语入门\",\"人文科学类\",\"创新创业与能力提升\"],\n" +
            "[\"导游英语\",\"人文科学类\",\"创新创业与能力提升\"],\n" +
            "[\"西方美术简史及作品欣赏\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"艺术与认知心理\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"环境教育\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"中国茶文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"《四书》解读\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"孔子的智慧--《论语》讲义\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"晚清人物与社会\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"民国人物评鉴\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"地图上的中国历史\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"中国传统文化与社会\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"先秦历史与文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"茶与茶文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"中国区域历史地理\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"元明清史事选讲\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"现当代非洲历史与文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"英文西方历史文化选读\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"科幻电影中的科技和文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"云南民族民间美术赏析\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"中国的智慧\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"全球化与国际经济课程\",\"人文科学类\",\"创新创业与能力提升\"],\n" +
            "[\"中国围棋文化史\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"茶艺与茶文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"中国民俗文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"叙事与生活\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"云南少数民族服饰文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"大众人类学\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"人类学的应用与实践\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"云南宗教文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"哲学与人生\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"美国电视剧与大众文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"日本历史与文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"中外纪录电影讲评\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"古希腊文明\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"中国历史地理概况\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"乡村发展与治理\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"中外服饰发展史\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"艺术与人文基础\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"自然文学与回归生态\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"中国少数民族文化\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"外国工艺美术史\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"幸福在哪里\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"感悟考古\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"人类与生态文明\",\"人文科学类\",\"人文素养与现代文明\"],\n" +
            "[\"教育心理学\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"经济法律制度与经典案例\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"毒品危害与艾滋病预防\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"证券法律与生活\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"国际投资法律实务\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"中华法制文明史\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"文献管理与信息分析\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"节能的经济和社会机制\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"民族文化与边疆治理\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"贵金属投资与欣赏\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"个人理财\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"国际经济专题\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"绿色情商\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"参与式社会调查方法实训\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"网络伦理与法制\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"大脑意识与行为记忆\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"世界民族问题\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"世界军事\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"清代宫廷制度与政治变迁\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"欧洲一体化史\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"心理学与生活\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"品牌形象策划\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"农村发展理论与实践\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"国际货币体系与金融危机\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"中国与东盟经贸关系\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"社交礼仪\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"国际贸易\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"管理经济学原理与应用\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"跨文化管理\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"互联网时代的企业战略规划\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"互联网经济与商业模式创新\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"语言表达技巧\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"当代中国社会问题分析\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"国际金融\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"宏观经济学\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"微观经济学\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"国学与现代管理\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"心理学和生活\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"国际法与国际热点问题\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"非洲政治与中非关系\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"世界大学发展史\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"管理伦理\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"旅游地理学\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"探索心理学的奥秘\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"远离犯罪的人生\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"合同法\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"大学生创业法律实务基础\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"中国传统法律文化\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"诉讼的基本知识\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"法律与社会:经典案例解读\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"房地产法与生活\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"欧洲法文化\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"婚姻家庭法律制度与实务\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"知识产权法\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"劳动合同实务\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"怎样打官司\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"国内外热点问题透视\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"自我与社会心理\",\"社会科学类\",\"社会发展与行为科学\"],\n" +
            "[\"电子商务\",\"社会科学类\",\"创新创业与能力提升\"],\n" +
            "[\"网络技术与应用\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"进化生物学\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"新能源的利用与发展\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"化妆品原理与应用\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"计算机科学技术史\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"走进芳香植物\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"生物学基础实验\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"生物多样性及其保护\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"保鲜技术概论\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"实用药物学\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"性生殖健康与疾病\",\"自然科学类\",\"生命关怀与当代体育\"],\n" +
            "[\"水土保持与城市生活环境\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"室内观赏植物的配置与养护\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"灾害与防灾减灾\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"全球变化\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"微分方程定性理论初步及应用\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"微积分解题技巧与方法\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"线性代数进阶\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"光与现代科技讲座\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"现代电信网络基础\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"奇妙的高分子物理\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"从计算到智能\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"植物的欲望\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"空间信息技术与社会生活\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"3S技术与应用\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"数学美学初论\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"旅游景观赏析\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"趣味天文学\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"纳米科学技术概论\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"可拓学原理与应用\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"旅游地理信息系统\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"地球资源及开发利用\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"趣味数学\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"旅游生态\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"C程序设计案例教程(进阶)\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"图像处理与分析\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"科学的历程\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"奇异的仿生学\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"Java程序设计\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"网络基础与应用\",\"自然科学类\",\"科学精神与技术进步\"],\n" +
            "[\"健康生活 预防疾病-常用医学知识及疾病辨析\",\"自然科学类\",\"生命关怀与当代体育\"],\n" +
            "[\"干细胞——神奇的医学“万用细胞”\",\"自然科学类\",\"生命关怀与当代体育\"],\n" +
            "[\"身边的营养学\",\"自然科学类\",\"生命关怀与当代体育\"],\n" +
            "[\"人体营养与健康和疾病学\",\"自然科学类\",\"生命关怀与当代体育\"],\n" +
            "[\"数码摄影技术及后期制作\",\"体育艺术与技术技能类\",\"创新创业与能力提升\"],\n" +
            "[\"实用节能技术及其应用\",\"体育艺术与技术技能类\",\"科学精神与技术进步\"],\n" +
            "[\"信息时代的学习技术及应用\",\"体育艺术与技术技能类\",\"科学精神与技术进步\"],\n" +
            "[\"中华射艺\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"APP的设计与开发入门\",\"体育艺术与技术技能类\",\"创新创业与能力提升\"],\n" +
            "[\"急救与常见疾病防治\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"零基础学编程-Python\",\"体育艺术与技术技能类\",\"科学精神与技术进步\"],\n" +
            "[\"多媒体技术与PPT设计制作进阶\",\"体育艺术与技术技能类\",\"创新创业与能力提升\"],\n" +
            "[\"计算机网络信息安全技术\",\"体育艺术与技术技能类\",\"科学精神与技术进步\"],\n" +
            "[\"大学生户外教育与心理素质拓展\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"多媒体技术\",\"体育艺术与技术技能类\",\"科学精神与技术进步\"],\n" +
            "[\"office高级实用技巧\",\"体育艺术与技术技能类\",\"创新创业与能力提升\"],\n" +
            "[\"大学生就业指导\",\"体育艺术与技术技能类\",\"创新创业与能力提升\"],\n" +
            "[\"招聘面试技巧\",\"体育艺术与技术技能类\",\"创新创业与能力提升\"],\n" +
            "[\"大学生职业生涯规划\",\"体育艺术与技术技能类\",\"创新创业与能力提升\"],\n" +
            "[\"太极与人生\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"大学生心理拓展\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"沙式武术之八卦掌\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"双人瑜伽\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"田径欣赏\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"大众气排球\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"篮球基础战术运用\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"常见运动伤病的预防与处理\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"体育舞蹈\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"篮球欣赏\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"武术文化欣赏与体验\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"网页设计与制作\",\"体育艺术与技术技能类\",\"创新创业与能力提升\"],\n" +
            "[\"现代办公软件实战\",\"体育艺术与技术技能类\",\"创新创业与能力提升\"],\n" +
            "[\"Photoshop图像处理\",\"体育艺术与技术技能类\",\"创新创业与能力提升\"],\n" +
            "[\"太极拳与中国文化\",\"体育艺术与技术技能类\",\"生命关怀与当代体育\"],\n" +
            "[\"轻松玩转多旋翼无人机\",\"体育艺术与技术技能类\",\"科学精神与技术进步\"],\n" +
            "[\"戏剧鉴赏\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"中国古代陶瓷艺术鉴赏\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"云南古代艺术\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"环球音乐采风\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"戏曲鉴赏\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"经典音乐作品赏析\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"交响音乐常识与鉴赏\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"中国传统音乐赏析\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"经典影视服饰赏析\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"经典美术作品赏析\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"中外服饰设计风格赏析\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"中外艺术精品赏析\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"佛教艺术赏析\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"越剧赏析\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"影视文化\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"花卉鉴赏\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"],\n" +
            "[\"古典园林艺术\",\"体育艺术与技术技能类\",\"人文素养与现代文明\"]\n" +
            "]}";

    public static void initial() {
        try {
            JSONArray jsonArray = (new JSONObject(primeTypeJson)).getJSONArray("data");
            JSONArray jsonArrayTemp;
            String[] strType;
            for (int i = 0; i < jsonArray.length(); i++) {
                jsonArrayTemp = jsonArray.getJSONArray(i);
                strType = new String[2];

                strType[0] = jsonArrayTemp.getString(1);
                strType[1] = jsonArrayTemp.getString(2);

                PRIME_TYPE.put(jsonArrayTemp.getString(0), strType);
                Log.d("STRTYPE", strType[0] + strType[1]);
            }

            Log.d("PRIME_TYPE", PRIME_TYPE.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
