(ns ogbe.fulcro.mui.icons.storm-outlined
  #?(:cljs (:require
            ["@mui/icons-material/StormOutlined" :default StormOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storm-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StormOutlined)))