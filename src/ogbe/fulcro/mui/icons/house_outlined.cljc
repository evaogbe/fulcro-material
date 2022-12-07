(ns ogbe.fulcro.mui.icons.house-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HouseOutlined" :default HouseOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-house-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HouseOutlined)))