/**
 * Copyright (c) 2018-2019, Jie Li 李杰 (mqgnsds@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.momo.netty.utils;

import java.util.Random;

/**
 * Created by xsw on 2017/10/12.
 */
public class RandomName {

    public String getRandomName(){
        String[] nameList = { "石榴姐","陈小春","毛利小五郎","黑寡妇","徐长卿","天下","玫瑰花的葬礼","唐唐","八戒",
                "唐老鸭","日向宁次","只想一生跟你走","兔八哥","郭靖","卡卡西","宋国民","风清扬","叶孤城","胖虎","科比",
                "张启山","陆毅","张艺兴","哆啦A梦","陈赫","李大嘴","文章","尹新月","周芷若","你的背包","叹服","小智",
                "圣诞结","大头儿子","白展堂","时光隧道","陈皮阿四","如果爱下去","谢霆锋","遇见","怒放的生命","慢慢","情书",
                "李逍遥","喜欢你","张国荣","黑崎一护","藤原拓海","吴尊","南宫翎","犬夜叉","华莱士","好久不见","我爱罗",
                "夕日红","紫萱","吴亦凡","乔丹","飞得更高","烟花易冷","许褚","包租公","唐雪见","卡布达","何润东","八神太一",
                "发如雪","龟仙人","施瓦辛格","韦德","三国杀","城府","明天过后","马超","灰色头像","天津饭","万有引力",
                "一笑奈何","奈良鹿丸","迈克","景天","史努比","二喜","春野樱","德莱文","潘森","李易峰","胡歌","吕子乔",
                "碧瑶","关羽","龙猫","王语嫣","王力宏","孙悟饭","马天宇","真的爱你","爱情转移","佟大为","真水无香",
                "给我一首歌","小黑","手心的蔷薇","白玫瑰","越前龙马","秋道丁次","海阔天空","杨洋","沈佳宜","伊鲁卡",
                "若曦","小酒窝","稻香","宇智波鼬","李连杰","漩涡鸣人","单车","樱木花道","灰原哀","逆战","绅士","李洛克",
                "马里奥","背对背拥抱","楚云飞","千里之外","雷小冉","江南","怪盗基德","同桌的你","断桥残雪","刘在石",
                "张翰","彭于晏","路飞","鹰眼","孙悟天","李白","大蛇丸","秦明","托尼","魏晨","石田大和","蛤蟆吉","自来也",
                "詹姆斯","桐华","花海","小夫","曹操","苦笑","三井寿","陆雪琪","一起摇摆","郭富城","流氓兔","马丁",
                "夜空中最亮的星","宇智波佐助","冰河","不二周助","这,就是爱","冬狮郎","你若成风","浩克","杨紫曦","米老鼠",
                "苏菲","乔峰","二月红","醉赤壁","高飞","幻听","盖伦","光辉岁月","厄加特","清明雨上","黑猫警长","秋香","阿童木",
                "春天里","霍建华","野比大雄","期待爱","任泉","秦羽墨","天天","千百度","小孩","孔明","听妈妈的话","黄轩",
                "蜘蛛侠","告白气球","不分手的恋爱","芦苇微微","宙斯","阿木木","波比","井博然","邓超","米粒儿","凯南","柯南",
                "赤丸","蓝采和","唐伯虎","晴儿","最美的太阳","小星星","包租婆","佐井","安妮","杨过","贝吉塔","蝙蝠侠","菊花台",
                "周杰伦","爱新觉罗·胤禛","十年","吻别","言承旭","重楼","特兰克斯","徐峥","加菲猫","田灵儿","钢铁侠","西门吹雪",
                "KO","麦兜","小宝","宫水四叶","雅典娜","认真的雪","岁月如歌","库林","饿狼传说","素颜","一千年以后","我怀念的",
                "段誉","东风破","曹光","肖奈","姚明","K歌之王","成龙","浮夸","宫城","木婉清","安迪","风度","安西教练","黄忠",
                "布欧","韦小宝","终于等到你","蜡笔小新","日向雏田","剑心","撒旦","他不懂","林惊羽","郑爽","工藤新一",
                "你是我的眼","张小凡","七里香","木叶丸","萨满","杀生丸","枫","索隆","鹿晗","赵云","星矢","五五开","张飞",
                "悟空","沐之晴","赵灵儿","黄晓明","紫龙","皮卡丘","樱桃小丸子","苏有朋","拉克丝","李青","花火","流川枫",
                "虚竹","爱德华","周星驰","薇恩","海绵宝宝","纲手","郑恺","有点甜","再见","看月亮爬上来","认错","刘备","画心",
                "泡沫","有何不可","薛之谦","双截棍","罗志祥","梅长苏","凯","令狐冲","龙卷风","小熊维尼","何书桓","学不会",
                "小头爸爸","卡卡洛特","你把我灌醉","明明就","比克","德玛西亚","金钟国","美国队长","曾小贤","宫水三叶","吴邪",
                "杰尼龟","超梦","柯震东","赵本山","吴镇宇","权志龙","陈伟霆","钟汉良","郭敬明","陈奕迅","陈学冬","赵又廷",
                "杰森·斯坦森","小沈阳","你的名字","释小龙","林书豪","吴彦祖","井柏然"};
        String name = nameList[new Random().nextInt(nameList.length)];
//        while(cacheName.indexOf(name)!=-1) {
//            name = nameList[new Random().nextInt(nameList.length)];
//        }
        return name;
    }

}
