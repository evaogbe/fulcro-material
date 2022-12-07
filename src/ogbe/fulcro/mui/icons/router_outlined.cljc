(ns ogbe.fulcro.mui.icons.router-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RouterOutlined" :default RouterOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-router-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RouterOutlined)))