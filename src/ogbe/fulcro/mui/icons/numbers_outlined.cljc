(ns ogbe.fulcro.mui.icons.numbers-outlined
  #?(:cljs (:require
            ["@mui/icons-material/NumbersOutlined" :default NumbersOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-numbers-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NumbersOutlined)))