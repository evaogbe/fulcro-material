(ns ogbe.fulcro.mui.icons.stars-outlined
  #?(:cljs (:require
            ["@mui/icons-material/StarsOutlined" :default StarsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stars-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarsOutlined)))