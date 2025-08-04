<template>
  <a-layout class="basic-layout">
    <!-- 顶部导航栏 -->
    <GlobalHeader />

    <!-- 中间内容区域 -->
    <a-layout-content class="layout-content">
      <a-row justify="center">
        <a-col :xs="24" :sm="22" :md="20" :lg="18" :xl="16">
          <router-view />
        </a-col>
      </a-row>
    </a-layout-content>

    <!-- 底部版权信息 -->
    <GlobalFooter />
  </a-layout>
</template>

<script setup lang="ts">
import GlobalHeader from '@/components/GlobalHeader.vue'
import GlobalFooter from '@/components/GlobalFooter.vue'
</script>

<style scoped>
.basic-layout {
  min-height: 100vh;
}

.layout-content {
  padding: 28px;
  background: linear-gradient(to right, #fefefe, #fff);
  margin-bottom: 30px;
  min-height: calc(100vh - 64px - 70px); /* 减去header和footer的高度 */
}

/* 响应式设计 */
@media (max-width: 768px) {
  .layout-content {
    padding: 16px;
  }
}

@media (max-width: 576px) {
  .layout-content {
    padding: 12px;
  }
}
</style>
