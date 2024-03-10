import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

const app = createApp(App)
app.config.globalProperties.$serverUrl = '//localhost:8081' //api server
app.use(router).mount('#app')
