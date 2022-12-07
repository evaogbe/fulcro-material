(ns ogbe.fulcro.mui.icons.hd-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HdOutlined" :default HdOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hd-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdOutlined)))