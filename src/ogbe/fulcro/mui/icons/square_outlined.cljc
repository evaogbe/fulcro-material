(ns ogbe.fulcro.mui.icons.square-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SquareOutlined" :default SquareOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-square-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SquareOutlined)))