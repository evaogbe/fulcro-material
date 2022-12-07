(ns ogbe.fulcro.mui.icons.toll-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TollOutlined" :default TollOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toll-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TollOutlined)))