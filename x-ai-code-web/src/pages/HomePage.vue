<template>
  <div class="home-page">
    <a-card title="欢迎来到 X-AI Code" :bordered="false">
      <p>这是一个基于 Vue 3 + TypeScript + Ant Design Vue 的现代化前端项目。</p>
      <p>项目特点：</p>
      <ul>
        <li>使用 Vue 3 Composition API</li>
        <li>TypeScript 支持</li>
        <li>Ant Design Vue 组件库</li>
        <li>响应式设计</li>
        <li>模块化布局</li>
      </ul>
      <a-button type="primary" @click="handleGetStarted">
        开始使用
      </a-button>
    </a-card>
  </div>
</template>

<script setup lang="ts">
import { health } from '@/api/healthController.ts'

health().then((res)=>{
  console.log(res)
})
const handleGetStarted = () => {
  console.log('开始使用')
}
</script>

<style scoped>
.home-page ul {
  margin: 16px 0;
  padding-left: 20px;
}

.home-page li {
  margin: 8px 0;
}
</style>
