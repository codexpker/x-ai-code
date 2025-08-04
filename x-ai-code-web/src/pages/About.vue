<template>
  <div class="about-page">
    <a-card title="关于我们" :bordered="false">
      <a-descriptions :column="1" bordered>
        <a-descriptions-item label="项目名称">
          X-AI Code
        </a-descriptions-item>
        <a-descriptions-item label="版本">
          1.0.0
        </a-descriptions-item>
        <a-descriptions-item label="技术栈">
          Vue 3 + TypeScript + Ant Design Vue + Vite
        </a-descriptions-item>
        <a-descriptions-item label="开发者">
          xpker
        </a-descriptions-item>
        <a-descriptions-item label="描述">
          这是一个现代化的前端项目模板，提供了完整的布局系统和组件库集成。
        </a-descriptions-item>
      </a-descriptions>
      
      <div class="contact-info">
        <h3>联系方式</h3>
        <p>邮箱：contact@example.com</p>
        <p>GitHub：<a href="https://github.com/xpker" target="_blank">https://github.com/xpker</a></p>
      </div>
    </a-card>
  </div>
</template>

<script setup lang="ts">
// 无需额外的逻辑
</script>

<style scoped>
.contact-info {
  margin-top: 24px;
  padding-top: 24px;
  border-top: 1px solid #f0f0f0;
}

.contact-info h3 {
  margin-bottom: 16px;
  color: #1890ff;
}

.contact-info p {
  margin: 8px 0;
}
</style> 