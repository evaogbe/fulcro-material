(ns ogbe.fulcro.mui.icons.code-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CodeOutlined" :default CodeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-code-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CodeOutlined)))