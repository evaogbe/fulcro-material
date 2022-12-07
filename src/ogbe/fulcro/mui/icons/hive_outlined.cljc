(ns ogbe.fulcro.mui.icons.hive-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HiveOutlined" :default HiveOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hive-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HiveOutlined)))