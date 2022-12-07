(ns ogbe.fulcro.mui.icons.gradient-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GradientOutlined" :default GradientOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gradient-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GradientOutlined)))