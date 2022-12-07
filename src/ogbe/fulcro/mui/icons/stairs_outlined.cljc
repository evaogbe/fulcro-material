(ns ogbe.fulcro.mui.icons.stairs-outlined
  #?(:cljs (:require
            ["@mui/icons-material/StairsOutlined" :default StairsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stairs-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StairsOutlined)))