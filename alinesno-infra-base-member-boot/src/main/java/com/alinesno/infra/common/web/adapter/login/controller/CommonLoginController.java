package com.alinesno.infra.common.web.adapter.login.controller;

import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.dto.LoginBodyDto;
import com.alinesno.infra.common.web.adapter.dto.menus.Menu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class CommonLoginController {

    /**
     * 令牌
     */
    public static final String TOKEN = "token";

    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBodyDto loginBody)
    {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = UUID.randomUUID().toString() ;
        ajax.put(TOKEN, token);
        return ajax;
    }

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    @GetMapping("getInfo")
    public AjaxResult getInfo() {

        Map<String, Object> data = new HashMap<>();
        // 将数据填充到data中...
        data.put("permissions", new String[]{"*:*:*"});

        Map<String, Object> user = new HashMap<>();
        user.put("createBy", "admin");
        user.put("createTime", "2023-04-23 16:11:38");
        user.put("updateBy", null);
        user.put("updateTime", null);
        user.put("remark", "管理员");
        user.put("userId", 1);
        user.put("deptId", 103);
        user.put("userName", "admin");
        user.put("nickName", "AIP技术团队");
        user.put("email", "aip-team@163.com");
        user.put("phonenumber", "15888888888");
        user.put("sex", "1");
        user.put("avatar", "");
        user.put("password", "");
        user.put("status", "0");
        user.put("delFlag", "0");
        user.put("loginIp", "");
        user.put("loginDate", "2023-09-21T16:54:12.000+08:00");

        Map<String, Object> dept = new HashMap<>();
        dept.put("createBy", null);
        dept.put("createTime", null);
        dept.put("updateBy", null);
        dept.put("updateTime", null);
        dept.put("remark", null);
        dept.put("deptId", 103);
        dept.put("parentId", 101);
        dept.put("ancestors", "0,100,101");
        dept.put("deptName", "研发部门");
        dept.put("orderNum", 1);
        dept.put("leader", "AIP技术团队");
        dept.put("phone", null);
        dept.put("email", null);
        dept.put("status", "0");
        dept.put("delFlag", null);
        dept.put("parentName", null);
        dept.put("children", new Object[]{});

        user.put("dept", dept);

        Map<String, Object> role = new HashMap<>();
        role.put("createBy", null);
        role.put("createTime", null);
        role.put("updateBy", null);
        role.put("updateTime", null);
        role.put("remark", null);
        role.put("roleId", 1);
        role.put("roleName", "超级管理员");
        role.put("roleKey", "admin");
        role.put("roleSort", 1);
        role.put("dataScope", "1");
        role.put("menuCheckStrictly", false);
        role.put("deptCheckStrictly", false);
        role.put("status", "0");
        role.put("delFlag", null);
        role.put("flag", false);
        role.put("menuIds", null);
        role.put("deptIds", null);
        role.put("permissions", null);
        role.put("admin", true);

        user.put("roles", new Object[]{role});

        AjaxResult ajax = AjaxResult.success();
        ajax.put("user", user);
        ajax.put("roles", user.get("roles"));
        ajax.put("permissions", data.get("permissions"));

        return ajax;
    }

    /**
     * 获取路由信息
     *
     * @return 路由信息
     */
    @GetMapping("getRouters")
    public AjaxResult getRouters()
    {

        Menu dashboardMenu = new Menu("Dashboard", "/dashboard", false, "noRedirect", "Layout", true, new Menu.Meta("仪盘表", "dashboard", false, null), List.of(
                new Menu("Dashboard", "index", false, false , "dashboard", new Menu.Meta("概览", "dashboard", false, null))
        ));

        Menu memberMenu = new Menu("会员管理", "/member", false, "noRedirect", "Layout", true, new Menu.Meta("会员管理", "post", false, null),
                List.of(
                        new Menu("应用管理", "base/member/member/application/index", false, false, "base/member/member/application/index", new Menu.Meta("应用管理", "tree", false, null)),
                        new Menu("会员分组", "base/member/member/memberGroup/index", false, false, "base/member/member/memberGroup/index", new Menu.Meta("会员分组", "tree", false, null)),
                        new Menu("会员管理", "base/member/member/members/index", false, false, "base/member/member/members/index", new Menu.Meta("会员管理", "user", false, null)),
                        new Menu("会员等级", "base/member/member/memberLevel/index", false, false, "base/member/member/memberLevel/index", new Menu.Meta("会员等级", "user", false, null)),
                        new Menu("初始赠礼", "base/member/member/memberGift/index", false, false, "base/member/member/memberGift/index", new Menu.Meta("开发赠礼", "user", false, null)),
                        new Menu("会员设置", "base/member/member/memberSettings/index", false, false, "base/member/member/memberSettings/index", new Menu.Meta("会员设置", "user", false, null))
                ));

        Menu couponMenu = new Menu("卡卷管理", "/card", false, "noRedirect", "Layout", true, new Menu.Meta("卡卷管理", "post", false, null),
                List.of(
                        new Menu("分组管理", "base/member/card/couponGroup/index", false, false, "base/member/card/couponGroup/index", new Menu.Meta("分组管理", "tree", false, null)),
                        new Menu("卡卷核销", "base/member/card/couponVerification/index", false, false, "base/member/card/couponVerification/index", new Menu.Meta("卡卷核销", "user", false, null)),
                        new Menu("卡卷管理", "base/member/card/couponManagement/index", false, false, "base/member/card/couponManagement/index", new Menu.Meta("卡卷管理", "user", false, null)),
                        new Menu("会员卡卷", "base/member/card/memberCoupon/index", false, false, "base/member/card/memberCoupon/index", new Menu.Meta("会员卡卷", "user", false, null)),
                        new Menu("发券记录", "base/member/card/couponRecords/index", false, false, "base/member/card/couponRecords/index", new Menu.Meta("发券记录", "user", false, null)),
                        new Menu("转赠记录", "base/member/card/giftRecords/index", false, false, "base/member/card/giftRecords/index", new Menu.Meta("转赠记录", "user", false, null))
                ));

        Menu rechargeMenu = new Menu("充值管理", "/recharge", false, "noRedirect", "Layout", true, new Menu.Meta("充值管理", "post", false, null),
                List.of(
                        new Menu("充值设置", "base/member/recharge/rechargeSettings/index", false, false, "base/member/recharge/rechargeSettings/index", new Menu.Meta("充值设置", "tree", false, null)),
                        new Menu("余额明细", "base/member/recharge/balanceDetails/index", false, false, "base/member/recharge/balanceDetails/index", new Menu.Meta("余额明细", "user", false, null)),
                        new Menu("会员充值", "base/member/recharge/memberRecharge/index", false, false, "base/member/recharge/memberRecharge/index", new Menu.Meta("会员充值", "user", false, null))
                ));

        Menu pointsMenu = new Menu("积分管理", "/point", false, "noRedirect", "Layout", true, new Menu.Meta("积分管理", "post", false, null),
                List.of(
                        new Menu("积分设置", "base/member/point/pointsSettings/index", false, false, "base/member/point/pointsSettings/index", new Menu.Meta("积分设置", "tree", false, null)),
                        new Menu("积分明细", "base/member/point/pointsDetails/index", false, false, "base/member/point/pointsDetails/index", new Menu.Meta("积分明细", "user", false, null))
                ));

        List<Menu> menus = List.of(dashboardMenu , memberMenu, couponMenu , rechargeMenu , pointsMenu) ;

        return AjaxResult.success(menus) ;
    }
}