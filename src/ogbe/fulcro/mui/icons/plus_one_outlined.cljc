(ns ogbe.fulcro.mui.icons.plus-one-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PlusOneOutlined" :default PlusOneOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-plus-one-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlusOneOutlined)))