# X-AI Code Web

这是一个基于 Vue 3 + TypeScript + Ant Design Vue 的现代化前端项目。

## 项目特点

- 🚀 Vue 3 Composition API
- 📝 TypeScript 支持
- 🎨 Ant Design Vue 组件库
- 📱 响应式设计
- 🏗️ 模块化布局系统

## 项目结构

```
src/
├── components/          # 全局组件
│   ├── GlobalHeader.vue # 全局头部组件
│   └── GlobalFooter.vue # 全局底部组件
├── layouts/             # 布局组件
│   └── BasicLayout.vue  # 基础布局组件
├── views/               # 页面组件
│   ├── Home.vue         # 首页
│   ├── Projects.vue     # 项目页面
│   └── About.vue        # 关于页面
├── router/              # 路由配置
├── stores/              # 状态管理
├── App.vue              # 根组件
└── main.ts              # 入口文件
```

## 布局系统

项目采用上中下三段式布局：

- **顶部导航栏**：包含 Logo、网站标题、导航菜单和用户信息
- **中间内容区**：根据路由动态切换页面内容
- **底部版权**：固定在底部的版权信息

## 开发

```bash
# 安装依赖
npm install

# 启动开发服务器
npm run dev

# 构建生产版本
npm run build

# 预览生产版本
npm run preview
```

## 技术栈

- Vue 3.5.18
- TypeScript 5.8.0
- Ant Design Vue 4.2.6
- Vue Router 4.5.1
- Pinia 3.0.3
- Vite 7.0.6

## 开发者

Copyright by xpker
