(ns ogbe.fulcro.mui.icons.api-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ApiOutlined" :default ApiOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-api-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ApiOutlined)))