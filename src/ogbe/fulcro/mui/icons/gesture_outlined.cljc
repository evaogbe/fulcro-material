(ns ogbe.fulcro.mui.icons.gesture-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GestureOutlined" :default GestureOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gesture-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GestureOutlined)))