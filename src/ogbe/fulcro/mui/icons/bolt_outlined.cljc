(ns ogbe.fulcro.mui.icons.bolt-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BoltOutlined" :default BoltOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bolt-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BoltOutlined)))